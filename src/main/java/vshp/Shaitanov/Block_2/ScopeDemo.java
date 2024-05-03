package vshp.Shaitanov.Block_2;

public class ScopeDemo {

    public static void main(String[] args) {
        int x; // переменная x видна во всем методе main()

        x = 1;
        System.out.println("До вложенного блока: x равно " + x);
        {
            // новый блок создает новую область видимости

            /* переменная y доступна только внутри текущего блока, но это не мешает ее использовать вместе с переменной x из внешнего блока */
            int y = 3;

            // здесь действуют обе переменных, x и y
            System.out.println("Внутренний блок: x равно " + x + ", y равно " + y);

            x = y * 3;
        } // конец вложенного блока

        /* если вы раскомменттруете строку "y = 100", то получите ** ошибку компиляции: переменная y в текущем блоке не объявлена */
        // y = 100;

        //  как видете, переменная x видна во всей программе
        System.out.println("После вложенного блока: x равно " + x);

    } // main(String[]) method

} // ScoreDemo class
