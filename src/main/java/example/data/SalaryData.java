package example.data;

import java.util.ArrayList;
import java.util.List;

import example.dto.Salary;


public class SalaryData {
	public List<Salary> getAllEmployeesSalaries() {
		List<Salary> salaries = new ArrayList<Salary>();
		salaries.add(new Salary(1, 10000.00, "Technology", "012122"));
		salaries.add(new Salary(2, 5000.00, "Home Maker", "023456B"));
		salaries.add(new Salary(3, 2500.00, "Student", "98435"));
		salaries.add(new Salary(4, 2000.00, "Student", "98435"));
		return salaries;
	}
}
