package dataStructureAndAlgorithm.c_recursion;

/*
DSA - 25 : Nth Fibonacci Number Using Recursion

Approach:
1. Base cases: fib(0) = 0 and fib(1) = 1.
2. Calculate the previous two Fibonacci numbers recursively.
3. Return their sum.

Example:
Input  : n = 5
Output : 5
Sequence: 0, 1, 1, 2, 3, 5

Time Complexity  : O(2^n)
Space Complexity : O(n) - Recursive call stack
*/

public class DSA_25_RecursiveFibonacci {

    static int nthFibonacci(int n) {

        // Base cases
        if (n <= 1) {
            return n;
        }

        // Sum of the previous two Fibonacci numbers
        int firstLast = nthFibonacci(n - 1);
        int secondLast = nthFibonacci(n - 2);

        return firstLast + secondLast;
    }
}