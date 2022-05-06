package example.data;

import java.util.ArrayList;
import java.util.List;

import example.dto.Employee;


public class EmployeeData {

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Sarath", "Bodepudi", 0, null, null));
		employees.add(new Employee(2, "Swapna", "Mannepalli", 0, null, null));
		employees.add(new Employee(3, "Charitha", "Bodepudi", 0, null, null));
		employees.add(new Employee(4, "Nandhitha", "Bodepudi", 0, null, null));
		employees.add(new Employee(0, "Test", "Test", 0, null, null));
		return employees;
	}
}
