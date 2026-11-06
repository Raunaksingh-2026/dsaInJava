package dataStructureAndAlgorithm.b_Arrays;
/**
=============================================================
DSA - 12 : Largest Element In Array
=============================================================

Problem: Find the largest element present in the given array.

Approach:
    1. Assume the first element is the largest.
    2. Traverse the array from beginning to end.
    3. If the current element is greater than largest,
       update largest.
    4. Return largest after completing the traversal.

Example:
    Input  : [10, 25, 7, 40, 15]
    Output : 40

    Time Complexity  : O(n)
    Space Complexity : O(1)
*/
public class DSA_12_LargestElementInArray {
    public static int largest(int[] arr) {

        // Assume the first element is the largest
        int largest = arr[0];

        // Traverse every element in the array
        for(int i = 0; i <= arr.length-1; i++){

            // Update largest if the current element is greater
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
