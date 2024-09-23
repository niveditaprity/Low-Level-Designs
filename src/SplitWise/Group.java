package SplitWise;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupId;
    public static int splitId = 0;
    private String groupName;
    private List<User> groupUsers;
    private List<Expense> expenseList;
    private User createdBy;

    public Group(int groupId, String groupName, User createdBy) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupUsers = new ArrayList<>();
        this.expenseList = new ArrayList<>();
        this.createdBy = createdBy;
        this.groupUsers.add(createdBy);
    }

    public void addUserToGroup(User user) {
        if (!groupUsers.contains(user)) {
            System.out.println("User : " + user.getUserName() + " is getting added to group");
            groupUsers.add(user);
        } else {
            System.out.println("User : " + user.getUserName() + " is already in group");
        }
    }

    public void splitAmount(Expense expense, SplitType splitType, User paidBy) {
        if (splitType == SplitType.EQUAL) {
            Double splitAmount = expense.getExpenseAmount() / this.groupUsers.size();
            List<Split> splitList = new ArrayList<>();
            for (User user : groupUsers) {
                Split split = new Split(splitId++, splitAmount, user);
                if (user != paidBy) {
                    System.out.println("Adding balance for user: " + user.getUserName());
                    updateBalanceBetweenUsers(user, paidBy, splitAmount); // debtor, creditor
                }
                splitList.add(split);
            }
            expense.setSplits(splitList);
        }
    }

    private void updateBalanceBetweenUsers(User debtor, User creditor, Double amount) {
        // Find or create the balance record for the debtor
        Balance debtorBalance = getOrCreateBalance(debtor.getBalanceList(), creditor);
        debtorBalance.setOwe(debtorBalance.getOwe() + amount); // Debtor owes more

        // Find or create the balance record for the creditor
        Balance creditorBalance = getOrCreateBalance(creditor.getBalanceList(), debtor);
        creditorBalance.setOwed(creditorBalance.getOwed() + amount); // Creditor is owed more
    }

    private Balance getOrCreateBalance(List<Balance> balanceList, User otherUser) {
        for (Balance balance : balanceList) {
            if (balance.getUser() == otherUser) {
                return balance; // Existing balance record found
            }
        }
        // No existing balance found, create a new one
        Balance newBalance = new Balance(otherUser);
        balanceList.add(newBalance);
        return newBalance;
    }
}
