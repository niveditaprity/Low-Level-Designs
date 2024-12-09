package TicketPricingSystem;

public class EarlyBirdPricing implements  TicketPricingStrategy{
    @Override
    public Double price(Passenger passenger, Journey journey,Double amount) {
        if(journey.getDaysToJourney()>=16) {
            System.out.println("Early Bird Ticket Price:" + amount);
            amount = amount - amount * 0.1;
            System.out.println("Early Bird Ticket Price is: " + amount);
            return amount;
        }else {
            System.out.println("Regular Ticket Price:" + amount);
        }
        return amount;
    }
}
