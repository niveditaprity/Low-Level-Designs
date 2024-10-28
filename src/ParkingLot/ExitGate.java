package ParkingLot;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExitGate {
    private int exitGateId;

    ExitGate(int exitGateId) {
        this.exitGateId = exitGateId;
    }
    public void checkout(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        Duration duration = Duration.between(entryTime, exitTime);
        long hours = duration.toHours();
        ParkingSpotType parkingSpotType = ticket.getVehicle().getParkingSpotType();
        Double cost = CostCalculation(parkingSpotType,hours);
        ticket.setCost(cost);
        System.out.println("Rs." + cost + " payment is done");
    }

    private Double CostCalculation(ParkingSpotType parkingSpotType,long hours) {
        Double cost = 0.0;
        if(parkingSpotType.equals(ParkingSpotType.TWO_WHEELER)) {
            cost = cost + hours*10;

        } else if(parkingSpotType.equals(ParkingSpotType.COMPACT)) {
            cost = cost + hours*15;
        }
        else if(parkingSpotType.equals(ParkingSpotType.LARGE)) {
            cost = cost + hours*20;
        }else {
            cost = cost + hours*8;
        }
        return cost;
    }
}
