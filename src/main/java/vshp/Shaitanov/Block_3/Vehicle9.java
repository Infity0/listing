package vshp.Shaitanov.Block_3;

public class Vehicle9 {

    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle9() {
        this(4, 4, 160, 13);
    } //Vehicle() конструктор

    Vehicle9(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
}

