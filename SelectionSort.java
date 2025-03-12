
import java.util.*;

class SelectionSort {
static void Selection(int[] arr) {
       
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 111};
        System.err.println("Sorted Array Array");

        Selection(arr);
        System.err.println(Arrays.toString(arr));

    }

}
