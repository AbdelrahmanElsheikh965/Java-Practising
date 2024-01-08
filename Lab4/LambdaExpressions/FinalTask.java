package test;
import java.util.function.BiPredicate;
/*
		Your goal is to make a method called betterString that takes 
		two Strings and a lambda that says whether the first of the two 
		is “better”. 
		• The method should return that better String; i.e., if the 
		function given by the lambda returns true, the betterString
		method should return the first String, otherwise betterString
		should return the second String.
		• String string1 = ...; 
		• String string2 = ...; 
		• String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length()); 
		• String first = StringUtils.betterString(string1, string2, (s1, s2) -> true)
*/
interface checkStringInterface{
	public boolean better(String str1, String str2);
}

public class LambdaExample {

	public static String betterString(String str1, String str2, checkStringInterface lambda) {
		return lambda.better(str1, str2) ? str1 : str2;
	}

	public static void main(String[] args) {
		
		checkStringInterface csi = (s1, s2) -> (s1.length() > s2.length()) ? true : false;
		
		String s1 = "longer";
		String s2 = "s";
		
		System.out.println(LambdaExample.betterString(s1, s2, csi));		// Longer

	}
	

}
