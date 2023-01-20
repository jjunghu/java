package corporationprac;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student jenny = new Student("Jenny", 5000);
		Student dal = new Student("Dal", 10000);
		
		Bus bus100 = new Bus(100);
		jenny.takeBus(bus100);
		jenny.showInfo();
		bus100.showInfo();
		
		Subway subway2 = new Subway(2);
		dal.takeSubway(subway2);
		dal.showInfo();
		subway2.showInfo();
		

	}

}
