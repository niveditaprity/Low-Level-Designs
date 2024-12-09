package Design_Pattern.Behavioural.Strategy;

public class PaymentContext {
    public  PaymentStrategy paymentStrategy;

    PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payment(int amount) {
        this.paymentStrategy.payAmount(amount);
    }
}
