package dataStructureAndAlgorithm.c_recursion;

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
