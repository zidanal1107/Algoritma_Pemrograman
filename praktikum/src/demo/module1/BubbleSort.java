package demo.module1;

import demo.Print;

public class BubbleSort implements Print {
    private int[] data;
    private String[] name;

    public void Ascending(int[] data, String[] name) {
        this.data = data;
        this.name = name;
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

                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;
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
    public void Descending(int[] data, String[] name) {
        this.data = data;
        this.name = name;
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

                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;
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
        for (int i=0;i< data.length;i++) {
            System.out.print(name[i] + " - " + data[i]+ "M | ");
        }
    }
}
