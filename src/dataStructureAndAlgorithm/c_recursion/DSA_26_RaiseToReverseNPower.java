package dataStructureAndAlgorithm.c_recursion;
/*
DSA : Raise to Power of Its Own Reverse

Problem:
Given a number n, calculate n raised to the power of its reverse.

Example:
Input  : n = 12
Reverse: 21
Output : 12^21

Approach:
1. Reverse the given number.
2. Calculate n^reverse using Binary Exponentiation.
3. Divide the exponent by 2 in each recursive call.
4. For odd exponents, multiply by n once more.

Time Complexity  : O(log p), where p is the reversed number
Space Complexity : O(log p) - Recursive call stack
*/
public class DSA_26_RaiseToReverseNPower {
    // Binary Exponentiation: Calculate n^p
    public int power(int n, int p) {

        if (p == 0) return 1;
        if (p == 1) return n;

        int halfPower = power(n, p / 2);

        // Even power: halfPower * halfPower
        if (p % 2 == 0) {
            return halfPower * halfPower;
        }

        // Odd power: n * halfPower * halfPower
        return n * halfPower * halfPower;
    }

    public int reverseExponentiation(int n) {

        int original = n;
        int reverse = 0;

        // Reverse the given number
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        return power(original, reverse);
    }
}
