package objectclassdemo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	public float findSumOfSalaryAllEmployee(List<Employee> employeeList) {
		float sum = 0;
		for(Employee employee: employeeList) {
			sum += employee.getSalary();
		}
		return sum;
	}
	
	public Employee findEmployeeWithHighestSalary(List<Employee> empList) {
		Employee employeeWithHighestSalary = null;
		float highestSalary = 0;
		for(Employee empl: empList) {
			if(empl.getSalary()>=highestSalary) {
				highestSalary = empl.getSalary();
				employeeWithHighestSalary = empl;
			}
		}
		return employeeWithHighestSalary;
	}
	
	public List<Employee> doubleEveryEmployeeSalary(List<Employee> employeeList){
	
		List<Employee> empl = new ArrayList<Employee>();
		for(Employee employee: employeeList) {
			empl.add(new Employee(employee.getId(),employee.getFullName(),employee.getSalary()*2,employee.isActive()));
		}
		return empl;
	
	}
}
