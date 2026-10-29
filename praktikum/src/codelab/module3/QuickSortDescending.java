package codelab.module3;

public class QuickSortDescending {

    public static int partition(int[] arr, int low, int high) {
        // Pilih elemen pivot
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Perbandingan untuk urutan descending
            if (arr[j] >= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        // Kondisi base case
        if (low < high) {
            // Lakukan partitioning dan simpan indeks pivot
            int pivotIndex = partition(arr, low, high);

            // Mengurutkan bagian kiri pivot
            quickSort(arr, low, pivotIndex - 1);

            // Mengurutkan bagian kanan pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] data = {10, 7, 8, 9, 1, 5};

        // Pemanggilan awal Quick Sort
        quickSort(data, 0, data.length - 1);

        System.out.print("Sorted Array (Descending): ");

        for (int value : data) {
            System.out.print(value + " ");
        }
    }
}
