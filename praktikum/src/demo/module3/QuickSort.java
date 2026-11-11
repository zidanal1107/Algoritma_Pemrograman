package demo.module3;

public class QuickSort {
    int iterasi;

    public void Ascending(int[] arr, String[] name) {
        iterasi = 1;
        System.out.print("Before quick sort: ");
        printData(arr, name);

        quickSortAs(arr, name, 0, arr.length - 1);

        System.out.print("After quick sort : ");
        printData(arr, name);
    }

    public void Descending(int[] arr, String[] name) {
        iterasi = 1;
        System.out.print("Before quick sort: ");
        printData(arr, name);

        quickSortDe(arr, name, 0, arr.length - 1);

        System.out.print("After quick sort : ");
        printData(arr, name);
    }

    // ===================== ASCENDING =====================
    public int partitionAscending(int[] arr, String[] name, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                String tempName = name[i];
                name[i] = name[j];
                name[j] = tempName;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        String tempName = name[i + 1];
        name[i + 1] = name[high];
        name[high] = tempName;

        return i + 1;
    }

    public void quickSortAs(int[] arr, String[] name, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionAscending(arr, name, low, high);

            System.out.printf("Iteration #%d\t  : ", iterasi++);
            printData(arr, name);

            quickSortAs(arr, name, low, pivotIndex - 1);
            quickSortAs(arr, name, pivotIndex + 1, high);
        }
    }

    // ===================== DESCENDING =====================
    public int partitionDescending(int[] arr, String[] name, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                String tempName = name[i];
                name[i] = name[j];
                name[j] = tempName;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        String tempName = name[i + 1];
        name[i + 1] = name[high];
        name[high] = tempName;

        return i + 1;
    }

    public void quickSortDe(int[] arr, String[] name, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionDescending(arr, name, low, high);

            System.out.printf("Iteration #%d\t  : ", iterasi++);
            printData(arr, name);

            quickSortDe(arr, name, low, pivotIndex - 1);

            quickSortDe(arr, name, pivotIndex + 1, high);
        }
    }

    // ===================== TAMPILAN =====================
    public void printData(int[] arr, String[] name) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(name[i] + " - " + arr[i] + "M | ");
        }
        System.out.println();
    }
}