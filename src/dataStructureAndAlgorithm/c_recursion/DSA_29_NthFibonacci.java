
package dataStructureAndAlgorithm.c_recursion;

/**
DSA - 029: Nth Fibonacci Number
Problem: Find the Nth Fibonacci number.

Approach: Multiple Recursion
Base Cases: fib(0) = 0, fib(1) = 1
Example: n = 5
Output: 5

Time Complexity: O(2^n)
Space Complexity: O(n) - Recursive Stack
 */

public class DSA_29_NthFibonacci {

    public static int nthFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return nthFibonacci(n - 2) + nthFibonacci(n - 1);
    }
}
