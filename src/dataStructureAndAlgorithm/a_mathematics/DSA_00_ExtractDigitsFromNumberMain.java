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
                "Total Digits    : " +
                        dsa01CountingOfDigits.countingOfDigits(number)
        );

        DSA_02_ReverseOfNumber dsa02ReverseOfNumber = new DSA_02_ReverseOfNumber();

        // Call the method and display the reverse Number
        System.out.println(
                "Reverse Number  : " +
                        dsa02ReverseOfNumber.reverseOfNumber(number)
        );

        // Close the Scanner
        scanner.close();
    }
}


