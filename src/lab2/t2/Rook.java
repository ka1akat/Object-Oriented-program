package lab2.t2;

public class Rook extends Piece {

    public Rook(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return a.x == b.x || a.y == b.y;
    }

}
