package dataStructureAndAlgorithm.a_mathematics;

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
