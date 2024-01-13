package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Ah", 80000),
				new Employee(2, "Ali", 15000),
				new Employee(3, "Medhat", 20000),
				new Employee(4, "Tah", 30000)
				);

		List<String>employeesNames = employees
						.stream()
						
						// Upcoming operations will only be performed on employees whose names are longer than 3 characters.
						.filter(e -> e.name.length() > 3)
						
						// Specify the return type of the collection assign only names of employees
						// in employeesNames which is of type <String>
						.map(v -> v.name)	
						
						.collect(Collectors.toList());
		
		System.out.println(employeesNames);	
	}

}
