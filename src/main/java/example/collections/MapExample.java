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
		 * Using Collectors.groupingBy to group by key and use Collectors.mapping to map values and collect as a list for each key.
		 */
		Map<Integer, List<String>> groupByValuesMap = map.entrySet()
			    .stream()
			    .collect(Collectors.groupingBy(Map.Entry::getValue,
			        Collectors.mapping(
			            Map.Entry::getKey,
			            Collectors.toList())));
		
		System.out.println(groupByValuesMap);
		
	}
}
