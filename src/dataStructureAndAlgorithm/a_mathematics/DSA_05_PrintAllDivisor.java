package dataStructureAndAlgorithm.a_mathematics;

import java.util.ArrayList;

/**
=============================================================
                    DSA - 05
              Print All Divisors
=============================================================

Problem -> Find all divisors of a given positive number.
    A divisor is a number that divides another number completely,
    leaving a remainder of 0.

Example:
    Input  : 12
    Output : [1, 2, 3, 4, 6, 12]

APPROACH 1: BRUTE FORCE
-------------------------------------------------------------
    1. Iterate from 1 to the given number.
    2. Check whether the number is divisible by i using %.
    3. If the remainder is 0, add i to the list.
    4. Return the list of divisors.

    Time Complexity  : O(n)
    Space Complexity : O(d)
*/

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
