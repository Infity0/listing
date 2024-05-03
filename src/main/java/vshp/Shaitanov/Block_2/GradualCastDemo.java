package vshp.Shaitanov.Block_2;

public class GradualCastDemo {

    public static void main(String[] args) {

        byte x, z;
        int y;

        x = 5;
        y = x* x; // все правильно, результат операции
        // имеет тип int
        z = (byte) (x * x); // чтобы записать результат
        // в переменную типа byte,
        // требуется явное преобразование
        // типа результата

    } // main(String[]) method

} // GradualCastDemo class

