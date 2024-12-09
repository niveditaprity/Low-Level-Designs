package TicketPricingSystem;

public class Passenger {
    public String name;
    public int age;
    public Boolean isBusiness;
    Passenger(String name, Boolean isBusiness,int age) {
        this.name = name;
        this.isBusiness = isBusiness;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getBusiness() {
        return isBusiness;
    }

    public void setBusiness(Boolean business) {
        isBusiness = business;
    }
}
