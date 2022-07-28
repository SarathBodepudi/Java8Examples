package example.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Server 1", 5);
		map.put("Server 2", 4);
		map.put("Server 3", 5);
		map.put("Server 4", 6);
		map.put("Server 5", 2);
		map.put("Server 6", 4);
		
		System.out.println("The set is: " + map.entrySet());
		
		/*
		 * 
		 * Using Collectors.groupingBy to group by key and use Collectors.mapping to map values and 
		 * collect as a list for each key.
		 * 
		 * The list is the actual value in the map and contains all Servers having the same name
		 * 
		 * If the stream has items where Map keys are duplicate then we can use Collectors.groupingBy() 
		 * to collect elements in Map<key, List<value>> format. Here for each map key, 
		 * we will store all elements in a List as the value.
		 * 
		 * Returns a sequential Stream with this collection as its source
		 * 
		 * Collectors provide various useful reduction
		 * operations, such as accumulating elements into collections, summarizing
		 * elements according to various criteria, etc
		 */
		Map<Integer, List<String>> groupByValuesMap = map.entrySet()
			    .stream()
			    .collect(Collectors.groupingBy(Map.Entry::getValue,
			        Collectors.mapping(
			            Map.Entry::getKey,
			            Collectors.toList())));
		
		/*
		 * It is very important to know beforehand if the Stream elements will have a distinct value for 
		 * the map key field or not.

			If map keys are duplicate and we use Collectors.toMap() method, we will get the IllegalStateException:
		 * 
		 */
		System.out.println(groupByValuesMap);
		
	}
}
