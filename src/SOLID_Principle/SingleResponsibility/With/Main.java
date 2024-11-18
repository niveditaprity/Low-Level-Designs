package SOLID_Principle.SingleResponsibility.With;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Developer", 50);
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        ReportGenerator reportGenerator = new ReportGenerator();

        int hoursWorked = 40;
        double salary = salaryCalculator.calculateSalary(employee, hoursWorked);
        System.out.println("Salary: " + salary);

        employeeDatabase.saveToDatabase(employee);
        reportGenerator.generateReport(employee);
    }
}
