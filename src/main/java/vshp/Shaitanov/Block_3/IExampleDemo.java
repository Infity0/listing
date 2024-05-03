package vshp.Shaitanov.Block_3;

interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class IExample implements B {

    public void methodA() {System.out.println("Метод А");}
    public void methodB() {System.out.println("Метод В");}
}
public class IExampleDemo {

    public static void main(String[] args) {

        IExample ie = new IExample();
        ie.methodA();
        ie.methodB();

    }
}