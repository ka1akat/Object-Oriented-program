package pr4.interfaces;

import pr4.interfaces.ArrayData;
import pr4.interfaces.CountingSortService;

public class main {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 4, 0, 10, 3, 2, 7};

        ArrayData data = new ArrayData(numbers);
        CountingSortService service = new CountingSortService();

        int[] sorted = service.sort(data.getArray());

        System.out.println("Sorted:");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}
