package ParkingLot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor {
    private int floorId;
    private Map<ParkingSpotType, List<ParkingSpot>> parkingSpotTypeListMap = new HashMap<>();

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public Map<ParkingSpotType, List<ParkingSpot>> getParkingSpotTypeListMap() {
        return parkingSpotTypeListMap;
    }

    public void setParkingSpotTypeListMap(Map<ParkingSpotType, List<ParkingSpot>> parkingSpotTypeListMap) {
        this.parkingSpotTypeListMap = parkingSpotTypeListMap;
    }

    public ParkingSpot findAvailableSpot(ParkingSpotType parkingSpotType) {
        List<ParkingSpot> parkingSpots = parkingSpotTypeListMap.get(parkingSpotType);
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.isEmpty()) {
                return parkingSpot;
            }
        }
        return null;
    }
}
