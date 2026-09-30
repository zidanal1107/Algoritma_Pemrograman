package module1.codelab;

public class SelectionSort {
    int[] arr;
    public SelectionSort(int[] arr) {
        this.arr=arr;
        int lengthArr = arr.length;
        for (int i=0;i < lengthArr-1;i++) {
            int minIndx = i;
            for (int j = i + 1; j < lengthArr; j++) {
                if (arr[j] > arr[minIndx]) {
                    minIndx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
        }
    }
    public void printArray() {
        for (int a: arr) {
            System.out.print(a+" ");
        }
    }
}
