package demo.module1;

public class SelectionSort {
    private int[] data;

    public void Ascending(int[] data) {
        this.data = data;
        int lengthData = data.length;
        System.out.print("Before selection sort: ");
        printData();
        System.out.println();
        for (int i = 0; i < lengthData; i++) {
            int minIdx = i;
            for (int j = i + 1; j < lengthData; j++) {
                if (data[j] < data[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = data[minIdx];
            data[minIdx] = data[i];
            data[i] = temp;
            System.out.printf("Iteration #%d\t\t : ", i+1);
            printData();
            System.out.println();
        }
        System.out.print("After selection sort : ");
        printData();
        System.out.println();
    }
    public void Descending(int[] data) {
        this.data = data;
        int lengthData = data.length;
        System.out.print("Before selection sort: ");
        printData();
        System.out.println();
        for (int i = 0; i < lengthData; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < lengthData; j++) {
                if (data[j] > data[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = data[maxIdx];
            data[maxIdx] = data[i];
            data[i] = temp;
            System.out.printf("Iteration #%d\t\t : ", i+1);
            printData();
            System.out.println();
        }
        System.out.print("After selection sort : ");
        printData();
        System.out.println();
    }
    public void printData() {
        for (int d : data) {
            System.out.print(d + " ");
        }
    }
}
