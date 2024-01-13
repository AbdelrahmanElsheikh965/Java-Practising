package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		List<String> lst1 = Arrays.asList("Ali", "Esameil");
		List<String> lst2 = Arrays.asList("Yahia", "Taha");
		List<String> lst3 = Arrays.asList("Ahmed", "Othman");
		
		List<List<String>> allInOne = new ArrayList<List<String>>(3);
		allInOne.add(lst1);
		allInOne.add(lst2);
		allInOne.add(lst3);
		
		// .flatMap(nameList -> nameList.stream()) => will take each and every collection from the stream (allInOne) at a time 
		// creates a new stream, and returns it.
		// so we have 3 collection internally in allInOne flatmap() so, 3 times it will pass 3 different collection parameters
		// and 3 different streams will be created finally these 3 collection will be collected using collect() into one bigger container collection.
		
		List<String> finalResult = allInOne.stream().flatMap(nl -> nl.stream()).collect(Collectors.toList());
		System.out.print(finalResult);

	}

}
