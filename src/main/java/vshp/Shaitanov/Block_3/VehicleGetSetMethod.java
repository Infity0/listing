package vshp.Shaitanov.Block_3;

public class VehicleGetSetMethod {

    public static void main(String[] args) {

        Vehicle7 ferrari = new Vehicle7(2, -2, 360, 12);
        System.out.println("Max скорость: " + ferrari.getMaxspeed() + " км/ч");
        System.out.println("Число колёс: " + ferrari.getWheels());

        ferrari.setWheels(4);
        System.out.println("Число колёс (повторно):  " + ferrari.getWheels());

    }

}

