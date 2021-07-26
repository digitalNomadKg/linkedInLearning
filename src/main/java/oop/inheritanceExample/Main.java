package oop.inheritanceExample;

public class Main {


    public static void main(String[] args) {


        Broker broker = new Broker("Tim Kirves", "Broker", 3879921, 2450, 0.3);
        System.out.println(broker.getSalary());
        broker.commission();
        System.out.println(broker.getCommission());

        System.out.println(broker.getFullName() + " " + broker.getJobTitle() + " " + broker.getId() + " " + broker.getSalary() + " " + broker.getCommission());


    }
}
