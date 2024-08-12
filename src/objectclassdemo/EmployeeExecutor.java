package objectclassdemo;

import java.util.List;

public class EmployeeExecutor {

	public static void main(String[] args) {
		EmployeeIO employeeIO = new EmployeeIO();
		
		List<Employee> employee = employeeIO.readEmployee();
		
		EmployeeService employeeService = new EmployeeService();
		
		float result = employeeService.findSumOfSalaryAllEmployee(employee);
		System.out.println("Sum of salaries of all employee are: "+result);
		
		System.out.println("Salary of employee after doubling it:");
		List<Employee> doubleSalaryEmployee = employeeService.doubleEveryEmployeeSalary(employee);
		for(Employee emp: doubleSalaryEmployee) {
			System.out.println("id: "+emp.getId()+"\nName: "+emp.getFullName()+"\nSalary: "+emp.getSalary()+"\nActive: "+emp.isActive());
		}
		
		System.out.println("Employee with highest salary");
		Employee highestSalaryEmployee  = employeeService.findEmployeeWithHighestSalary(employee);
		System.out.println("id: "+highestSalaryEmployee.getId()+"\nName: "+highestSalaryEmployee.getFullName()+"\nSalary: "+highestSalaryEmployee.getSalary()+"\nActive: "+highestSalaryEmployee.isActive());
		
		
	}
}