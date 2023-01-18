package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
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
