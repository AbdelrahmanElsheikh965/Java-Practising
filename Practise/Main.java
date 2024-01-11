package prcts;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	/* Small sample of code of stream API */
	public static void main(String[] args) {

		List<Integer> MyArrayList = new ArrayList<>();
		MyArrayList.add(4);
		MyArrayList.add(5);
		MyArrayList.add(6);
		
		int salaries[] = {7, 8 ,9};
		
		// we can make a stream of an array like this Arrays.stream
		Arrays.stream(salaries).forEach(System.out::print);
		

		// we can make a stream of arralist like this and apply a certain condition.
		MyArrayList = MyArrayList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(MyArrayList);
		
	}

}
