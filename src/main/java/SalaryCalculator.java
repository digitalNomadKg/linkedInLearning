public class SalaryCalculator {

    private static double salaryCalc (double hoursPerWeek, double amountPerHour){

        double weeklyPayOut = (hoursPerWeek * amountPerHour);

        return weeklyPayOut;
    }


    public static void main(String[] args) {
         double salary =   salaryCalc(40,7.2);

        System.out.println("This is salary per 1 week: " + salary + "£");
    }
}
