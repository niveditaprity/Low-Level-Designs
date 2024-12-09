package TicketPricingSystem;

public class PricingContext {
    public TicketPricingStrategy ticketPricingStrategy;
    PricingContext (TicketPricingStrategy ticketPricingStrategy) {
        this.ticketPricingStrategy = ticketPricingStrategy;
    }
    public Double price(Passenger passenger, Journey journey,Double amount) {
        amount = this.ticketPricingStrategy.price(passenger,journey,amount);
        return amount;
    }
}
