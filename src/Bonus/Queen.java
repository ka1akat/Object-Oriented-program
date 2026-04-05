package Bonus;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color, 'Q');
    }

    @Override
    public boolean isValidMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        boolean straight = (fromRow == toRow || fromCol == toCol);
        boolean diagonal = Math.abs(toRow - fromRow) == Math.abs(toCol - fromCol);

        if (!straight && !diagonal) {
            return false;
        }

        return board.isPathClear(fromRow, fromCol, toRow, toCol);
    }
}
