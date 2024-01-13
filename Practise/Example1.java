package test;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("Bus", "Car", "Bicycle", "AirPlane", "SuperCar");
		vehicles.stream()
				.map(v->v.toUpperCase())
				.forEach(System.out::println);	// By default prints the returned thing/object from the previous chained method.
//				.forEach(v->System.out.println(v.getClass()));

	}

}
