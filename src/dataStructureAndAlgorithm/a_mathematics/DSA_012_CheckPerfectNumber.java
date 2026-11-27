
package dataStructureAndAlgorithm.a_mathematics;

/**
DSA - 012: Check Perfect Number
Problem: Check whether a number is equal to the sum of its proper divisors.
Approach: Find divisor pairs up to sqrt(n).
Example: n = 28 -> Output: true
Time Complexity: O(sqrt(n))
Space Complexity: O(1)
 */

public class DSA_012_CheckPerfectNumber {

    static boolean isPerfect(int n) {
        // code here

        if (n <= 1) {
            return false; // as 1 will never be perfect number
        }

        int sumOfFactors = 1;

        // loop start with i = 2 -> sqrt(n)
        for (int i = 2; i <= n / i; i++) {

            // check value of i is divisble by given number or not
            if (n % i == 0) {
                sumOfFactors = sumOfFactors + i;

                // as on dividing one divisor to number givs an another divisor
                if (n / i != i) {
                    sumOfFactors = sumOfFactors + n / i;
                }
            }
        }

        return sumOfFactors == n;
    }
}
