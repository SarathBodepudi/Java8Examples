package example.functionalinterface;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionEx1 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(1, 2, 4);
		
		//Compare and return new arraylist with result. Expected result: List containing true, true, false
		
		//Classic Java
		List<Boolean> resultClassic = new ArrayList<>();
		int index = 0;
		LocalDateTime start = LocalDateTime.now();
		System.out.println();
		for (Integer numTemp1 : list1) {
			if(numTemp1 == list2.get(index)) {
				resultClassic.add(true);
			} else {
				resultClassic.add(false);
			}
			index ++;
		}
		LocalDateTime end = LocalDateTime.now();
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis() + " milliseconds using classic");
		// Returns true, true, false as expected
		System.out.println(resultClassic);
		
		//Modern Java
		LocalDateTime start1 = LocalDateTime.now();
		List<Boolean> result = listCombiner(list1, list2, BiFunctionEx1::firstIsGreaterThanSecond);
		LocalDateTime end1 = LocalDateTime.now();
		Duration duration1 = Duration.between(start1, end1);
		System.out.println(duration1.toMillis() + " milliseconds using modern");
		System.out.println(result);
	}

	private static <T, U, R> List<R> listCombiner(List<T> list1, List<U> list2, BiFunction<T, U, R> combiner) {
		List<R> result = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			result.add(combiner.apply(list1.get(i), list2.get(i)));
		}
		return result;
	}
	
	private static boolean firstIsGreaterThanSecond(Integer a, Integer b) {
	    return a == b;
	}
}
