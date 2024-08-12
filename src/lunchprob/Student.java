package lunchprob;

public class Student {

	private String firstName;
	private String lastName;
	private Integer rollNo;
	
	public Student() {

	}
	
	public Student(String firstName, String lastName, int rollNo) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.rollNo=rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	
	
}
