package studentProfile;

public class Student {

    static String student, student1;

    String firstName, lastName;
    int id, expectedGradYear;
    double studentGPA;

    public Student(String firstName, String lastName, int id, int expectedGradYear,
                   double studentGPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.expectedGradYear = expectedGradYear;
        this.studentGPA = studentGPA;

    }


}