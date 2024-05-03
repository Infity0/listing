package vshp.Shaitanov.Block_3;

public class VehicleRetMethod {

    public static void main(String[] args) {

        Vehicle3 car = new Vehicle3();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        Vehicle3 bus = new Vehicle3();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        double time = 0.5;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

        System.out.println("Автомобиль с " + car.passengers + " пассажирами");
        System.out.println(" пройдёт за полчаса путь " + distanceCar + " км.");
        System.out.println("Автомобиль с " + bus.passengers + " пассажирами");
        System.out.println(" пройдёт за полчаса путь " + distanceBus + " км.");
    }
}

