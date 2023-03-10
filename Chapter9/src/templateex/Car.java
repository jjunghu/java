package templateex;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void washCar() {}
	
	public void startCar() {
		System.out.println("차가 시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("차가 시동을 끕니다.");
	}
	
	public final void run() {
		startCar();
		drive();
		stop();
		washCar();
		turnOff();
	}

}
