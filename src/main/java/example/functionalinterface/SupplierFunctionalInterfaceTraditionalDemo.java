package example.functionalinterface;

import java.util.function.Supplier;

public class SupplierFunctionalInterfaceTraditionalDemo implements Supplier<String> {

	public static void main(String[] args) {
		Supplier<String> supplier = new SupplierFunctionalInterfaceTraditionalDemo();
		System.out.println(supplier.get());
	}

	@Override
	public String get() {
		return "Hello Sarath!";
	}

}
