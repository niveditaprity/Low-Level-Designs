package SplitWise;

public class Split {
    private int splitId;
    private Double splitAmount = 0.0;
    private User splitUser;

    Split(int splitId, Double splitAmount, User splitUser) {
        this.splitId = splitId;
        this.splitAmount = splitAmount;
        this.splitUser = splitUser;
    }

    public int getSplitId() {
        return splitId;
    }

    public void setSplitId(int splitId) {
        this.splitId = splitId;
    }

    public Double getSplitAmount() {
        return splitAmount;
    }

    public void setSplitAmount(Double splitAmount) {
        this.splitAmount = splitAmount;
    }

    public User getSplitUser() {
        return splitUser;
    }

    public void setSplitUser(User splitUser) {
        this.splitUser = splitUser;
    }
}
