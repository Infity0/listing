package vshp.Shaitanov.Block_3;

public class VehicleConstrDemo {
    public static void main(String[] args) {

        Vehicle4 car = new Vehicle4(2, 4, 130, 30);
        Vehicle4 bus = new Vehicle4(45, 5, 120, 25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("Автомобиль с " + car.passengers + " пассажирами " + "проедет за 1 час " + distanceCar + " км.");
        System.out.println("Автомобиль с " + bus.passengers + " пассажирами " + "проедет за 1 час " + distanceBus + " км.");
    }
}

