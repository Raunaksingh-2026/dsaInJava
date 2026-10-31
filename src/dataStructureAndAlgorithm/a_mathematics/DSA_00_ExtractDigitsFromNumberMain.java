package dataStructureAndAlgorithm.a_mathematics;

import java.util.Scanner;

public class DSA_00_ExtractDigitsFromNumberMain {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create an object of DSA_01_CountingOfDigits class
        DSA_01_CountingOfDigits dsa01CountingOfDigits = new DSA_01_CountingOfDigits();

        // Take input from the user
        System.out.print("Enter any number: ");
        long number = scanner.nextLong();

        // Call the method and display the result
        System.out.println(
                "Total Digits     : " +
                        dsa01CountingOfDigits.countingOfDigits(number)
        );

        DSA_02_ReverseOfNumber dsa02ReverseOfNumber = new DSA_02_ReverseOfNumber();

        // Call the method and display the reverse Number
        System.out.println(
                "Reverse Number   : " +
                        dsa02ReverseOfNumber.reverseOfNumber(number)
        );

        DSA_03_CheckPalindromeNumber dsa03CheckPalindromeNumber = new DSA_03_CheckPalindromeNumber();

        // Call the method which check the Number is Palindrome or Not
        System.out.println(
                "Palindrome Or Not: " +
                        dsa03CheckPalindromeNumber.checkPalindrome(number)
        );

        DSA_04_ArmstrongNumber dsa04ArmstrongNumber = new DSA_04_ArmstrongNumber();

        // Call the method which check the Number is Armstrong or Not
        System.out.println(
                "Armstrong Or Not  : " +
                        dsa04ArmstrongNumber.armstrongNumber(number)
        );

        DSA_05_PrintAllDivisor dsa05PrintAllDivisor = new DSA_05_PrintAllDivisor();

        // Call the method which All the Divisor of Number by BruteForce
        System.out.println(
                "Divisor By Brute Force  : " +
                        dsa05PrintAllDivisor.printAllDivisorBruteForce(number)
        );

        // Call the method which All the Divisor of Number by BruteForce
        System.out.println(
                "Divisor By Optimised    : " +
                        dsa05PrintAllDivisor.printAllDivisorOptimized(number)
        );

        DSA_06_ArmstrongNumber dsa06ArmstrongNumber = new DSA_06_ArmstrongNumber();

        // Call the method which return the number is ArmStrong or not
        System.out.println(
                "Is Armstrong     : " +
                        dsa06ArmstrongNumber.isArmstrong(number)
        );

        // Close the Scanner
        scanner.close();
    }
}


