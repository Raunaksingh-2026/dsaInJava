package dataStructureAndAlgorithm.b_Arrays;

/*
=============================================================
DSA - 13 : Reverse The Array
=============================================================

Problem:
Reverse the order of elements in the given array.

Approach (Two-Pointer):
1. Initialize left at the first index (0).
2. Initialize right at the last index (arr.length - 1).
3. Swap elements at left and right.
4. Move left forward and right backward.
5. Continue until left >= right.

Example:
Input  : [10, 20, 30, 40, 50]
Output : [50, 40, 30, 20, 10]

Time Complexity  : O(n)
Space Complexity : O(1)

=============================================================
*/

public class DSA_13_ReverseTheArray {

    public void reverseArray(int arr[]) {

        // Pointer at the last index
        int right = arr.length - 1;

        // Pointer at the first index
        for (int left = 0; left < right; left++) {

            // Swap the elements at left and right
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the right pointer toward the beginning
            right--;
        }
    }
}