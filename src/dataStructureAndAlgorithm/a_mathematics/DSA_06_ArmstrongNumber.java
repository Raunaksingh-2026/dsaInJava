package dataStructureAndAlgorithm.a_mathematics;
/**
=============================================================
                    DSA - 06
                  Armstrong Number
=============================================================

Problem -> Check whether a given number is an Armstrong number.
    An Armstrong number is a number equal to the sum of its digits,
    where each digit is raised to the power of the total number
    of digits in the number.

Approach:
    1. Store the number in two temporary variables.
    2. Count the total digits using the first variable.
    3. Extract each digit using the modulo (%) operator.
    4. Calculate the power of each digit using integer multiplication.
    5. Add the powered digits to get the final sum.
    6. Compare the sum with the original number.

Example 1:
    Input  : 153
    Output : true

Explanation:
    153 = 1^3 + 5^3 + 3^3
        = 1 + 125 + 27
        = 153

Example 2:
    Input  : 1634
    Output : true

Explanation:
    1634 = 1^4 + 6^4 + 3^4 + 4^4
         = 1 + 1296 + 81 + 256
         = 1634

    Time Complexity  : O(d^2)
    Space Complexity : O(1)
    Where d = number of digits in the given number.

Note:
    This implementation uses integer multiplication instead of
    Math.pow() to calculate digit powers.
*/
public class DSA_06_ArmstrongNumber {

    // Method to check whether a number is an Armstrong number
    public boolean isArmstrong(long number) {

        // Store copies of the original number for separate operations
        long number1 = number;
        long number2 = number;

        // Variables to count digits and store their powered sum
        int countDigit = 0;
        long newNumber = 0;

        // Special case: Zero is an Armstrong number
        if(number == 0){
            return true;
        }

        // Count the total number of digits
        while(number1 > 0){

            int lastDigit = (int) number1 % 10;
            countDigit ++;
            number1 = number1 / 10;
        }

        // Calculate the sum of each digit raised to countDigit
        while(number2 > 0){

            int lastDigit = (int) number2 % 10;

            // Initialize the digit power to 1
            long digitPower = 1;

            // Calculate the power using integer multiplication
            for (int i = 0; i < countDigit; i++) {
                digitPower *= lastDigit;
            }

            // Add the powered digit to the total sum
            newNumber = newNumber + digitPower;

            number2 = number2 / 10;
        }
        // Return true if the calculated sum matches the original number
        return newNumber == number;
    }

}
