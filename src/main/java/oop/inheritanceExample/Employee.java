package oop.inheritanceExample;

public class Employee extends Person {

    protected String jobTitle;
    protected int id;
    protected double salary;

    public Employee(String fullName, String jobTitle, int id, double salary) {
        super(fullName);
        this.jobTitle =jobTitle;
        this.id = id;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}
