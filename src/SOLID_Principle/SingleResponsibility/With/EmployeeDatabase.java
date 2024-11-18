package SOLID_Principle.SingleResponsibility.With;

public class EmployeeDatabase {
    public  void saveToDatabase(Employee employee) {
        System.out.println("Saving Employee to Database  " + employee.getName());
    }
}
