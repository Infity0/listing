package vshp.Shaitanov.Block_3;

public class Vehicle10 {

    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle10() {
        this(4, 4, 160, 13);
    } //Vehicle() конструктор

    Vehicle10(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance(double interval) {
        return distance((double) interval);
    } //distance(int)

}

