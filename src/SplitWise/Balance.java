package SplitWise;

public class Balance {
    private User user;  // The user for whom this balance is recorded (either creditor or debtor)
    private Double owe = 0.0;  // How much the current user owes this other user
    private Double owed = 0.0; // How much this user is owed by the other user

    public Balance(User user) {
        this.user = user;
    }

    public Double getOwe() {
        return owe;
    }

    public void setOwe(Double owe) {
        this.owe = owe;
    }

    public Double getOwed() {
        return owed;
    }

    public void setOwed(Double owed) {
        this.owed = owed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
