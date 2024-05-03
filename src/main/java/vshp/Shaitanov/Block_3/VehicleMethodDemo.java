package vshp.Shaitanov.Block_3;

public class VehicleMethodDemo {

    public static void main(String[] args) {

        Vehicle2 car = new Vehicle2();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        Vehicle2 bus = new Vehicle2();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        double time = 0.5;
        System.out.println("Автомобиль с " + car.passengers + " пассажирами");
        car.distance(time);
        System.out.println("Автомобиль с " + bus.passengers + " пассажирами");
        bus.distance(time);
    }
}

