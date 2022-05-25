package week4.assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id "+ id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("id "+ id+" Name "+name);
	}
	public void getStudentInfo(String email, long phonenumber) {
		System.out.println("Email "+email+ " Number is "+phonenumber);
	}

	public static void main(String[] args) {
		Students stud=new Students();
		stud.getStudentInfo(123);
		stud.getStudentInfo(764,"Sara");
		stud.getStudentInfo("abc@123",8738470309l);

	}

}
