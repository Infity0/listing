package vshp.Shaitanov.Block_3;

abstract class Shape {

    abstract double area();
}
class Point extends Shape {
    public String toString() {return "Точка";}

    @Override
    double area() {
        return 0;
    }
}

class Triangle extends Shape {
    int cathetus1;
    int cathetus2;

    Triangle(int cathetus1, int cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    public String toString() {return "Треугольник";}

    double area() {
        return ((cathetus1 * cathetus2) / 2.0);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public String toString() {return "Круг";}

    double area() {
        return ((radius * radius) * 3.14);
    }
}

