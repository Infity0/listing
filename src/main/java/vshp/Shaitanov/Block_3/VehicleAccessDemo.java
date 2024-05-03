package vshp.Shaitanov.Block_3;

public class VehicleAccessDemo {

    public static void main(String[] args) {

        Vehicle6 ferrari = new Vehicle6(2, 4, 360, 12);

        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari за полчаса проедет " + distance + " км.");

        System.out.println("Скорость Ferrari: " + ferrari.maxspeed + " км/ч");

    }
}

