package ParkingLot;

public class EntryGate {
    private int entryGateID;
    private Ticket ticket;

    EntryGate(int entryGateID) {
        this.entryGateID = entryGateID;
    }
    public int getEntryGateID() {
        return entryGateID;
    }

    public void setEntryGateID(int entryGateID) {
        this.entryGateID = entryGateID;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public Ticket generateTicket() {
        return new Ticket();
    }


}
