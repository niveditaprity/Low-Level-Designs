package SOLID_Principle.OCP.With;

public class CreditCardPayment implements  Payment{
    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card payment...");
    }
}
