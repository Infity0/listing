package vshp.Shaitanov.Block_3;

public class Vehicle7 {
    int passengers; //кол-во пассажиров
    private int wheels; //число колёс
    private  int maxspeed; //макс скорость
    int burnup; //расход топлива

    Vehicle7(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }

    int getMaxspeed() {
        return this.maxspeed;
    }

    int getWheels() {
        return this.wheels;
    }

    void setWheels(int wheels) {

        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Неверно указано число колёс.");
            return;
        }
        this.wheels = wheels;
    }

}

