package example.functionalinterface;

import java.util.function.Predicate;

public class PredicateFunctionalInterfaceDemo implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate = new PredicateFunctionalInterfaceDemo();
		int num = 7;
		System.out.println("Is " + num + " an odd number :" + !predicate.test(num));
	}
}
