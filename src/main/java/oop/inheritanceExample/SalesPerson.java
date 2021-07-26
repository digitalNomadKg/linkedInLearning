package oop.inheritanceExample;

public class SalesPerson  extends Employee{

    protected double  bonus;

    public SalesPerson(String fullName, String jobTitle, int id, double salary, double bonus) {
        super(fullName, jobTitle, id, salary);
        this.bonus = bonus;
    }



}
