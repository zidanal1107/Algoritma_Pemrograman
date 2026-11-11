package demo.module2;

public class ShellSort {
    private int[] data;
    private String[] name;

    public void Ascending(int[] data, String[] name) {
        this.data = data;
        this.name = name;
        int n = data.length;
        System.out.print("Before shell sort: ");
        printData();
        System.out.println();
        int it = 1;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = data[i];
                String nameTemp = name[i];
                int j = i;
                while (j >= gap && data[j - gap] > temp) {
                    data[j] = data[j - gap];
                    name[j] = name[j - gap];
                    j -= gap;
                }
                data[j] = temp;
                name[j] = nameTemp;
            }
            System.out.printf("Iteration #%d\t  : ", it++);
            printData();
            System.out.println();
        }
        System.out.print("After shell sort: ");
        printData();
        System.out.println();
    }
    public void Descending(int[] data, String[] name) {
        this.data = data;
        this.name = name;
        int n = data.length;
        System.out.print("Before shell sort: ");
        printData();
        System.out.println();
        int it = 1;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = data[i];
                String nameTemp = name[i];
                int j = i;
                while (j >= gap && data[j - gap] < temp) {
                    data[j] = data[j - gap];
                    name[j] = name[j - gap];
                    j -= gap;
                }
                data[j] = temp;
                name[j] = nameTemp;
            }
            System.out.printf("Iteration #%d\t  : ", it++);
            printData();
            System.out.println();
        }
        System.out.print("After shell sort: ");
        printData();
        System.out.println();
    }

    public void printData() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(name[i] + " - " + data[i] + "M | ");
        }
    }
}
