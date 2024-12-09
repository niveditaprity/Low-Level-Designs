package TicketPricingSystem;

public interface TicketPricingStrategy {
    public Double price(Passenger passenger, Journey journey,Double amount);
}
