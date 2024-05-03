package vshp.Shaitanov.Block_5;

public class Factorial {


    long computerI (int n) {
        long result = 1;

        for (int i = 1; i <= n; i++)
            result *= i;

        return result;
    }


    long computerR(int n) {
        if (n == 1) return n;
        return computerR(n - 1) * n;
    }
}

