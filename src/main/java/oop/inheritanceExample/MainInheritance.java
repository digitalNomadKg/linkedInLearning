package oop.inheritanceExample;

class Calculator{

    protected double add(double a, double b){
        return a +b;
    }
}

class AdvancedCalc extends Calculator{

    protected int mult(int a, int b, int c){
        return (a*b)/c;
    }

    protected double div(double a, double b){
        return (a/b);
    }
}


public class MainInheritance {

    public static void main(String[] args) {
        AdvancedCalc advancedCalc =new AdvancedCalc();


        System.out.println(advancedCalc.add(4,7));
        System.out.println(advancedCalc.mult(10,6,2));
        System.out.println(advancedCalc.div(453,45));
        System.out.println(advancedCalc.div(8, 4));

    }


}
