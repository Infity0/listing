package vshp.Shaitanov.Block_3;

public class PolyVehicleDemo {

    public static void main(String[] args) {

        Auto1 a = new Auto1(true);
        Vehicle12 v = new Vehicle12();


        Vehicle12[] pvd = {a, v};

        for (int i = 0; i < pvd.length; i++) {

            System.out.println(pvd[i].toString());
        }
    }
}

