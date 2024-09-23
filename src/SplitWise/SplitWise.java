package SplitWise;

import SplitWise.*;

import java.util.ArrayList;
import java.util.List;

public class SplitWise {
    public static void main(String[] args) {

        System.out.println("Split wise system");

        User u1 = new User(1,"Nivedita","797979087","nivu2211@gmail.com");
        User u2 = new User(2,"Surbhi","797979088","nivu2511@gmail.com");
        User u3 = new User(3,"Puja","797979086","nivu2219@gmail.com");


        Group g1 = new Group(1, "MUG",u1);
        g1.addUserToGroup(u2);
        g1.addUserToGroup(u3);

        u1.addGroupToUser(g1);
        u2.addGroupToUser(g1);
        u3.addGroupToUser(g1);

        Expense e1 = new Expense(1,"Food", 900.0);
        Expense e2 = new Expense(2,"Food", 900.0);
        Expense e3 = new Expense(3,"Food", 600.0);

        g1.splitAmount(e1, SplitType.EQUAL,u1);
        g1.splitAmount(e2, SplitType.EQUAL,u2);
        g1.splitAmount(e3, SplitType.EQUAL,u3);
        List<Balance> balanceList = u1.getBalanceList();
        System.out.println("balance sheet size: " +  balanceList.size() +  " user :" + u1.getUserName() );

        for(Balance balance: balanceList) {
            System.out.println("Balance Amount:" + (balance.getOwed()- balance.getOwe()) + "  username :" + balance.getUser().getUserName());
        }
        List<Balance> balanceList1 = u2.getBalanceList();
        System.out.println("balance sheet size: " +  balanceList1.size() +  " user :" + u2.getUserName() );

        for(Balance balance: balanceList1) {
            System.out.println("Balance Amount:" + (balance.getOwed()- balance.getOwe())+ "  username :" + balance.getUser().getUserName());
        }

        List<Balance> balanceList2 = u3.getBalanceList();
        System.out.println("balance sheet size: " +  balanceList2.size() +  " user :" + u3.getUserName() );

        for(Balance balance: balanceList2) {
            System.out.println("Balance Amount:" + (balance.getOwed()- balance.getOwe()) + "  username :" + balance.getUser().getUserName());
        }

    }
}