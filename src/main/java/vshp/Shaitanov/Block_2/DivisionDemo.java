package vshp.Shaitanov.Block_2;

public class DivisionDemo {

    public static void main(String[] args) {
        int iresult, iremain; //для деления вещественных чисел
        double dresult, dremain;

        // деление целых чисел
        iresult = 10 / 3;
        iremain = 10 % 3;

        System.out.println("частное от деления 10 . 3.0 равно ");
        System.out.println(iresult + ", остаток равен " + iremain);

        // деление вещественных чисел
        dresult = 10.0 / 3.0;
        dremain = 10.0 % 3.0;

        System.out.println("частное от деления 10.0 / 3.0 равно ");
        System.out.println(dresult + ", остаток равен " + dremain);

    }// main(String[]) method

} // DivisionDemo

