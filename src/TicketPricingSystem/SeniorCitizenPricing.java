package TicketPricingSystem;

public class SeniorCitizenPricing implements TicketPricingStrategy{
    @Override
    public Double price(Passenger passenger, Journey journey,Double amount) {
        if(passenger.getAge()>=50) {
            amount = amount - amount * 0.15;
            System.out.println("Early Bird Ticket Price is: " + amount);
            return amount;
        }
        return amount;
    }
}
