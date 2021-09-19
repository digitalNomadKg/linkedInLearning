package algorithms.insertionsort;

public class InsertionSort {

    public static int[] insertionSort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }


    public static void main(String[] args) {
        int[] array = {43, 42, 25, 6, 7, 944, 8, 0, 6,};
        int[] sortedArray = insertionSort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]);
            System.out.print(", ");
        }
    }
}
