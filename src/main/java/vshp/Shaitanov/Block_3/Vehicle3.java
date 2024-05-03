package vshp.Shaitanov.Block_3;

public class Vehicle3 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }
}

