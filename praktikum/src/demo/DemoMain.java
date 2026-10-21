package demo;

import com.fasterxml.jackson.databind.JsonNode;
import demo.data.GetData;
import demo.module1.BubbleSort;
import demo.module1.SelectionSort;
import demo.module2.InsertionSort;
import demo.module2.ShellSort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoMain {
    static int[] data;
    static String[] name;

    static void OptionSort(Scanner in, String sortOrder) {
        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();
        InsertionSort is = new InsertionSort();
        ShellSort shs = new ShellSort();

        System.out.printf("--- %s Menu ---\n",sortOrder);
        System.out.println("1. Bubble sort.\n2. Selection sort.\n3. Insertion sort.\n4. Shell sort.");
        System.out.print("Enter choice: ");
        int optionAs = in.nextInt();
        in.nextLine();

        if (sortOrder.equals("Ascending")) {
            switch (optionAs) {
                case 1 -> bs.Ascending(data,name);
                case 2 -> ss.Ascending(data,name);
                case 3 -> is.Ascending(data,name);
                case 4 -> shs.Ascending(data,name);
                default -> System.out.println("Invalid choice");
            }
        } else {
            switch (optionAs) {
                case 1 -> bs.Descending(data,name);
                case 2 -> ss.Descending(data,name);
                case 3 -> is.Descending(data,name);
                case 4 -> shs.Descending(data,name);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static boolean homeMenu(Scanner in, GetData test) {
        JsonNode datas = test.getData();
        int size = datas.size();
        if (datas != null && !datas.isEmpty()) {
            data = new int[size];
            name = new String[size];
            for (int i=0;i< size;i++) {
                data[i] = datas.get(i).get("followers").asInt();
                name[i] = datas.get(i).get("name").asText();
            }
        }
        System.out.println("=== HOME MENU ===");
        System.out.println("1. Show like with ascending.\n2. Show like with descending.\n3. Exit");
        System.out.print("Select option (1-3): ");
        int option = in.nextInt();
        in.nextLine();


        String sort;
        if (option == 1) {
            sort = "Ascending";
            OptionSort(in, sort);
            return true;
        } else if (option == 2) {
            sort = "Descending";
            OptionSort(in, sort);
            return true;
        } else if (option == 3) {
            System.out.println("Exit the program");
            return false;
        } else {
            throw new IllegalArgumentException("Choose 1-3");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        GetData test = new GetData();
        while (running) {
            try {
                running = homeMenu(in,test);
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