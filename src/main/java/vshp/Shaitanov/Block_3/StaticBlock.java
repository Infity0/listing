package vshp.Shaitanov.Block_3;

public class StaticBlock {

    static double rootOf9;
    static double rootOf27;
    int number;

    static {
        System.out.println("Инициализация статитеских члоенов класса....");
        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    }

    StaticBlock(int number) {
        System.out.println("Инициализация переменных экземпляра класса....");
        this.number = number;
    }
}

