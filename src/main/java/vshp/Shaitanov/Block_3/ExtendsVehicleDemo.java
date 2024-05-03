package vshp.Shaitanov.Block_3;

public class ExtendsVehicleDemo {

    public static void main(String[] args) {

        //создание объекта подкласса Auto
        Auto bmw = new Auto();
        bmw.sunroof = true; //люк есть

        // пример обращения к методам и переменным
        // надкласса и подкласса
        System.out.println("Путь, пройденый за 1.5 часа: " + bmw.distance(1.5) + " км.");
        System.out.println("Max.скорость: " + bmw.getMaxspeed() + " км.");
        System.out.println("Наличие люка: " + bmw.sunroof);
    }
}

