package dataStructureAndAlgorithm.a_mathematics;

/**
=============================================================
                    DSA - 02
                  Reverse Of Number
=============================================================

Problem:
    Reverse the digits of a given number.

Approach:
    1. Extract the last digit using the modulo (%) operator.
    2. Append the extracted digit to the reversed number by
       multiplying the reversed number by 10 and adding the digit.
    3. Remove the last digit from the original number using
       integer division (/).
    4. Repeat until the original number becomes 0.
    5. Return the reversed number.

Example:
    Input  : 12345
    Output : 54321

    Input  : 1200
    Output : 21

    Time Complexity  : O(d)
    Space Complexity : O(1)

    Where d = number of digits in the given number.

Note: This implementation returns the reversed number as positive, even if the original number is negative.
*/

public class DSA_02_ReverseOfNumber {

//    Method to reverse the digits of a number
    long reverseOfNumber(long number) {
//        Variable to store the reversed number
        long reverseNumber = 0;

//        Convert a negative number to positive
        number = Math.abs(number);

//        Special case: If the number is 0, return 0
        if (number == 0) {
            return 0;
        }

//        Repeat until all digits are extracted
        while (number > 0) {

//            Extract the last digit and append it to the reversed number
            reverseNumber = (reverseNumber * 10) + (number % 10);

//            Remove the last digit from the original number
            number = number / 10;
        }
//        Return the reversed number
        return reverseNumber;
    }
}
