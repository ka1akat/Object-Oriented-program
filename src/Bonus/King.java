package Bonus;

public class King extends Piece {

    public King(Color color) {
        super(color, 'K');
    }

    @Override
    public boolean isValidMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        int dr = Math.abs(toRow - fromRow);
        int dc = Math.abs(toCol - fromCol);

        return dr <= 1 && dc <= 1;
    }
}
