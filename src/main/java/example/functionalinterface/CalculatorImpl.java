package example.functionalinterface;

public class CalculatorImpl {

	// https://www.youtube.com/watch?v=ePJrt5-G8eM&t=54s
	public static void main(String[] args) {

		// ************************  No argument method example *************************
		/*
		Calculator calculator = () -> {
			System.out.println("Switch On");
		};
		
		// When there is only one statement, we can further simplify
		Calculator calculator1 = () -> System.out.println("Switch On 2");

		calculator.switchOn();
		calculator1.switchOn();
		*/

		// ************************  method with argument example  *************************
		/*
		Calculator calculator3 = (int sum) -> {
			System.out.println("Number :" + sum);
		};
		calculator3.sum(5);
		*/
		
		// ************************  method with multiple argument example  *************************
		/*
		Calculator calculator4 = (int num1, int num2) -> {
			int num3 = num1 * num2;
			System.out.println("Multiply " + num1 + " and " + num2 + " returns :" + num3);
		};
		calculator4.multiplier(3,  7);
		*/
		
		// ************************   method with multiple argument example - no data type example  *************************
		Calculator calculator4 = (num1, num2) -> {
			System.out.println("Multiply " + num1 + " and " + num2 + " returns :" + num1 * num2);
			return  num1 * num2;
		};
		calculator4.multiplier(3, 7);
	}

}
