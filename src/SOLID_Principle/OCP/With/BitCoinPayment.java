package SOLID_Principle.OCP.With;

public class BitCoinPayment implements  Payment{
    @Override
    public void processPayment() {
        System.out.println("Processing Bitcoin payment...");
    }
}
