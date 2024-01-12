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
	
	@Override
	public String toString() {
		return "Salary : " + this.salary;
	}
}


public class Main {

	/* Small sample of code of stream API */
	public static void main(String[] args) {

		/*
			List<Integer> MyArrayList = new ArrayList<>();
			MyArrayList.add(4);
			MyArrayList.add(5);
			MyArrayList.add(6);
			
			int salaries[] = {7, 8 ,9};
			
			// we can make a stream of an array like this Arrays.stream
			Arrays.stream(salaries).forEach(System.out::println);
			Arrays.stream(salaries).forEach(n -> System.out.print(n));
			
	
			// we can make a stream of array list like this and apply a certain condition.
			
			MyArrayList = MyArrayList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
			System.out.println(MyArrayList);
		*/
		
		List<Employee> emps = new ArrayList<>(4);	// initially 4 employees
		
		emps.add(new Employee(1, "Ahmed", 80000));
		emps.add(new Employee(2, "Ali", 15000));
		emps.add(new Employee(3, "Medhat", 20000));
		emps.add(new Employee(4, "Taha", 30000));
		
		emps.stream()
			.filter(e -> e.salary > 15000)	// filter only whose salary is greater than 15000
			.collect(Collectors.toList())	// This is a TERMINAL operation
			.stream()						// returns a stream to enable the developer to make more operations
			.forEach(System.out::println);	// This is a TERMINAL operation
		
		// -------------------------------------------------------------------------	
		
		List<Employee> emps2 = Arrays.asList(
				new Employee(1, "Ahmed", 80000),
				new Employee(2, "Ali", 15000),
				new Employee(3, "Medhat", 20000),
				new Employee(4, "Taha", 30000)
				);
		
		emps2.stream()
			 .filter(employee -> employee.salary > 20000)
			 .forEach(e->System.out.println(e.salary));
		
		
	}

}