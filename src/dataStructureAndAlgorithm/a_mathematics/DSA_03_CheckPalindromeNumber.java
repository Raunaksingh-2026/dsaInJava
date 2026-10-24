package dataStructureAndAlgorithm.a_mathematics;

/**
=============================================================
                    DSA - 03
                Check Palindrome Number
=============================================================

Problem -> Check whether a given number is a palindrome.
    A palindrome number reads the same forward and backward.

Approach:
    1. Store the original number.
    2. Convert the number to its absolute value.
    3. Reverse the digits using a while loop.
    4. Compare the reversed number with the absolute value
       of the original number.
    5. Return true if both are equal; otherwise, return false.

Example:
    Input  : 121
    Output : true

    Input  : 123
    Output : false

    Time Complexity  : O(d)
    Space Complexity : O(1)

    Where d = number of digits in the given number.
*/
public class DSA_03_CheckPalindromeNumber {
//    Method to check whether a number is a palindrome
    boolean checkPalindrome(long originalNumber){

//        Convert the original number to its absolute value
        long number = Math.abs(originalNumber);

//        Variable to store the reversed number
        long reverseNumber = 0;

//        Reverse the number digit by digit
        while (number > 0) {

//            Extract the last digit and append it to the reversed number
            reverseNumber = (reverseNumber * 10) + (int) (number % 10);

//            Remove the last digit from the number
            number = number / 10;
        }

//        Compare the reversed number with the original number's absolute value to check whether it is a palindrome
        if (reverseNumber == Math.abs(originalNumber)) {
            return true;
        }else
            return false;
    }
}
