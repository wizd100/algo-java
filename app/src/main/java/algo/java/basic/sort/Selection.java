package algo.java.basic.sort;

public class Selection {
    public int[] selectionSort(int[] arr) {
        int indexMin;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[indexMin] > arr[j]) {
                    indexMin = j;
                }
            }

            temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }
        
        return arr;
    }
}
