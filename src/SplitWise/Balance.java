package SplitWise;

public class Balance {
    private Double balanceAmount = 0.0;
    private User user;

    Balance(Double balanceAmount, User user) {
        this.balanceAmount = balanceAmount;
        this.user = user;
    }

    public Double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
