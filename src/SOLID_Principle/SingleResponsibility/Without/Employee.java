package SOLID_Principle.SingleResponsibility.Without;

public class Employee {
    private String name;
    private String designation;
    private double salaryPerHour;
    Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salaryPerHour = salary;
    }

    public double calculateSalary(int hours) {
        return hours*salaryPerHour;

    }
    public void saveToDatabase() {
        //business logic
        System.out.println("Saving data to database");
    }

    public void getReport() {
        System.out.println("Getting Report of Employee");
    }
}
