package dataStructureAndAlgorithm.a_mathematics;

/*
DSA - 010 : Greatest Common Divisor (GCD)

Problem:
Find the greatest common divisor of two given numbers.

Approaches:
    1. Brute Force (Loop till a):
        1. Initialize gcd = 1.
        2. Check every number from 2 to a.
        3. If a number divides both a and b, update gcd.
        4. Return the greatest common divisor found.
    2. Brute Force (Loop till min):
       - Check divisors only up to the smaller number.
       - GCD cannot be greater than min(a, b).

Example:
Input  : a = 12, b = 18
Output : 6

Time Complexity by brute force : O(a)
Time Complexity till min(a, b) : O(min(a, b))
Space Complexity : O(1)
*/

public class DSA_010_GreatestCommonDivisor {

    // Approach 1: Brute force till a
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

    // Approach 2: Brute force till min(a, b)
    public static int gcd2(int a, int b) {

        int gcd = 1;
        int min = Math.min(a, b);

        for (int i = 2; i <= min; i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}