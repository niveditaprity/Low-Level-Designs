package Design_Pattern.Behavioural.Strategy;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CardPaymentStrategy("1234RTYU789"));
        paymentContext.payment(100);
        paymentContext = new PaymentContext(new UpiPaymentStrategy("nivedita@xaxl"));
        paymentContext.payment(200);

    }
}
