package inheritanceprac;

public class VIPCustomer extends Customer{
	
	private double saleRatio;
	private int agentID;
	
	VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ID�� " + agentID + "�Դϴ�.";
	}

	
}
