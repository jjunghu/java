package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이지은";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영둥포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김수지";
		studentKim.studentID = 101;
		studentKim.address = "미국 어딘가";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
