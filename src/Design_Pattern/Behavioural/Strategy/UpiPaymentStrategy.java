package Design_Pattern.Behavioural.Strategy;

public class UpiPaymentStrategy  implements  PaymentStrategy{
    public String upiId;

    UpiPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }
    @Override
    public void payAmount(int amount) {
        System.out.println("Amount: " + amount +" is paid by UpiId :" + upiId);

    }
}
