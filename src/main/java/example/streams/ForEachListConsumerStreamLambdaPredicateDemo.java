package example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ForEachListConsumerStreamLambdaPredicateDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sarath");
		list.add("Swapna");
		list.add("Charitha");
		list.add("Nandhitha");
		list.add("Niha");
		list.add("Nikku");
		
		// Traditional
		System.out.println("Traditional approach interation");
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("\nLAMBDA interation");
		list.stream().forEach(t -> System.out.println(t));
		
		System.out.println("\nLAMBDA & CONSUMER interation");
		Consumer<String> consumer = t -> System.out.println("Printing :" + t);
		list.stream().forEach(consumer);
		
		Predicate<String> predicate = (t) -> {
			if (t.startsWith("S")) {
				return true;
			} else {
				return false;
			}
		};
		
		System.out.println("\nStream -> Filter -> Predicated -> Iterate -> Print");
		list.stream().filter(predicate).forEach(t -> System.out.println(t));
		
		Predicate<String> isNameStartingWithSPredicate = t -> t.startsWith("S");
		System.out.println("\nStream -> Filter -> Predicated (SIMPLIFIED) -> Collected (Not necessary) -> Iterate -> Print");
		list.stream().filter(isNameStartingWithSPredicate).collect(Collectors.toList()).forEach(t -> System.out.println(t));
	}

}
