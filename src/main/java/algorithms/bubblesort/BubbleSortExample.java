package algorithms.bubblesort;

public class BubbleSortExample {

    int bubbleSort(int[] array) {
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

        BubbleSortExample bubbleSortExample = new BubbleSortExample();

        int k[] = {4, 2, 6, 66, 41, 89,9};
        bubbleSortExample.bubbleSort(k);



    }


}

