package dataStructureAndAlgorithm.c_recursion;

/*
DSA - 21 : Reverse Array Using Recursion

Approach:
1. Swap left and right elements.
2. Recursively process the inner array.
3. Stop when left >= right.

Time Complexity  : O(n)
Space Complexity : O(n)
*/

public class DSA_21_ReverseArray {

    public void reverseArray(int arr[]) {
        reverseUsingTwoPointer(arr, 0, arr.length - 1);
    }

    private void reverseUsingTwoPointer(int arr[], int left, int right) {

        // Base case: stop when pointers meet or cross
        if (left >= right) return;

        // Swap outer elements
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Move inward to reverse the remaining subarray
        reverseUsingTwoPointer(arr, left + 1, right - 1);
    }
}