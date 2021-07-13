import java.util.Scanner;

public class Triangle {


    private static void calc() {

        Scanner input = new Scanner(System.in);

        String inputBase = "Please enter BASE of the Triangle:";
        String inputHeight = "Please enter HEIGHT of the triangle:";

        System.out.println(inputBase);

        double base = input.nextDouble();
        while (base <= 0) {
            System.out.println("The base can't be equal to 0 or negative:");
            base = input.nextDouble();
        }

        System.out.println(inputHeight);
        double height = input.nextDouble();
        while (height <= 0) {

            System.out.println("The height can't be equal to 0 or negative:");
            height = input.nextDouble();

        }
        double area =  (base * height) / 2;
        System.out.println("The AREA of the triangle is: " + area);

    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        calc();
    }
}
