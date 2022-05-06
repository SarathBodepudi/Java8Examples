package example.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	
	public static void main(String[] args) {
		
		Consumer<Integer> consumer = (t) -> {
			System.out.println("Printing :" + t);
		};
		consumer.accept(5-3);
		
		// More simplified
		Consumer<Integer> consumer2 = t -> System.out.println("Printing :" + t);
		consumer2.accept(10);
		
		// Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);
 
        // Implement display using accept()
        display.accept(10);
        
        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
        
        // Consumer to display a list of numbers
        Consumer<List<Integer> > dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        
        // We can pass Consumer to for each
        list.stream().forEach(consumer);
        
        // Or pass lambda to for each
        list.stream().forEach(t -> System.out.println("print :" + t));
        
        // Implement modify using accept()
        modify.accept(list);
 
        // Implement dispList using accept()
        dispList.accept(list);
        
        // using addThen()
        modify.andThen(dispList).accept(list);
	}

}
