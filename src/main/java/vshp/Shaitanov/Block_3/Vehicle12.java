package vshp.Shaitanov.Block_3;

public class Vehicle12 {
    int passengers; //кол-во пассажиров
    private int wheels; //число колёс
    private  int maxspeed; //макс скорость
    int burnup; //расход топлива

    Vehicle12() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
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

    public String toString() {
        return "Vehicle (passengers=" + passengers + ";" + "wheels=" + wheels + ";" + "maxspeed=" + maxspeed + ";" + "burnup=" + burnup + ")";
    }
}
class Auto1 extends Vehicle12 {
    boolean sunroof;

    Auto1(boolean sunroof) {
        this(4, 4, 200, 12, sunroof);
    }

    Auto1(int f, int g, int h, int j, boolean sunroof) {
        super();
        this.sunroof = sunroof;
    }
}

