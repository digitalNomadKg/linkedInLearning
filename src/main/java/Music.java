import java.util.Scanner;

public class Music {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        System.out.println("Playing current song");
        System.out.println("or would you like to change it? if so, answer: yes");

        while (isOnRepeat) {
            String userInput = input.next();
            if (userInput.equalsIgnoreCase("yes")) {
                isOnRepeat = false;
                System.out.println("Hooray, here we go, the next song is playing, enjoy");
            }else {
                System.out.println("Please choose yes to play new song");
//                userInput = input.next();
            }
        }
    }
}
