package Design_Pattern.Creational.Factory;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("car");
        vehicle.startEngine();
    }
}
