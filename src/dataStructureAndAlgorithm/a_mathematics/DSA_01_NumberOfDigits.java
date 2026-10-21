package dataStructureAndAlgorithm.a_mathematics;

import java.util.Scanner;
/**
Problem -> Count the total number of digits in a given number.

Approach:
        1. Extract the last digit using the modulo (%) operator.
        2. Increase the digit counter by 1.
        3. Remove the last digit using integer division (/).
        4. Repeat until the number becomes 0.

Example:
    Input  : 12345
    Output : 5

    Time Complexity  : O(d)
    Space Complexity : O(1)

    Where d = number of digits in the given number.
        */

class NumberOfDigits {

    // Method to count the total digits in a number
    long countingOfDigits(long number) {

        // Special case: Zero contains exactly one digit
        if (number == 0) {
            return 1;
        }

        // Convert a negative number to positive for counting.
        // Note: Long.MIN_VALUE needs separate handling.
        number = Math.abs(number);

        int count = 0;

        // Continue until all digits have been removed
        while (number > 0) {

            // Extract the last digit
            long lastDigit = number % 10;

            // Increase the digit count
            count++;

            // Remove the last digit
            number = number / 10;
        }

        // Return the total number of digits
        return count;
    }
}

public class DSA_01_NumberOfDigits {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create an object of NumberOfDigits class
        NumberOfDigits numberOfDigits = new NumberOfDigits();

        // Take input from the user
        System.out.print("Enter any number: ");
        long number = scanner.nextLong();

        // Call the method and display the result
        System.out.println(
                "Total Digits: " +
                        numberOfDigits.countingOfDigits(number)
        );

        // Close the Scanner
        scanner.close();
    }
}


