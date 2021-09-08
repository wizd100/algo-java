package algo.java.basic.sort;

public class Insertion {
    public int[] InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > temp) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = temp;
        }

        return arr;
    }
}
