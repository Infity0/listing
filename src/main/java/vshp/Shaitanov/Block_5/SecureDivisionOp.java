package vshp.Shaitanov.Block_5;

public class SecureDivisionOp {

    public static void main(String[] args) {
        int result;

        for (int divisoir = -5; divisoir <= 5; divisoir++) {

            result = divisoir != 0 ? 100 / divisoir : 0;
            if (result != 0) {
                System.out.println("100 / " + divisoir + " = " + result);
            }
        }

    }
}

