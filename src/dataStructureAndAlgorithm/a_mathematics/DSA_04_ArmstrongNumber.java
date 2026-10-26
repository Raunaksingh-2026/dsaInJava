package dataStructureAndAlgorithm.a_mathematics;
/**
=============================================================
                    DSA - 04
                  Armstrong Number
=============================================================

Problem -> Check whether a given number is an Armstrong number.
    An Armstrong number is a number equal to the sum of its digits,
    where each digit is raised to the power of the total number
    of digits in the number.

Example:
    Input  : 153
    Output : true

Explanation:
    153 = (1 * 1 * 1) + (5 * 5 * 5) + (3 * 3 * 3)
        = 1 + 125 + 27
        = 153

Approach:
    1. Store the original number for comparison.
    2. Extract each digit using the modulo (%) operator.
    3. Calculate the cube of each digit and add it to the sum.
    4. Remove the last digit using integer division (/).
    5. Compare the calculated sum with the original number.
    6. Return true if both are equal; otherwise, return false.

    Time Complexity  : O(d)
    Space Complexity : O(1)

    Where d = number of digits in the given number.

Note -> This implementation checks the sum of cubes, so it is suitable for the usual three-digit Armstrong number problem.
*/
// Class to check whether a number is an Armstrong number
public class DSA_04_ArmstrongNumber {

    // Method to check whether a number is an Armstrong number
    boolean armstrongNumber(long number) {

        // Store the original number for comparison
        long originalNumber = number;

        // Variable to store the sum of the cubes of the digits
        long armstrong = 0;

        // Process each digit while the number is greater than zero
        while (number > 0) {

            // Extract the last digit
            int unitDigit = (int) (number % 10);

            // Add the cube of the digit to the sum
            armstrong = armstrong
                    + (unitDigit * unitDigit * unitDigit);

            // Remove the last digit
            number = number / 10;
        }

        // Compare the calculated sum with the original number
        if (armstrong == originalNumber) {
            return true;
        }

        return false;
    }
}
