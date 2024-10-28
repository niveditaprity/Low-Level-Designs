package ParkingLot;

public class Vehicle {
    private int vehicleId;
    private String vehicleNumber;
    private String color;
    private ParkingSpotType parkingSpotType;



    Vehicle(int vehicleId, String vehicleNumber, String color, ParkingSpotType parkingSpotType) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.color = color;
        this.parkingSpotType = parkingSpotType;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
