package dataStructureAndAlgorithm.b_Arrays;

/*
=============================================================
                    DSA - 11
                Sum Of Array Elements
=============================================================

Problem:
Calculate the sum of all elements present in a given array.

Approach:
1. Initialize a variable sum with 0.
2. Iterate through the array using a for loop.
3. Access each element using its index.
4. Add each element to the sum variable.
5. Return the final sum.

Example:
Input  : [10, 20, 30, 40, 50]
Output : 150

Explanation:
Sum = 10 + 20 + 30 + 40 + 50
    = 150

Time Complexity  : O(n)
Space Complexity : O(1)

Where n = number of elements in the array.
*/
// Class to calculate the sum of array elements
public class DSA_11_SumOfArrayElements {

    // Method to calculate and return the sum of array elements
    public int arraySum(int arr[]) {

        // Initialize sum to store the total of array elements
        int sum = 0;

        // Traverse the array from the first to the last element
        for(int i = 0; i <= arr.length-1; i++){
            sum += arr[i];
        }
        return sum;
    }
}
