package dataStructureAndAlgorithm.a_mathematics;

/**
 * Problem -> Count the total number of digits in a given number.
 * <p>
 * Approach:
 * 1. Extract the last digit using the modulo (%) operator.
 * 2. Increase the digit counter by 1.
 * 3. Remove the last digit using integer division (/).
 * 4. Repeat until the number becomes 0.
 * <p>
 * Example:
 * Input  : 12345
 * Output : 5
 * <p>
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 * <p>
 * Where d = number of digits in the given number.
 */

public class DSA_01_CountingOfDigits {

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
