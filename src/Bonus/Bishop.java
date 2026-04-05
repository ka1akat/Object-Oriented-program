package Bonus;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color, 'B');
    }

    @Override
    public boolean isValidMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        if (Math.abs(toRow - fromRow) != Math.abs(toCol - fromCol)) {
            return false;
        }

        return board.isPathClear(fromRow, fromCol, toRow, toCol);
    }
}
