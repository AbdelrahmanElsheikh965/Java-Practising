package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String[] args) {
		List<Integer> lst1 = Arrays.asList(40, 50);
		List<Integer> lst2 = Arrays.asList(80, 90);
		List<Integer> lst3 = Arrays.asList(150, 300);
	
		List<List<Integer>> maxList = Arrays.asList(lst1, lst2, lst3);
		
		maxList.stream().flatMap(l -> l.stream().map(x->x*2)).collect(Collectors.toList()).stream().forEach(System.out::println);

	}

}
