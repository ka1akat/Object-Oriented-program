package pr4.interfaces;
import pr4.interfaces.Sortable;

public class CountingSortService implements Sortable {
    public int[] sort(int[] array) {
        int[] count = new int[11]; 
        
        for(int i = 0; i<array.length; i++) {
        	count[array[i]]++;
        }

        int[] sorted = new int[array.length];
        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sorted[index] = i;
                index++;
                count[i]--;
            }
        }

        return sorted;
    }
}