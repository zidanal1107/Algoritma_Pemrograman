package demo.module1;

import demo.Print;

public class SelectionSort implements Print {
    private int[] data;
    private String[] name;

    public void Ascending(int[] data,String[] name) {
        this.data = data;
        this.name = name;
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

            String tempName = name[minIdx];
            name[minIdx] = name[i];
            name[i] = tempName;
            System.out.printf("Iteration #%d\t\t : ", i+1);
            printData();
            System.out.println();
        }
        System.out.print("After selection sort : ");
        printData();
        System.out.println();
    }
    public void Descending(int[] data, String[] name) {
        this.data = data;
        this.name = name;
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

            String tempName = name[maxIdx];
            name[maxIdx] = name[i];
            name[i] = tempName;
            System.out.printf("Iteration #%d\t\t : ", i+1);
            printData();
            System.out.println();
        }
        System.out.print("After selection sort : ");
        printData();
        System.out.println();
    }
    public void printData() {
        for (int i=0;i< data.length;i++) {
            System.out.print(name[i] + " - "+data[i]+"M | ");
        }
    }
}
