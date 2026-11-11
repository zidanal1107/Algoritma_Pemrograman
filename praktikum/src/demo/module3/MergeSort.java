package demo.module3;

public class MergeSort {
    int iterasi;
    public void Ascending(int[] arr, String[] name) {
        iterasi = 1;
        System.out.print("Before merge sort: ");
        printData(arr, name);

        mergeSortAs(arr, name, 0, arr.length - 1);

        System.out.print("After merge sort : ");
        printData(arr, name);
    }

    public void Descending(int[] arr, String[] name) {
        iterasi = 1;
        System.out.print("Before merge sort: ");
        printData(arr, name);

        mergeSortDe(arr, name, 0, arr.length - 1);

        System.out.print("After merge sort : ");
        printData(arr, name);
    }

    // ===================== ASCENDING =====================
    public void mergeAscending(int[] arr, String[] name, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        String[] leftName = new String[n1];
        String[] rightName = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
            leftName[i] = name[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
            rightName[j] = name[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                name[k] = leftName[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                name[k] = rightName[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            name[k] = leftName[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            name[k] = rightName[j];
            j++;
            k++;
        }
    }

    public void mergeSortAs(int[] arr, String[] name, int left, int right) {
        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSortAs(arr, name, left, mid);
            mergeSortAs(arr, name, mid + 1, right);
            mergeAscending(arr, name, left, mid, right);

            System.out.printf("Iteration #%d\t  : ", iterasi++);
            printData(arr, name);
        }
    }

    // ===================== DESCENDING =====================
    public void mergeDescending(int[] arr, String[] name, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        String[] leftName = new String[n1];
        String[] rightName = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
            leftName[i] = name[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
            rightName[j] = name[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] >= rightArray[j]) {
                arr[k] = leftArray[i];
                name[k] = leftName[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                name[k] = rightName[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            name[k] = leftName[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            name[k] = rightName[j];
            j++;
            k++;
        }
    }

    public void mergeSortDe(int[] arr, String[] name, int left, int right) {
        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSortDe(arr, name, left, mid);
            mergeSortDe(arr, name, mid + 1, right);
            mergeDescending(arr, name, left, mid, right);

            System.out.printf("Iteration #%d\t  : ", iterasi++);
            printData(arr, name);
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