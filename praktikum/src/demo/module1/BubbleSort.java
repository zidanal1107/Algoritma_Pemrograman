package demo.module1;

public class BubbleSort {
    private int[] data;

    public void Ascending(int[] data) {
        this.data = data;
        int lengthData = data.length;
        System.out.print("Before bubble sort: ");
        printData();
        System.out.println();
        for (int i = 0; i < lengthData; i++) {
            boolean swapped = false;
            for (int j = 0; j < lengthData - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
            System.out.printf("Iteration #%d\t  : ", i + 1);
            printData();
            System.out.println();
        }
        System.out.print("After bubble sort : ");
        printData();
        System.out.println();
    }
    public void Descending(int[] data) {
        this.data = data;
        int lengthData = data.length;
        System.out.print("Before bubble sort: ");
        printData();
        System.out.println();
        for (int i = 0; i < lengthData; i++) {
            boolean swapped = false;
            for (int j = 0; j < lengthData - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
            System.out.printf("Iteration #%d\t  : ", i + 1);
            printData();
            System.out.println();
        }
        System.out.print("After bubble sort : ");
        printData();
        System.out.println();
    }
    public void printData() {
        for (int d : data) {
            System.out.print(d + " ");
        }
    }
}
