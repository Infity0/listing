package vshp.Shaitanov.Block_3;

public class Vehicle4 {
    int passengers; //кол-во пассажиров
    int wheels; //кол-во колёс
    int maxspeed; //макс скорость
    int burnup; //расход топлива

    Vehicle4(int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed = ms;
        burnup = bu;
    }

    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }

}

