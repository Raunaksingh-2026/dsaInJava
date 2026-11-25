package dataStructureAndAlgorithm.c_recursion;

/*
DSA - 22 : Sum of N Numbers Using Recursion (Parameterized)
Approach:
    1. Pass n and sum as parameters.
    2. Add n to sum in each recursive call.
    3. When n becomes 0, return the accumulated sum.
Example:
    Input  : n = 5
    Output : 15 (1 + 2 + 3 + 4 + 5)
Time Complexity  : O(n)
Space Complexity : O(n) - Recursive call stack
*/

public class DSA_22_RecursivelySumOfNNumbers {

    public int recursiveSum(int n) {
        return newSum(n, 0);
    }

    public int newSum(int n, int sum) {

        // Base case: return the accumulated sum
        if (n == 0) {
            return sum;
        }

        // Add n to sum and move towards the base case
        return newSum(n - 1, sum + n);
    }
}