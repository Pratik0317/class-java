package lunchprob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentIO {

	Scanner scanner = new Scanner(System.in);
	
	public List<Student>  readStudent(){
		List<Student> studentList = new ArrayList<Student>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter your firstName: ");
			String firstName = scanner.nextLine();
			System.out.println("Enter your lastName :");
			String lastName = scanner.nextLine();
			System.out.println("Enter your roll no: ");
			Integer rollNo = scanner.nextInt();
		    scanner.nextLine();
			
			studentList.add(new Student(firstName, lastName, rollNo));
		}
		return  studentList;
	}
}
