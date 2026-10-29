package codelab.module3;

public class MergeSortDescending {

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Perbandingan untuk urutan descending
        while (i < n1 && j < n2) {
            if (leftArray[i] >= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Menyalin sisa elemen array kiri
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Menyalin sisa elemen array kanan
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        // Kondisi base case
        if (left < right) {

            // Menghitung indeks tengah
            int mid = left + (right - left) / 2;

            // Pemanggilan rekursif untuk sub-array kiri
            mergeSort(arr, left, mid);

            // Pemanggilan rekursif untuk sub-array kanan
            mergeSort(arr, mid + 1, right);

            // Menggabungkan kedua sub-array
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] data = {38, 27, 43, 3};

        mergeSort(data, 0, data.length - 1);

        System.out.print("Sorted Array (Descending): ");

        for (int value : data) {
            System.out.print(value + " ");
        }
    }
}