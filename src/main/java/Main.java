import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int studentAge = 34;
        double studentGPA = 3.5;
        String firstName = "Tim";
        String lastName  = "Kirves";
        char firstNameLetter = firstName.charAt(2);
        char lastNameLetter = lastName.charAt(4);
        boolean hasPerfectAttendance = true;


        System.out.println(firstName +" "+lastName +" "+ studentAge+" " + studentGPA);
        System.out.println(firstNameLetter + " "+ lastNameLetter);

        System.out.println("Which GPA you would update for the user?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println("new updated GPA is: " + studentGPA);
    }
}
