package lab2.t2;

public class Main {

    public static void main(String[] args) {

        Position start = new Position(1,1);
        Position end = new Position(1,5);

        Rook rook = new Rook(start);

        System.out.println(rook.isLegalMove(end));

    }

}