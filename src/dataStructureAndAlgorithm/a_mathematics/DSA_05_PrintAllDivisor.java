package dataStructureAndAlgorithm.a_mathematics;

import java.util.ArrayList;

public class DSA_05_PrintAllDivisor {

    /*
    =============================================================
                    APPROACH 1: BRUTE FORCE
    =============================================================
    */

    // Method to find all divisors using brute force
    ArrayList<Long> printAllDivisorBruteForce(long number) {

        // List to store all divisors
        ArrayList<Long> allDivisor = new ArrayList<>();

        // Check every number from 1 to the given number
        for (long i = 1; i <= number; i++) {

            // Check whether i divides the number completely
            if (number % i == 0) {

                // Add i to the list if it is a divisor
                allDivisor.add(i);
            }
        }
        // Return the list of all divisors
        return allDivisor;
    }
}
