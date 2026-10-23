package demo.module2;

import demo.Print;

public class InsertionSort implements Print {
    private int[] data;
    private String[] name;

    public void Ascending(int[] data, String[] name) {
        this.data = data;
        this.name = name;
        int n = data.length;
        System.out.print("Before insertion sort:");
        printData();
        System.out.println();
        for (int i = 1; i < n; i++) {
            int key = data[i];
            String nameKey = name[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                name[j + 1] = name[j];
                j =j-1;
            }
            data[j + 1] = key;
            name[j + 1] = nameKey;
            System.out.printf("Iteration #%d\t  : ", i + 1);
            printData();
            System.out.println();
        }
        System.out.print("After insertion sort: ");
        printData();
        System.out.println();
    }
    public void Descending(int[] data, String[] name) {
        this.data = data;
        this.name = name;
        int n = data.length;
        System.out.print("Before insertion sort:");
        printData();
        System.out.println();
        for (int i = 1; i < n; i++) {
            int key = data[i];
            String nameKey = name[i];
            int j = i - 1;
            while (j >= 0 && data[j] < key) {
                data[j + 1] = data[j];
                name[j + 1] = name[j];
                j =j-1;
            }
            data[j + 1] = key;
            name[j + 1] = nameKey;
            System.out.printf("Iteration #%d\t  : ", i + 1);
            printData();
            System.out.println();
        }
        System.out.print("After insertion sort: ");
        printData();
        System.out.println();
    }

    public void printData() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(name[i] + " - " + data[i] + "M | ");
        }
    }
}
