package example.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEx1 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	    
	    
	    List<EmployeeDto> employees = prepareEmployees();
	    
	    employees.forEach(employee -> {
	    	System.out.println(employee.toString());
	    });
	    
	    
	    // Collect employees by age 9
	    System.out.println("\n=============== List of employees with age 9 =================");
	    List<EmployeeDto> employeesAged9 = employees.stream().filter(x -> x.getAge() == 9).collect(Collectors.toList());
	    employeesAged9.forEach(emp -> {
	    	System.out.println(emp.toString());
	    });
	    
	    
	    // Collect employees by age 9
	    System.out.println("\n=============== List of employees with age 9 and with same phone =================");
	    List<EmployeeDto> employeesAged9AndSamePhone = employees.stream().filter(x -> x.getAge() == 9).filter(y -> y.getContact().getPhoneNum() == "43233432").collect(Collectors.toList());
	    employeesAged9AndSamePhone.forEach(emp -> {
	    	System.out.println(emp.toString());
	    });
	    
	}

	private static List<EmployeeDto> prepareEmployees() {
		List<EmployeeDto> employees = new ArrayList<>();
		
		EmployeeDto employee1 = new EmployeeDto(100, "Sarath", "Bodepudi", 46, LocalDate.now().minusYears(46), new Contact("addLn1", "addLn11", "sarath@gmail.com", "1234567892", 12345));
		EmployeeDto employee2 = new EmployeeDto(101, "Swapna", "Mannepalli", 40, LocalDate.now().minusYears(40).minusMonths(2).minusDays(3), new Contact("addLn11", "addLn111", "swapna@gmail.com", "542478911", 54127));
		EmployeeDto employee3 = new EmployeeDto(102, "Charitha", "Bodepudi", 16, LocalDate.now().minusYears(16).minusMonths(4).minusDays(15), new Contact("addLn22", "addLn222", "charitha@gmail.com", "56756756", 54127));
		EmployeeDto employee4 = new EmployeeDto(103, "Nandhitha", "Bodepudi", 9, LocalDate.now().minusYears(9).minusMonths(8).minusDays(28), new Contact("addLn33", "addLn333", "nandy@gmail.com", "95645645", 64321));
		EmployeeDto employee5 = new EmployeeDto(104, "Nandhitha2", "Bodepudi2", 9, LocalDate.now().minusYears(9).minusMonths(8).minusDays(28), new Contact("addLn44", "addLn444", "nandy2@gmail.com", "43233432", 64321));
		EmployeeDto employee6 = new EmployeeDto(105, "Charitha1", "Bodepudi1", 16, LocalDate.now().minusYears(16).minusMonths(2).minusDays(8), new Contact("addLn55", "addLn555", "charitha1@gmail.com", "95645645", 64321));
		EmployeeDto employee7 = new EmployeeDto(106, "Nandhitha3", "Bodepudi3", 9, LocalDate.now().minusYears(9).minusMonths(4).minusDays(4), new Contact("addLn66", "addLn666", "nandy3@gmail.com", "43233432", 64321));
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee7);
		
		return employees;
	}

}
