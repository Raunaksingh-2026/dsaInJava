
package dataStructureAndAlgorithm.a_mathematics;

/**
DSA - 013: Prime Number
Problem: Check whether a given number is prime.

Approach: Count divisors up to sqrt(n).
A prime number has exactly two divisors.

Example: n = 7
Output: true

Time Complexity: O(sqrt(n))
Space Complexity: O(1)
*/

public class DSA_013_PrimeNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        int countDivisor = 0;

        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                countDivisor++;

                // Count the paired divisor only once for perfect squares.
                if (i != n / i) {
                    countDivisor++;
                }
            }
        }

        return countDivisor == 2;
    }
}
