package test;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	/**
	 * Overriding the way this object is printed.
	 */
	@Override
	public String toString() {
		return "Salary : " + this.salary;
	}
}


public class Main {

	public static void main(String[] args) {
		
		List<Employee> emps1 = Arrays.asList(
				new Employee(1, "Mohsen", 80000),
				new Employee(3, "Yasser", 20000),
				new Employee(4, "Nour", 30000)
				);
		
		List<Employee> emps2 = Arrays.asList(
				new Employee(3, "Mohamed", 20000),
				new Employee(1, "Ahmed", 80000),
				new Employee(4, "Taha", 30000)
				);
		List<List<Employee>> All  = new ArrayList<>();
		All.add(emps1);
		All.add(emps2);
		
		// Multi-line lambda expression.
		All.stream().flatMap( el -> el.stream()).map(e -> 
		{
			return e.name;
		}
		// get the employee as long as his name isn't Yasser.
		).filter(e -> e != "Yasser") .collect(Collectors.toList()).stream().forEach(System.out::println);
		
		// 1- we can map() after making each collection element as a stream of the big list (All)
		
		//	All.stream().flatMap(  el -> el.stream().map(e -> e.name).filter(e -> e != "Yasser")  )
		//				.collect(Collectors.toList())
		//				.stream()
		//				.forEach(System.out::println);
		
		
		// or 2- we can map() after finishing the loop over the big list (All)
		
		//	All.stream().flatMap( el -> el.stream())
		//				.map(e -> e.name)
		//				.filter(e -> e != "Yasser")
		//				.collect(Collectors.toList())
		//				.stream()
		//				.forEach(System.out::println);
		
		
		
		
		
		
		
		
	}

}