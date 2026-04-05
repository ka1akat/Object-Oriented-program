package Bonus;

import java.util.Scanner;

public class Board {
    private Piece[][] board;
    private Color currentTurn;

    public Board() {
        board = new Piece[8][8];
        currentTurn = Color.WHITE;
        initializeBoard();
    }

    public Piece getPiece(int row, int col) {
        if (!isInsideBoard(row, col)) {
            return null;
        }
        return board[row][col];
    }

    public boolean isInsideBoard(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }

    private void initializeBoard() {
        board[0][0] = new Rook(Color.BLACK);
        board[0][1] = new Knight(Color.BLACK);
        board[0][2] = new Bishop(Color.BLACK);
        board[0][3] = new Queen(Color.BLACK);
        board[0][4] = new King(Color.BLACK);
        board[0][5] = new Bishop(Color.BLACK);
        board[0][6] = new Knight(Color.BLACK);
        board[0][7] = new Rook(Color.BLACK);

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(Color.BLACK);
        }

        board[7][0] = new Rook(Color.WHITE);
        board[7][1] = new Knight(Color.WHITE);
        board[7][2] = new Bishop(Color.WHITE);
        board[7][3] = new Queen(Color.WHITE);
        board[7][4] = new King(Color.WHITE);
        board[7][5] = new Bishop(Color.WHITE);
        board[7][6] = new Knight(Color.WHITE);
        board[7][7] = new Rook(Color.WHITE);

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(Color.WHITE);
        }
    }

    public void printBoard() {
        System.out.println();
        System.out.println("    a   b   c   d   e   f   g   h");
        System.out.println("  +---+---+---+---+---+---+---+---+");

        for (int row = 0; row < 8; row++) {
            System.out.print((8 - row) + " |");
            for (int col = 0; col < 8; col++) {
                if (board[row][col] == null) {
                    System.out.print("   |");
                } else {
                    System.out.print(" " + board[row][col].getSymbol() + " |");
                }
            }
            System.out.println(" " + (8 - row));
            System.out.println("  +---+---+---+---+---+---+---+---+");
        }

        System.out.println("    a   b   c   d   e   f   g   h");
        System.out.println();
    }

    public boolean isPathClear(int fromRow, int fromCol, int toRow, int toCol) {
        int rowStep = Integer.compare(toRow, fromRow);
        int colStep = Integer.compare(toCol, fromCol);

        int currentRow = fromRow + rowStep;
        int currentCol = fromCol + colStep;

        while (currentRow != toRow || currentCol != toCol) {
            if (board[currentRow][currentCol] != null) {
                return false;
            }
            currentRow += rowStep;
            currentCol += colStep;
        }

        return true;
    }

    public boolean movePiece(String move) {
        if (move == null || move.length() != 4) {
            System.out.println("Формат хода должен быть, например: e2e4");
            return false;
        }

        int fromCol = move.charAt(0) - 'a';
        int fromRow = 8 - (move.charAt(1) - '0');
        int toCol = move.charAt(2) - 'a';
        int toRow = 8 - (move.charAt(3) - '0');

        if (!isInsideBoard(fromRow, fromCol) || !isInsideBoard(toRow, toCol)) {
            System.out.println("Координаты вне доски!");
            return false;
        }

        Piece piece = board[fromRow][fromCol];

        if (piece == null) {
            System.out.println("На начальной клетке нет фигуры!");
            return false;
        }

        if (piece.getColor() != currentTurn) {
            System.out.println("Сейчас ход " + currentTurn + "!");
            return false;
        }

        Piece target = board[toRow][toCol];
        if (target != null && target.getColor() == piece.getColor()) {
            System.out.println("Нельзя бить свою фигуру!");
            return false;
        }

        if (!piece.isValidMove(this, fromRow, fromCol, toRow, toCol)) {
            System.out.println("Недопустимый ход для этой фигуры!");
            return false;
        }

        Piece captured = board[toRow][toCol];
        board[toRow][toCol] = piece;
        board[fromRow][fromCol] = null;

        if (isKingInCheck(currentTurn)) {
            board[fromRow][fromCol] = piece;
            board[toRow][toCol] = captured;
            System.out.println("Нельзя делать ход: ваш король окажется под шахом!");
            return false;
        }

        if (piece instanceof Pawn) {
            if ((piece.getColor() == Color.WHITE && toRow == 0)
                    || (piece.getColor() == Color.BLACK && toRow == 7)) {
                board[toRow][toCol] = new Queen(piece.getColor());
                System.out.println("Пешка превращена в ферзя!");
            }
        }

        Color opponent = (currentTurn == Color.WHITE) ? Color.BLACK : Color.WHITE;
        if (isKingInCheck(opponent)) {
            System.out.println("CHECK! Король " + opponent + " под шахом!");
        }

        currentTurn = opponent;
        return true;
    }

    public boolean isKingInCheck(Color kingColor) {
        Position kingPos = findKing(kingColor);

        if (kingPos == null) {
            return false;
        }

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = board[row][col];
                if (piece != null && piece.getColor() != kingColor) {
                    if (piece.isValidMove(this, row, col, kingPos.row, kingPos.col)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private Position findKing(Color color) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = board[row][col];
                if (piece instanceof King && piece.getColor() == color) {
                    return new Position(row, col);
                }
            }
        }
        return null;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chess game");
        System.out.println("Формат ввода хода: e2e4");
        System.out.println("Выйти: exit");

        while (true) {
            printBoard();
            System.out.print("Ход " + currentTurn + ": ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Игра завершена.");
                break;
            }

            movePiece(input);
        }

        scanner.close();
    }
}
