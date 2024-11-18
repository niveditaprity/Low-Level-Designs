package SOLID_Principle.SingleResponsibility.With;

public class Employee {
    private String name;
    private String designation;
    private double salaryPerHour;
    Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salaryPerHour = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public String getDesignation() {
        return designation;
    }
}
