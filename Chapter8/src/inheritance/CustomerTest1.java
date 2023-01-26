package inheritance;

import java.util.ArrayList;

public class CustomerTest1 {

	public static void main(String[] args) {

		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10100, "������");
		Customer customerKim = new Customer(10101, "������");
		GoldCustomer customerHan = new GoldCustomer(10102, "������");
		GoldCustomer customerBae = new GoldCustomer(10103, "�����");
		VIPCustomer customerHong = new VIPCustomer(10104, "ȫ�ƿ�", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHan);
		customerList.add(customerBae);
		customerList.add(customerHong);
		
		System.out.println("===== �� ���� ��� =====");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		int price = 10000;
		for (Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� �����Ͻ� �ݾ��� " + cost + "���Դϴ�.");
			System.out.println(customer.showCustomerInfo());
		}
	}

}
