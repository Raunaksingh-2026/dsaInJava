package dataStructureAndAlgorithm.a_mathematics;

public class DSA_09_NthFibonacci {
    static int nthFibonacci(int n) {
        // code here
        // By using for loop
        int prev2 = 0;
        int prev1 = 1;
        int fib = 0;

        if(n == 1){
            return 1;
        }

        for(int i = 2; i <= n; i++){
            fib = prev2 + prev1;
            prev2 = prev1;
            prev1 = fib;
        }
        return fib;
    }
}
