package templateex;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void washCar() {}
	
	public void startCar() {
		System.out.println("���� �õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("���� �õ��� ���ϴ�.");
	}
	
	public final void run() {
		startCar();
		drive();
		stop();
		washCar();
		turnOff();
	}

}
