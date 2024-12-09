package TicketPricingSystem;

public class RegularPricing implements  TicketPricingStrategy{
    @Override
    public Double price(Passenger passenger, Journey journey,Double amount) {
        System.out.println("Regular Ticket Price:" + amount);
        return amount;
    }
}
