package TicketPricingSystem;

public class PremiumPricing implements TicketPricingStrategy{
    @Override
    public Double price(Passenger passenger, Journey journey,Double amount) {
        if(passenger.isBusiness) {
            amount = amount - amount * 0.2;
            System.out.println("Early Bird Ticket Price is: " + amount);
            return amount;
        }
        return amount;
    }
}
