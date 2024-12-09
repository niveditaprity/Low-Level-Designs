package TicketPricingSystem;

public class Client {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Nivedita",true,27);
        Journey journey = new Journey(30);

        PricingContext pricingContext = new PricingContext(new RegularPricing());
        pricingContext.price(passenger,journey,100.0);
        pricingContext = new PricingContext(new EarlyBirdPricing());
        pricingContext.price(passenger,journey,200.0);
    }
}
