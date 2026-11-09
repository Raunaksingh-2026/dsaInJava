package dataStructureAndAlgorithm.c_recursion;

import java.util.Arrays;
import java.util.Scanner;

public class DSA_20_RecursionMain {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Call DSA_21 - Reverse Array Using Recursion
        DSA_21_ReverseArray dsa21 = new DSA_21_ReverseArray();
        dsa21.reverseArray(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));

        scanner.close();
    }
}