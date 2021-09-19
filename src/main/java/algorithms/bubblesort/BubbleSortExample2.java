package algorithms.bubblesort;

public class BubbleSortExample2 {


    public static void bubbleSort(int[] array) {
        int n = array.length - 1;
        int k;

        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapMe(i, k, array);
                }
            }
            printNumbers(array);
        }


    }


    private static void swapMe(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    private static void printNumbers(int[] input) {
        for (int i : input) {
            System.out.print(i + ", "); //enhanced for loop
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {

        int[] z = {4, 2, 5, 78, 0, 3, 135, 3};
        bubbleSort(z);

    }

}
