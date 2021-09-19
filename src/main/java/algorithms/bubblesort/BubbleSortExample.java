package algorithms.bubblesort;

public class BubbleSortExample {

    public static int bubbleSort(int[] array) {
        int n = array.length;
        int temporary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    temporary = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temporary;
                }
            }
        }
        return n;
    }


    public static void main(String[] args) {

        int k[] = {23, 341, 45, 1, 0, 3, 47, 45, 9};

        bubbleSort(k);

    }


}

