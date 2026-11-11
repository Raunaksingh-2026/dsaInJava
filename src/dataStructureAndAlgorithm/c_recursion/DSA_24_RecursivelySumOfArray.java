package dataStructureAndAlgorithm.c_recursion;

/*
DSA - 24 : Sum Of Array Elements Using Recursion

Approach:
1. Start from the last array index.
2. Add the current element to the recursive result.
3. Stop when index reaches 0.

Example:
Input  : [10, 20, 30, 40, 50]
Output : 150

Time Complexity  : O(n)
Space Complexity : O(n) - Recursive call stack
*/

public class DSA_24_RecursivelySumOfArray {

    public int arraySum(int[] arr) {
        return currentSum(arr, arr.length - 1);
    }

    public int currentSum(int[] arr, int n) {

        // Base case: return the first element
        if (n == 0) {
            return arr[0];
        }

        // Add current element while returning from recursion
        return arr[n] + currentSum(arr, n - 1);
    }
}