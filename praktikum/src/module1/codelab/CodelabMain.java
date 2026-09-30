package module1.codelab;

public class CodelabMain {
    public static void main(String[] args) {
        int[] array = {4,3,9,8,5,6,7,2,1};
        System.out.println("Before swap");
        for (int a:array) {
            System.out.print(a+" ");
        }
        System.out.println("\n");
        System.out.println("After Bubble Sort");
        BubbleSort bs = new BubbleSort(array);
        bs.printArray();
        System.out.println("\n");
        System.out.println("After Selection Sort");
        SelectionSort ss = new SelectionSort(array);
        ss.printArray();
    }
}