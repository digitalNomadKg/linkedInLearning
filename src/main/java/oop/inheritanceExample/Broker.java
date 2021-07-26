package oop.inheritanceExample;

public class Broker extends Employee{

    protected double commission;

    public Broker(String fullName, String jobTitle, int id, double salary, double com) {
        super(fullName, jobTitle, id, salary);
        this.commission = com;
    }

   protected double commission (){
     commission = salary * commission;
     return  commission;
    }


    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
