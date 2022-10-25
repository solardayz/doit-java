package chapter08.polymorphism;

public class CustomerVIP extends Customer{

    private int agentID;
    double saleRatio;

    public CustomerVIP(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    public String showInfo(){
        return super.showInfo() + " 담당 상담원 번호는 " + agentID + "입니다";
    }

    public int getAgentID(){
        return agentID;
    }
}
