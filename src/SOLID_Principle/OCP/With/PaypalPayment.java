package SOLID_Principle.OCP.With;

public class PaypalPayment implements  Payment{
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}
