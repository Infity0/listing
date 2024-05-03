package vshp.Shaitanov.Block_2;

public class NestVar {
    public static void main(String[] args) {
        int count=1;
        System.out.println("count = " + count);

        {
            // ошибка: переменная count уже объявлена.
            // Закомментируйте следующую строку
            count=2;
            System.out.println("Первый независимый блок: count = " + count);

            int n=3;
            System.out.println("Первый независимый блок: n = " + n);
        }
        {
            int n=5;
            System.out.println("Второй независимый блок: n = " + n);
        }

    } // main(String[]) method

} // NestVar class

