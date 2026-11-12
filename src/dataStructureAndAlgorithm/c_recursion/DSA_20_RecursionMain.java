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

///        Call DSA_21 - Reverse Array Using Recursion
        DSA_21_ReverseArray dsa21 = new DSA_21_ReverseArray();
        dsa21.reverseArray(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));

///        DSA - 22 : Sum of N Numbers Using Recursion
        System.out.print("Enter a number: ");
        int n1 = scanner.nextInt();

        DSA_22_RecursivelySumOfNNumbers dsa22 = new DSA_22_RecursivelySumOfNNumbers();

        System.out.println("Sum of first using parameterised recursion " + n1 + " numbers: " + dsa22.recursiveSum(n1));

///        DSA - 23 : Sum using Functional Recursion
        System.out.print("Enter a number: ");
        int n2 = scanner.nextInt();

        DSA_23_RecursivelySumOfNNumber dsa23 = new DSA_23_RecursivelySumOfNNumber();

        System.out.println("Sum of first using functional recursion " + n2 + " numbers: " + dsa23.recursiveSum(n2));

///        DSA - 24 : Sum Of Array Using Recursion
        int[] arr2 = {10, 20, 30, 40, 50};

        DSA_24_RecursivelySumOfArray dsa24 = new DSA_24_RecursivelySumOfArray();

        System.out.println("Array Sum: " + dsa24.arraySum(arr2));

///        DSA - 25 : Nth Fibonacci Number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Nth Fibonacci Number: " +
                DSA_25_RecursiveFibonacci.nthFibonacci(n));
        scanner.close();
    }
}