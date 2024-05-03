package vshp.Shaitanov.Block_5;

public class RecursionDemo {

    public static void main(String[] args) {

        Factorial f = new Factorial();

        System.out.println("Факториал, рассчитанный с помощью цикла");
        for (int i =6; i> 0; i--) {
            System.out.println(i + "! = " + f.computerI(i));
        }

        System.out.println("Факториал, рассчитанный с помощью рекурсии");
        for (int r =1; r <= 6; r++) {
            System.out.println(r + "! = " + f.computerR(r));
        }
    }
}

