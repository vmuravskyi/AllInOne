package epam.qaSummer.Other.SortAlgorithms;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}
