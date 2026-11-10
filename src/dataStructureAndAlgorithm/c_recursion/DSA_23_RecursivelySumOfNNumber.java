package dataStructureAndAlgorithm.c_recursion;

/*
DSA - 23 : Sum of N Numbers Using Functional Recursion

Approach:
1. If n == 0, return 0 (base case).
2. Add n to the result of recursiveSum(n - 1).
3. Each call returns its calculated sum.

Example:
Input  : n = 5
Output : 15 (1 + 2 + 3 + 4 + 5)

Time Complexity  : O(n)
Space Complexity : O(n) - Recursive call stack
*/

public class DSA_23_RecursivelySumOfNNumber {

    public int recursiveSum(int n) {

        // Base case: sum of numbers up to 0 is 0
        if (n == 0) {
            return 0;
        }

        // Add n while returning from recursive calls
        return n + recursiveSum(n - 1);
    }
}