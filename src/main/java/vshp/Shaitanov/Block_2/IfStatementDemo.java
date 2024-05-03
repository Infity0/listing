package vshp.Shaitanov.Block_2;

public class IfStatementDemo {

    public static void main(String[] args) {

        int a, b, c, d;

        a = 2;
        b = 3;

        System.out.println("a равно 2, b равно 3");
        if (a < b) System.out.println("a меньше b");
        if (a > b) System.out.println("Это текс вы никогда не увидите");
        System.out.println("");

        c = a - b; // c будет равно -1
        System.out.println("c равно -1");
        if (c >= 0) System.out.println("с имеет положительное значение");
        if (c < 0) System.out.println("с имеет отрицательное значение");
        System.out.println("");

        d = b - a; // d равно 1
        System.out.println("d равно 1");
        if (d >= 0) System.out.println("d имеет положительное значение");
        if (d < 0) System.out.println("d имеет отрицательное значение");
        System.out.println("");

        if (a + c != b) System.out.println("a плюс c не равняется b ");
        if (a + d == b) System.out.println("а плюс d равняется b");

    } //main() method
} // IfStatementDemo class
