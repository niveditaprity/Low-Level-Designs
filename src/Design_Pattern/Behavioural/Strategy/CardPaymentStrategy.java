package Design_Pattern.Behavioural.Strategy;

public class CardPaymentStrategy implements  PaymentStrategy {
    public String cardNumber;

    CardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void payAmount(int amount) {
        System.out.println("Payment is done through card , Paid amount is:" + amount);

    }
}
