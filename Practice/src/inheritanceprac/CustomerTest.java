package inheritanceprac;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1000 = new Customer(101000, "이지은");
		Customer customer1001 = new Customer(101001, "배수지");
		GoldCustomer customer1002 = new GoldCustomer(101002, "김희선");
		GoldCustomer customer1003 = new GoldCustomer(101003, "김태희");
		VIPCustomer customer1004 = new VIPCustomer(101004, "한지민", 12345);
		
		customerList.add(customer1000);
		customerList.add(customer1001);
		customerList.add(customer1002);
		customerList.add(customer1003);
		customerList.add(customer1004);
		
		System.out.println("===== 고객 정보 출력 =====");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 100000;
		System.out.println("===== 할인율과 보너스 포인트 결과 =====");
		for(Customer customer: customerList) {
			System.out.println(customer.getCustomerName() + "님의 지불하실 금액은 " + customer.calcPrice(price) + "원 입니다.");
			System.out.println(customer.showCustomerInfo());
		}

	}

}
