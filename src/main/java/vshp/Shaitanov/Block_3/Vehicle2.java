package vshp.Shaitanov.Block_3;

public class Vehicle2 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    void distance(double interval) {
        double value = maxspeed * interval;
        System.out.println("Пройдёт путь, равный " + value + " км.");
    }
}

