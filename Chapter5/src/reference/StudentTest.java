package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentJames = new Student();
		studentJames.studentID = 100;
		studentJames.studentName = "James";
		
		studentJames.setKorea("����", 100);
		studentJames.setMath("����", 100);
		
		Student studentThomas = new Student();
		studentThomas.studentID = 101;
		studentThomas.studentName = "Thomas";
		
		studentThomas.setKorea("����", 80);
		studentThomas.setMath("����", 60);
		
		studentJames.showStudentInfo();
		studentThomas.showStudentInfo();
	}

}