package example.functionalinterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import example.data.EmployeeDataForComparator;
import example.dto.Employee;
import example.dto.EmployeeDto;

public class EmployeeComparator {

	public static void main(String[] args) {
		List<EmployeeDto> employees = new EmployeeDataForComparator().getEmployees();
		System.out.println("Employee with no sorting");
		employees.forEach(employee -> {
			System.out.println(employee.toString());
		});
		
		// MODERN APPROACH USING LAMBDA
		Collections.sort(employees, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		 
		// TRADITIONAL APPROACH 1 - WRITE YOUR OWN COMPARATOR WHICH IMPLEMENTS COMPARATOR 
		// Collections.sort(employees, new MyComparator());
		
		// TRADITIONAL APPROACH 2 - DIRECTLY PASS THE COMPARATOR (ANONYMOUS IINER TYPE) 
		/*
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		*/
		 
		System.out.println("\n\nEmployee Sorted");
		employees.forEach(employee -> {
			System.out.println(employee.toString());
		});
	}

}

class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
	
}