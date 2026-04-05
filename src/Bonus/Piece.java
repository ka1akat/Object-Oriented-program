package Bonus;

public abstract class Piece {
    protected Color color;
    protected char symbol;

    public Piece(Color color, char symbol) {
        this.color = color;
        this.symbol = symbol;
    }

    public Color getColor() {
        return color;
    }

    public char getSymbol() {
        return color == Color.WHITE
                ? Character.toUpperCase(symbol)
                : Character.toLowerCase(symbol);
    }

    public abstract boolean isValidMove(Board board, int fromRow, int fromCol, int toRow, int toCol);
}
