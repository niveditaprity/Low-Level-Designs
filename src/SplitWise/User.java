package SplitWise;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String userName;
    private String mobileNumber;
    private String emailId;

    private List<Balance>balanceList;

    private List<Group> groupList;

    public User(int userId, String userName, String mobileNumber, String emailId) {
        this.userId = userId;
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.groupList = new ArrayList<>();
        this.balanceList = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public void addGroupToUser(Group group) {
        if(!getGroupList().contains(group)) {
            this.groupList.add(group);
        }
    }

    public void addBalance(Balance balance) {
        System.out.println("Balance is getting added use balance sheet");
        this.balanceList.add(balance);
    }

    public List<Balance> getBalanceList() {
        return balanceList;
    }

    public void setBalanceList(List<Balance> balanceList) {
        this.balanceList = balanceList;
    }
}
