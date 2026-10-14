package demo;

import demo.module1.BubbleSort;
import demo.module1.SelectionSort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoMain {
    static int[] data;

    static boolean homeMenu(Scanner in) {
        System.out.println("=== HOME MENU ===");
        System.out.println("1. Input count like.\n2. Show like with ascending.\n3. Show like with descending.\n4. Exit");
        System.out.print("Select option (1-4): ");
        int option = in.nextInt();
        in.nextLine();

        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();

        switch (option) {
            case 1:
                System.out.print("Enter data size: ");
                int countData = in.nextInt();
                in.nextLine();
                data = new int[countData];

                for (int i = 0; i < countData; i++) {
                    System.out.printf("Enter like count #%d: ", i + 1);
                    data[i] = in.nextInt();
                    in.nextLine();
                }
                System.out.println();
                return true;
            case 2:
                if (data == null) {
                    System.out.println("\nData is null.\n");
                } else {
                    System.out.println("--- Ascending Menu ---");
                    System.out.println("1. Bubble sort.\n2. Selection sort.");
                    System.out.print("Enter choice: ");
                    int optionAs = in.nextInt();
                    in.nextLine();
                    if (optionAs == 1) {
                        System.out.println("\nAscending with bubble sort:");
                        bs.Ascending(data);
                        System.out.println();
                    } else if (optionAs == 2) {
                        System.out.println("\nAscending with selection sort:");
                        ss.Ascending(data);
                        System.out.println();
                    } else {
                        throw new IllegalArgumentException("Choice 1-2");
                    }
                }
                return true;
            case 3:
                if (data == null) {
                    System.out.println("\nData is null.\n");
                } else {
                    System.out.println("--- Ascending Menu ---");
                    System.out.println("1. Bubble sort.\n2. Selection sort.");
                    System.out.print("Enter choice: ");
                    int optionDes = in.nextInt();
                    in.nextLine();
                    if (optionDes == 1) {
                        System.out.println("\nDescending with bubble sort:");
                        bs.Descending(data);
                        System.out.println();
                    } else if (optionDes == 2) {
                        System.out.println("\nDescending with selection sort:");
                        ss.Descending(data);
                        System.out.println();
                    } else {
                        throw new IllegalArgumentException("Choice 1-2");
                    }
                }
                return true;
            case 4:
                System.out.println("Exit the program");
                return false;
            default:
                throw new IllegalArgumentException("Choose 1-4");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running) {
            try {
                running = homeMenu(in);
            } catch (InputMismatchException im) {
                System.out.println("\nERROR! Invalid option\n");
                in.nextLine();
            } catch (IllegalArgumentException il) {
                System.out.println("\nERROR! option" + il.getMessage() + "\n");
            }
        }
        in.close();
    }
}