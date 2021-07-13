import java.util.Scanner;

public class Questionare {

    private static void test(){
        String question = "Question: Who is the last Prophet in Islamic world?";
        String answer = "1) Jesus Christ a.s 2) Moses a.s 3) Muhammad s.a.v 4) Ibrahim a.s ";

        System.out.println(question);
        System.out.println(answer);

        Scanner input = new Scanner(System.in);
        boolean userAnswer = true;

        while (userAnswer){
            String userInput = input.next();

            if(userInput.equalsIgnoreCase("Muhammad")){
                userAnswer=false;
                System.out.println("Congratulations! This is correct answer");


            } else {

                    System.out.println("Sorry wrong answer, try once");
                }
            }
        }

    public static void main(String[] args) {
        Questionare questionare = new Questionare();

        test();
    }
}
