package example.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalInterfaceLambdaDemo {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			return "Hello Sarath! Using supplier Lambda";
		};
		System.out.println(supplier.get());
		
		// More simplified
		Supplier<String> supplier1 = () -> "Hello Sarath! Using supplier simplified Lambda";
		System.out.println(supplier1.get());
		
		List<String> list1 = Arrays.asList("fr", "a", "b", "ac", "bt");
		
		list1.stream().forEach(t -> System.out.println("print :" + t));
		
		// As list1 is not empty, it fids first element and returns it
		System.out.println("\nAs list1 is not empty, it finds first element and returns it. It WILL NOT return supplier");
		System.out.println(list1.stream().findAny().orElseGet(supplier));
		
		
		List<String> list2 = Arrays.asList();
		System.out.println("\nAs list2 is empty, it WILL NOT find any element and hence returns supplier");
		System.out.println(list2.stream().findAny().orElseGet(supplier1));
		
		System.out.println("\nAs list2 is empty, it WILL NOT find any element and hence returns supplier using LAMBDA");
		System.out.println(list2.stream().findAny().orElseGet(() -> "Hello Sarath! Using supplier simplified Lambda"));
	}

}
