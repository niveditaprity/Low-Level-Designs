package SOLID_Principle.SingleResponsibility.With;

public class SalaryCalculator {
    public double calculateSalary(Employee employee, int hours) {
        return employee.getSalaryPerHour()*hours;
    }
}
