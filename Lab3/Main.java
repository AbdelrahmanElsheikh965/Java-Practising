import degree.DegreeClass;
import degree.DegreeInterface;

import equation.EquationClass;
import equation.EquationInterface;

import java.util.*;

public class Main{

	public static void main(String args[])
	{
	 	DegreeClass d = new DegreeClass();
		System.out.println(d.apply(10.5));

		List<Double> listOfElements =new ArrayList<Double>();	
		
		listOfElements.add(Double.valueOf(3));
		listOfElements.add(Double.valueOf(-5));
		listOfElements.add(Double.valueOf(2));

		EquationClass e  = new EquationClass();
		Double result = e.apply(listOfElements);

		System.out.print(result);
	}
}