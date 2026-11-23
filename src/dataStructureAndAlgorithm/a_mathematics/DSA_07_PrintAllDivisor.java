
package dataStructureAndAlgorithm.a_mathematics;

import java.util.ArrayList;
import java.util.Collections;

/*
 * DSA - 007: Print All Divisors
 * Problem: Find all divisors of a given number.
 *
 * Approach: Check divisors up to sqrt(n).
 * Divisors occur in pairs: i and n/i.
 *
 * Example: n = 12
 * Output: [1, 2, 3, 4, 6, 12]
 *
 * Time Complexity: O(sqrt(n) + d log d)
 * Space Complexity: O(d)
 * d = Number of divisors
 */

public class DSA_07_PrintAllDivisor {

    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                divisors.add(i);

                // Avoid adding the same divisor twice for perfect squares.
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors;
    }
}
