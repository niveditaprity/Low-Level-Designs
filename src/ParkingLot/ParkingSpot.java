package ParkingLot;

public class ParkingSpot {
    private int parkingSpotId;
    private Vehicle vehicle;
    private boolean isEmpty = true;
    private ParkingSpotType parkingSpotType;

    ParkingSpot(int parkingSpotId ,ParkingSpotType parkingSpotType)  {
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty =  false;
    }

    public void unparkVehicle() {
        this.isEmpty = true;
        this.vehicle = null;
    }
}
