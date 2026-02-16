package pr1;

public class pr2_tr {
    private int width;

    public pr2_tr(int width) {
        this.width = width;
    }

    public String toString() {

        String result = "";

        for (int i = 1; i <= width; i++) {

            for (int j = 1; j <= i; j++) {
                result += "[*]";
            }

            result += "\n";
        }

        return result;
    }

}
