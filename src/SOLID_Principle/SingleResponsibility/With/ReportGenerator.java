package SOLID_Principle.SingleResponsibility.With;

public class ReportGenerator {
    public void generateReport(Employee employee) {
        System.out.println("Generating Report of the Employee  " + employee.getName());
    }
}
