
package dataStructureAndAlgorithm.a_mathematics;

/*
 * DSA - 008: Factorial of a Number
 * Problem: Calculate the factorial of a given number.
 *
 * Approach: Functional Recursion
 * Base Case: factorial(0) = factorial(1) = 1
 *
 * Example: n = 5
 * Output: 120
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) - Recursive Stack
 */

public class DSA_08_Factorial {

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
