package equation;

import java.util.*;
import java.lang.Math;

public class EquationClass implements EquationInterface
{
	Double x;
	public Double apply(List <Double> elements)
	{
		Double a = elements.get(0);
		Double b = elements.get(1);
		Double c = elements.get(2);

		Double undRoot = (b*b) - 4*(a*c);

		if(undRoot < 0)
		{
			System.out.print("Error");
		}else{
			b = b*(-1);

			// Addition Case
			//x = (  b + Math.sqrt(undRoot) ) / 2 * a;				

			// Subtraction Case
			x = ( b - Math.sqrt(undRoot) ) / 2 * a;
		}
		return x; 				
	}
}