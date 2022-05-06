package example.data;

import java.util.ArrayList;
import java.util.List;

import example.dto.EmployeeDto;


public class EmployeeDataForComparator {

	public List<EmployeeDto> getEmployees() {
		EmployeeDto employee1 = new EmployeeDto(100, 100, "Sarath", "Bodepudi", 46);
		EmployeeDto employee2 = new EmployeeDto(101, 101, "Swapna", "Mannepalli", 40);
		EmployeeDto employee3 = new EmployeeDto(102, 102, "Charitha", "Bodepudi", 16);
		EmployeeDto employee4 = new EmployeeDto(103, 103, "Nandhitha", "Bodepudi", 9);
		
		EmployeeDto employee5 = new EmployeeDto(104, 104, "Zzz", "ABC", 11);
		EmployeeDto employee6 = new EmployeeDto(105, 105, "Xyz", "ACB", 19);
		EmployeeDto employee7 = new EmployeeDto(106, 106, "ABC", "CBA", 20);
		EmployeeDto employee8 = new EmployeeDto(107, 107, "GHI", "JKL", 20);
		
		List<EmployeeDto> employees = new ArrayList<EmployeeDto>();
		employees.add(employee2);
		employees.add(employee4);
		employees.add(employee1);
		employees.add(employee7);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee3);
		employees.add(employee8);
		return employees;
	}
}
