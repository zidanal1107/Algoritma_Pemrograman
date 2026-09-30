package module1.codelab;

public class BubbleSort {
    int[] arr;
    public BubbleSort(int[] arr) {
        this.arr = arr;
        int lengthArr = arr.length-1;
        boolean swepped;
        for (int i=0;i<lengthArr;i++) {
            swepped=false;
            for (int j=0;j<lengthArr;j++) {
                if (arr[j+1]>arr[j]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swepped=true;
                }
            }
            if (!swepped) return;
        }
    }
    public void printArray() {
        for (int a: arr) {
            System.out.print(a+" ");
        }
    }
}
