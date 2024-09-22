package SplitWise;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupId;
    public static int splitId = 0;
    private String groupName;
    private List<User> groupUsers;
    private List<Expense> expenseList;
    private User creadtedBy;

    public Group(int groupId, String groupName, User creadtedBy) {
        this.groupId = groupId;
        this.groupName = groupName;
        groupUsers = new ArrayList<>();
        expenseList = new ArrayList<>();
        this.creadtedBy = creadtedBy;
        groupUsers.add(creadtedBy);
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getGroupUsers() {
        return groupUsers;
    }

    public void setGroupUsers(List<User> groupUsers) {
        this.groupUsers = groupUsers;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }

    public void addUserToGroup(User user) {
        if (!groupUsers.contains(user)) {
            System.out.println("User : " + user.getUserName() + " is getting added to group");
            groupUsers.add(user);
        } else {
            System.out.println("User : " + user.getUserName() + "is already in group");

        }
    }

    public void splitAmount(Expense expense, SplitType splitType, User paidBy) {
        if (splitType == SplitType.EQUAL) {
            Double splitAmount = expense.getExpenseAmount() / this.groupUsers.size();
            List<Split> splitList = new ArrayList<>();
            for (User user : groupUsers) {
                Split split = new Split(splitId++, splitAmount, user);
                if (user != paidBy) {
                    System.out.println("Adding Balance to user : " + user.getUserName() );
                    updateBalanceBetweenUsers(user, paidBy,splitAmount);

                }
                splitList.add(split);
            }
            expense.setSplits(splitList);
        }

    }

    private void updateBalanceBetweenUsers(User debtor, User creditor, Double amount) {
        boolean balanceFound = false;

        // Update creditor's balance
        List<Balance> creditorBalanceList = creditor.getBalanceList();
        for (Balance balance : creditorBalanceList) {
            if (balance.getUser() == debtor) {
                balance.setBalanceAmount(balance.getBalanceAmount() + amount);
                balanceFound = true;
                break;
            }
        }
        if (!balanceFound) {
            Balance balance = new Balance(-amount, debtor);
            creditorBalanceList.add(balance);
        }

        // Update debtor's balance (reverse entry)
        balanceFound = false;
        List<Balance> debtorBalanceList = debtor.getBalanceList();
        for (Balance balance : debtorBalanceList) {
            if (balance.getUser() == creditor) {
                balance.setBalanceAmount(balance.getBalanceAmount() - amount);
                balanceFound = true;
                break;
            }
        }
        if (!balanceFound) {
            Balance balance = new Balance(-amount, creditor);
            debtorBalanceList.add(balance);
        }
    }
}
