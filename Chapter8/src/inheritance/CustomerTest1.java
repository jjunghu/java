package inheritance;

import java.util.ArrayList;

public class CustomerTest1 {

	public static void main(String[] args) {

		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10100, "이지은");
		Customer customerKim = new Customer(10101, "김태희");
		GoldCustomer customerHan = new GoldCustomer(10102, "한지민");
		GoldCustomer customerBae = new GoldCustomer(10103, "배수지");
		VIPCustomer customerHong = new VIPCustomer(10104, "홍아영", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHan);
		customerList.add(customerBae);
		customerList.add(customerHong);
		
		System.out.println("===== 고객 정보 출력 =====");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 결과 =====");
		int price = 10000;
		for (Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님의 지불하실 금액은 " + cost + "원입니다.");
			System.out.println(customer.showCustomerInfo());
		}
	}

}
