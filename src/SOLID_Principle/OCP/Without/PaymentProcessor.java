package SOLID_Principle.OCP.Without;


//here if we add new payment then we have to modify this function and class
public class PaymentProcessor {
    public void processPayment(String paymentType) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing Credit Card payment...");
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment...");
        } else if (paymentType.equals("Bitcoin")) {
            System.out.println("Processing Bitcoin payment...");
        } else {
            throw new IllegalArgumentException("Unknown payment type");
        }
    }
}
