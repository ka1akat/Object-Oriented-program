package lab2.t2;

public class Pawn extends Piece {

    public Pawn(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return a.x == b.x && b.y == a.y + 1;
    }

}
