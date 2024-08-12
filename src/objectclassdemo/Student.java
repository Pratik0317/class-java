package objectclassdemo;

public class Student {
	String name;
	Integer roll_no;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(Integer roll_no) {
		this.roll_no = roll_no;
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("John");
		student.setRoll_no(2);
		
		System.out.println("Name: "+student.getName()+"\nRoll no: "+student.getRoll_no());
	}
}
