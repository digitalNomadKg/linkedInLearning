package example;

public class Triangle2 {

    double base;
    double height;
    double side1;
    double side2;
    double side3;

    public Triangle2(double base, double height,
                     double side1,
                     double side2,
                     double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double area() {
        double areaResult = (base * height) / 2;
        return areaResult;
    }
}
