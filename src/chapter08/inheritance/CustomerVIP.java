package chapter08.inheritance;

public class CustomerVIP extends Customer{

    private int agentID;
    double saleRatio;

    public CustomerVIP() {
        customerGrade = "VIP";
        bonusRate = 0.05;
        saleRatio = 0.1;
    }

    public CustomerVIP(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRate = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRate;
        return price - (int) (price * saleRatio);
    }

    public int getAgentID() {
        return agentID;
    }
}
