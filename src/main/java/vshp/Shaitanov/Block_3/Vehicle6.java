package vshp.Shaitanov.Block_3;

public class Vehicle6 {
    int passengers; //кол-во пассажиров
    int wheels; //кол-во колёс
    int maxspeed; //макс скорость
    int burnup; //расход топлива

    Vehicle6(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
}

