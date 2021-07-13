public class FoodMake {

    private static double menu(double mealPrice, double tipRate, double taxRate) {


        double tip = tipRate * mealPrice;
        double tax = taxRate * mealPrice;
        double result = (mealPrice + tip) +tax;

       return  result;

    }

    public static void main(String[] args) {
        menu(2,0,.2);
        menu(3,.1,.2);
    }
}
