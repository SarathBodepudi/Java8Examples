package example.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import example.dto.Person;


public class ComplesOptionalExample1 {

	public static void main(String[] args) {
		List<Person>  persons = new ArrayList<Person>();
		
		persons.add(new Person(47, null, "Bodepudi"));
		persons.add(new Person(40, "Swapna", "Mannepalli"));
		persons.add(new Person(16, "Charitha", "Bodepudi"));
		persons.add(new Person(10, "Nandhitha", "Bodepudi"));
		/*
		 * List<String> names = persons.stream() .map(Person::getFirstName)
		 * .filter(Optional::isPresent) .map(Optional::orElseThrow)
		 * .collect(Collectors.toList());
		 */
		
		String firstName0 = persons.get(0).getFirstName().orElse("NO NAME");
		System.out.println(firstName0);
		
		Optional<String> firstName = persons.get(0).getFirstName(); //.orElseThrow();
		System.out.println(firstName);
		
		/*
		 * String name = persons.stream() .map(Person::getFirstName)
		 * .filter(Optional::isPresent) //.map(Optional::orElseThrow)
		 * .collect(Collectors.joining(","));
		 * 
		 * System.out.println("name :" + name);
		 */

	}
}
