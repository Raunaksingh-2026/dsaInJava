package dataStructureAndAlgorithm.b_Arrays;

import java.util.Scanner;

public class DSA_10_ArraysMain {

    // Create Scanner object to take user input
    private static final Scanner scanner = new Scanner(System.in);

    // Method to create and return an integer array
    public static int[] getArray() {

        // Initialize an array with sample elements
        int[] array = {10, 20, 30, 40, 50};
        return array;// Return the array
    }

    public static void main(String[] args) {

        // Get the array from the getArray() method
        int[] result = getArray();

        // Display all elements of the array
        /*for (int element : result) {
            System.out.print(element + " ");
        }*/

        // Create an object of DSA_11_SumOfArrayElements
        DSA_11_SumOfArrayElements dsa11SumOfArrayElements = new DSA_11_SumOfArrayElements();

        // Calculate and display the sum of array elements
        System.out.println(
                "Sum Of Given Array : " +
                        dsa11SumOfArrayElements.arraySum(getArray()));

        // Close the Scanner
        scanner.close();
    }
}
