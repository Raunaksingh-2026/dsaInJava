package dataStructureAndAlgorithm.a_mathematics;

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
