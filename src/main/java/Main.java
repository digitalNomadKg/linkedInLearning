import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Choose a number between 1 and 10");
        Scanner scanner =  new Scanner(System.in);

        int numberIn = scanner.nextInt();

        if(numberIn <5){
            System.out.println("Enjoy the good luck a friend brings you");
        }else{
            System.out.println("Your shoe selection will make you hapy today");
        }

//        int studentAge = 34;
//        double studentGPA = 3.5;
//        String firstName = "Tim";
//        String lastName  = "Kirves";
//        char firstNameLetter = firstName.charAt(2);
//        char lastNameLetter = lastName.charAt(4);
//        boolean hasPerfectAttendance = true;
//
//
//        System.out.println(firstName +" "+lastName +" "+ studentAge+" " + studentGPA);
//        System.out.println(firstNameLetter + " "+ lastNameLetter);
//
//        System.out.println("Which GPA you would update for the user?");
//        Scanner input = new Scanner(System.in);
//        studentGPA = input.nextDouble();
//
//        System.out.println("new updated GPA is: " + studentGPA);
    }
}
