package example.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaceUsingLambdaDemo {
	public static void main(String[] args) {

		Predicate<Integer> predicate = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};

		// More simplified
		Predicate<Integer> predicate2 = (t) -> t % 2 == 0;

		int num = 7;
		System.out.println("Is " + num + " an odd number :" + !predicate.test(num));
		System.out.println("Is " + num + " an odd number :" + !predicate2.test(num));

		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		list1.stream().forEach(t -> System.out.println("print :" + t));
		
		// Filter out the elements based on traditional predicate condition (if num % 2 == 0 (Even numbers only)) and then print them
		System.out.println("\nFilter out the elements based on traditional predicate condition (if num % 2 == 0) and then print them");
		list1.stream().filter(predicate2).forEach(t -> System.out.println("print :" + t));
		
		System.out.println("\nFilter out the elements based on the lambda condition (if num % 2 == 0) and then print them");
		list1.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print :" + t));
		
	}
}
