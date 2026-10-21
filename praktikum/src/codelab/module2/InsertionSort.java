package codelab.module2;

public class InsertionSort {
    private int[] arr;

    public void Ascending(int[] arr) {
        this.arr=arr;
        int n= arr.length;
        for (int i=0;i<n;i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        print(arr);
    }
    public void Descending(int[] arr) {
        this.arr=arr;
        int n= arr.length;
        for (int i=0;i<n;i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]<key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        print(arr);
    }

    public void print(int[] Arr) {
        for (int a : Arr) {
            System.out.print(a);
        }
        System.out.println();
    }
}
