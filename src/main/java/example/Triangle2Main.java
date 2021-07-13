package example;

public class Triangle2Main {

    public static void main(String[] args) {

        Triangle2 triangleA = new Triangle2(15, 5, 3, 4, 8);
        double result = triangleA.area();
        System.out.println("Area of triangle 'A' is: " + result);
        System.out.println(triangleA.side1);
        System.out.println(triangleA.side2);
        System.out.println(triangleA.side3);
        System.out.println("");

        Triangle2 triangleB = new Triangle2(25, 8, 6, 8, 9);
        double resultB = triangleB.area();
        System.out.println("Area of triangle 'B' is: " + resultB);
        System.out.println(triangleB.side1);
        System.out.println(triangleB.side2);
        System.out.println(triangleB.side3);
    }
}
