package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotSystem {
    private List<Floor> floorList = new ArrayList<>(3);
    private List<ExitGate> exitGateList = new ArrayList<>(3);
    private List<EntryGate> entryGateList = new ArrayList<>(3);

    ParkingLotSystem() {
        for (int i = 0; i < 3; i++) {
            Floor floor = new Floor();
            List<ParkingSpot> twoWheelerSpots = new ArrayList<>();
            List<ParkingSpot> compactSpots = new ArrayList<>();
            List<ParkingSpot> largeSpots = new ArrayList<>();
            List<ParkingSpot> disabledSpots = new ArrayList<>();

            for (int j = 1; j <= 10; j++) {
                twoWheelerSpots.add(new ParkingSpot(j, ParkingSpotType.TWO_WHEELER));
                compactSpots.add(new ParkingSpot(j, ParkingSpotType.COMPACT));
                largeSpots.add(new ParkingSpot(j, ParkingSpotType.LARGE));
                disabledSpots.add(new ParkingSpot(j, ParkingSpotType.DISABLED));
            }

            floor.getParkingSpotTypeListMap().put(ParkingSpotType.TWO_WHEELER, twoWheelerSpots);
            floor.getParkingSpotTypeListMap().put(ParkingSpotType.COMPACT, compactSpots);
            floor.getParkingSpotTypeListMap().put(ParkingSpotType.LARGE, largeSpots);
            floor.getParkingSpotTypeListMap().put(ParkingSpotType.DISABLED, disabledSpots);

            floorList.add(floor);
        }

        for (int i = 1; i <= 3; i++) {
            entryGateList.add(new EntryGate(i));
            exitGateList.add(new ExitGate(i));
        }
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (Floor floor : floorList) {
            ParkingSpot availableSpot = floor.findAvailableSpot(vehicle.getParkingSpotType());
            if (availableSpot != null) {
                availableSpot.parkVehicle(vehicle);
                Ticket ticket = new Ticket();
                ticket.setVehicle(vehicle);
                ticket.setParkingSpot(availableSpot);
                System.out.println("Vehicle parked at floor " + floor.getFloorId() + ", spot " + availableSpot.getParkingSpotId());
                return ticket;
            }
        }
        System.out.println("No available parking spot for vehicle type: " + vehicle.getParkingSpotType());
        return null;
    }

    public void checkoutVehicle(Ticket ticket) {
        ExitGate exitGate = exitGateList.get(0);
        exitGate.checkout(ticket);
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        if (parkingSpot != null) {
            parkingSpot.unparkVehicle();  // Directly unpark using the parking spot from the ticket
        }
        
    }

}
