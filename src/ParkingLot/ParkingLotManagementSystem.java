package ParkingLot;

public class ParkingLotManagementSystem {
    public static void main(String[] args) {
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
        Vehicle vehicle = new Vehicle(1, "RS78JK", "Red", ParkingSpotType.TWO_WHEELER);

        Ticket ticket = parkingLotSystem.parkVehicle(vehicle);

       if (ticket != null) {
           parkingLotSystem.checkoutVehicle(ticket);
        }
        Vehicle vehicle2 = new Vehicle(2, "RS78JK", "Red", ParkingSpotType.TWO_WHEELER);

        Ticket ticket2 = parkingLotSystem.parkVehicle(vehicle2);

        if (ticket2 != null) {
            parkingLotSystem.checkoutVehicle(ticket2);
        }
    }
}
