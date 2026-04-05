package Bonus;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color, 'P');
    }

    @Override
    public boolean isValidMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        int direction = (color == Color.WHITE) ? -1 : 1;
        int startRow = (color == Color.WHITE) ? 6 : 1;

        Piece target = board.getPiece(toRow, toCol);

        if (fromCol == toCol && toRow == fromRow + direction && target == null) {
            return true;
        }

        if (fromCol == toCol
                && fromRow == startRow
                && toRow == fromRow + 2 * direction
                && target == null
                && board.getPiece(fromRow + direction, fromCol) == null) {
            return true;
        }

        if (Math.abs(toCol - fromCol) == 1
                && toRow == fromRow + direction
                && target != null
                && target.getColor() != color) {
            return true;
        }

        return false;
    }
}
