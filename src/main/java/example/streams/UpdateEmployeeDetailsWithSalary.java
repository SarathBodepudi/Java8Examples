package example.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import example.data.EmployeeData;
import example.data.SalaryData;
import example.dto.Employee;
import example.dto.Salary;

public class UpdateEmployeeDetailsWithSalary {

	public static void main(String[] args) {
		EmployeeData employeeData = new EmployeeData();
		List<Employee> employees = employeeData.getAllEmployees();
		
		SalaryData salaryData = new SalaryData();
		List<Salary> salaries = salaryData.getAllEmployeesSalaries();
		
		System.out.println("Set employee details with salary details");
		employees.stream()
		.forEach(employee -> {
			salaries.stream()
			.forEach(salary -> {
				if(employee.getEmployeeId() == salary.getEmployeeId()) {
					employee.setSalary(salary.getSalary() * 1.5);
					employee.setDepartment(salary.getDepartment());
					employee.setCostCenter(salary.getCostCenter());
				}
			});
		});
		
		
		System.out.println("Before Filtering");
		employees.stream()
		.forEach(employee -> {
			System.out.println(employee.toString());
		});
		
		Set<Employee> employees2 =	employees.stream()
			.filter(c -> c.getEmployeeId() != 0)
			.collect(Collectors.toSet());
		
		System.out.println("\nAfter Filtering out employees where emp id != 0");
		employees2.stream()
		.forEach(employee -> {
			System.out.println(employee.getFirstName());
		});
		
		System.out.println("\nRetrieve only employee ids");
		Set<Integer> employeeIds =	employees.stream()
				.filter(c -> c.getEmployeeId() != 0)
				.map(c -> c.getEmployeeId())
				.collect(Collectors.toSet());
		
		employeeIds.stream()
		.forEach(employeeId -> {
			System.out.println(employeeId);
		});
		
		
		
	}
	
	

}
