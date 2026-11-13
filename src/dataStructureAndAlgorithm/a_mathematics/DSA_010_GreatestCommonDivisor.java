package dataStructureAndAlgorithm.a_mathematics;

/*
DSA - 010 : Greatest Common Divisor (GCD)

Problem:
Find the greatest common divisor of two given numbers.

Approach (Brute Force):
1. Initialize gcd = 1.
2. Check every number from 2 to a.
3. If a number divides both a and b, update gcd.
4. Return the greatest common divisor found.

Example:
Input  : a = 12, b = 18
Output : 6

Time Complexity  : O(a)
Space Complexity : O(1)
*/

public class DSA_010_GreatestCommonDivisor {

    public static int gcd(int a, int b) {

        int gcd = 1; // 1 is a common divisor of positive integers

        // Check all possible divisors of a
        for (int i = 2; i <= a; i++) {

            // Update gcd if i divides both numbers
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}