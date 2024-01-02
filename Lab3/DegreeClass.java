package degree;

public class DegreeClass implements DegreeInterface{

	// If we want to use Function Interface built-in in java lang.	
	// class FunctionClass implements Function<Double, Double>

	public Double apply(Double d)
	{
		// The formula to convert Celsius to Fahrenheit
		return d * (9/5) + 32;
	}
}