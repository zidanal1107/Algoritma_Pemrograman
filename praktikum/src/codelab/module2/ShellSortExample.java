package codelab.module2;

public class ShellSortExample {
    public static void main(String[] args) {
        int[] data = {2, 10, 3, 1, 17, 25,16, 9, 18};

        int n = data.length;

        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                int temp = data[i];
                int j = i;

                while (j >= gap && data[j - gap] > temp) {
                    data[j] = data[j - gap];
                    j -= gap;
                }

                data[j] = temp;
            }

            System.out.print("Gap " + gap + ": ");
            for (int value : data) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}