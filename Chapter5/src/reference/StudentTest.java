package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentJames = new Student();
		studentJames.studentID = 100;
		studentJames.studentName = "James";
		
		studentJames.setKorea("국어", 100);
		studentJames.setMath("수학", 100);
		
		Student studentThomas = new Student();
		studentThomas.studentID = 101;
		studentThomas.studentName = "Thomas";
		
		studentThomas.setKorea("국어", 80);
		studentThomas.setMath("수학", 60);
		
		studentJames.showStudentInfo();
		studentThomas.showStudentInfo();
	}

}
