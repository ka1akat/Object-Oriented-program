package Bonus;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color, 'R');
    }

    @Override
    public boolean isValidMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        if (fromRow != toRow && fromCol != toCol) {
            return false;
        }

        return board.isPathClear(fromRow, fromCol, toRow, toCol);
    }
}
