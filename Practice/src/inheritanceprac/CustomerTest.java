package inheritanceprac;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1000 = new Customer(101000, "������");
		Customer customer1001 = new Customer(101001, "�����");
		GoldCustomer customer1002 = new GoldCustomer(101002, "����");
		GoldCustomer customer1003 = new GoldCustomer(101003, "������");
		VIPCustomer customer1004 = new VIPCustomer(101004, "������", 12345);
		
		customerList.add(customer1000);
		customerList.add(customer1001);
		customerList.add(customer1002);
		customerList.add(customer1003);
		customerList.add(customer1004);
		
		System.out.println("===== �� ���� ��� =====");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 100000;
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		for(Customer customer: customerList) {
			System.out.println(customer.getCustomerName() + "���� �����Ͻ� �ݾ��� " + customer.calcPrice(price) + "�� �Դϴ�.");
			System.out.println(customer.showCustomerInfo());
		}

	}

}
