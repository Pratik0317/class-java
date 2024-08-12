package objectclassdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeIO {
	
	Scanner scanner = new Scanner(System.in);

    public List<Employee> readEmployee() {
    	List<Employee> employeeList = new ArrayList<Employee>();
    	for(int i = 0; i<5;i++) {
    		System.out.println("Emter your employee id: ");
    		short id = scanner.nextShort();
    		System.out.println("Enter your name: ");
    		String fullName = scanner.nextLine();
    		scanner.nextLine();
    		System.out.println("Enter your salary: ");
    		float salary = scanner.nextFloat();
    		System.out.println("Enter true or false");
    		boolean active = scanner.nextBoolean();
    		employeeList.add(new Employee(id, fullName, salary, active));
    	}	
		return employeeList;
	}
	
	public void displayEmployee(List<Employee> employee) {
		for(Employee emp: employee) {
			//emp.toString();
			System.out.println("id: "+emp.getId()+"\nName: "+emp.getFullName()+"\nSalary: "+emp.getSalary()+"\nActive: "+emp.isActive());
		}
	}
}
