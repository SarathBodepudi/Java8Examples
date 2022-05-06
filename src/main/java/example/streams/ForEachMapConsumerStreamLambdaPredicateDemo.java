package example.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ForEachMapConsumerStreamLambdaPredicateDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "a");
	
		System.out.println("Print Map using LAMBDA");
		map.forEach((key, value) -> System.out.println(key + ":" + value));
		
		// If we use map.forEach, we can't use the stream pipeline methods
		// To use pipeline methods, use the entry set
		System.out.println("\nConvert Map to Stream and Print Map using LAMBDA");
		map.entrySet().stream().forEach(t -> System.out.println(t));
		
		System.out.println("\nMap -> Stream -> Filter -> Iterate -> Print");
		map.entrySet().stream()
			.filter(x -> "a".equals(x.getValue()))
			.forEach(x -> System.out.println(x));
		
		System.out.println("\nMap -> Stream -> Filter -> Collect (Joining) -> String");
		String result = map.entrySet().stream()
			.filter(x -> "a".equals(x.getValue()))
			.map(x -> x.getValue())
			.collect(Collectors.joining());
		System.out.println("result :" + result);
		
		//Map -> Stream -> Filter -> MAP
		System.out.println("\nMap -> Stream -> Filter -> Collectors (toMap) -> MAP");
		Map<Integer, String> collect = map.entrySet().stream()
			.filter(x -> x.getValue().equals("a"))
			.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		collect.entrySet().stream().forEach(t -> System.out.println(t));

	}

}
