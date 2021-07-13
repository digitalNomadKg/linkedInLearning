import java.util.Scanner;

public class Triangle {


    private static void calc() {

        Scanner input = new Scanner(System.in);

        boolean userInput = true;

        String inputBase = "Please enter BASE of the Triangle:";
        String inputHeight = "Please enter HEIGHT of the triangle:";

        while (userInput) {
            System.out.println(inputBase);
            int base = input.nextInt();

            System.out.println(inputHeight);
            int height = input.nextInt();

            if (base == 0 || height == 0) {

                System.out.println("The base or height can't be equal to 0");
                userInput = false;

            } else {
                int area = (base * height) / 2;
                System.out.println("The area of the triangle is: " + area);
                System.out.println(" ");
                System.out.println("You can try one more time: ;)");
            }
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        calc();

    }
}
