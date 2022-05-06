package example.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import example.streams.data.EmployeeData;
import example.streams.dto.Employee;
import example.streams.dto.Person;

public class CollectionsSortingExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Enes", "Oral"), new Person("John", "Oliver"),
				new Person("Emma", "Elliott"), new Person("Matthew", "Yard"));

		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});

		System.out.println("Print all sorted by last name");
		printAll(people);
		
		System.out.println("\nPrint last names beginning with O");
		printLastNameBeginningWithO(people);
		
		// Sort with Java 8 Lambda
		System.out.println("\nSort using LAMBDA");
		EmployeeData employeeData = new EmployeeData();
		List<Employee> employees = employeeData.getAllEmployees();
		/* Collections.sort(employees, new NameSorter()); */
		
		Comparator<Employee> nameSorter = (a, b) -> a.getFirstName().compareToIgnoreCase(b.getFirstName());
		Collections.sort(employees, nameSorter);
		System.out.println(employees);
		
		System.out.println("\nSort using LAMBDA - GROUP BY");
		Collections.sort(employees, Comparator
                .comparing(Employee::getFirstName)
                .thenComparing(Employee::getEmployeeId));
		System.out.println(employees);
	}
	
	private static void printAll(List<Person> people) {
	    for (Person p: people) {
	        System.out.println(p);
	    }
	}

	
	private static void printLastNameBeginningWithO(List<Person> people) {
	    for (Person p: people) {
	        if (p.getLastName().startsWith("O")) {
	            System.out.println(p);
	        }
	    }
	}
}
