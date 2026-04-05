package lab2.t2;

public class Queen extends Piece {

    public Queen(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {

        boolean rookMove = a.x == b.x || a.y == b.y;
        boolean bishopMove = Math.abs(a.x - b.x) == Math.abs(a.y - b.y);

        return rookMove || bishopMove;
    }

}