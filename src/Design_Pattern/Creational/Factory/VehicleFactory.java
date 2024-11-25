package Design_Pattern.Creational.Factory;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicle) {
        if(vehicle.equalsIgnoreCase("Car")) {
            return new Car();
        }else if(vehicle.equalsIgnoreCase("Bus")) {
            return  new Bus();
        }else if(vehicle.equalsIgnoreCase("Truck")) {
            return new Truck();
        }else {
            throw new IllegalArgumentException("Unknown vehicle type: " + vehicle);
        }
    }
}
