package SplitWise;

import java.util.List;

public class Expense {
    private int expenseId;
    private String expenseDescription;

    private Double expenseAmount = 0.0;
    private List<Split>splits;

    public Expense(int expenseId, String expenseDescription, Double expenseAmount) {
        this.expenseId = expenseId;
        this.expenseAmount = expenseAmount;
        this.expenseDescription = expenseDescription;
    }





    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public Double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }
}
