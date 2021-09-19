package algorithms.selectsort;

public class SelectionSort {

    public static int [] selectioSort(int [] array){
        for(int i=0; i< array.length-1;i++){
            int index = i;
            for(int j =i+1;j<array.length;j++){
                if(array[j]<array[index]){
                    index=j;
                }
            }

            int small = array[index];
            array[index] = array[i];
            array[i] = small;
        }

        return array;
    }



    public static void main(String[] args) {

        int [] array = {10,1,4,46,89,543,906,31};
        int [] sortedArray = selectioSort(array);
        for(int i=0;i<sortedArray.length;i++){
            System.out.print(sortedArray[i]);
            System.out.print(", ");
        }

    }




}
