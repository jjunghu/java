package templateex;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("�ڵ����� ������ �����մϴ�.");
		System.out.println("�ڵ����� ������ ������ ��ȯ�մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�ڵ����� ������ ����ϴ�.");
	}
	
	public void washCar() {
		System.out.println("�ڵ����� �����մϴ�.");
	}
	
	

}
