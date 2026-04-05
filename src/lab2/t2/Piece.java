package lab2.t2;

public abstract class Piece {
    Position a;
    public Piece(Position a) {
        this.a = a;
    }

    public abstract boolean isLegalMove(Position a);

}
