package dictionary;

import java.util.Set;
import java.util.Map.Entry;

public class ReadData {

	/**
	 * Print every entry set in the map each of which on a separate line.
	 */
	public static void printDictionary() {
		for (Entry<Character, Set<String>> ele :  Dictionary.dictionary.entrySet()) 
			System.out.println(ele.getKey() + ":" + ele.getValue());
	}

	
	/**
	 * Print list of words corresponding to they key chosen
	 * @param key
	 */
	public static void getWords(char key) {
		Set<String> target = Dictionary.dictionary.get(key);
		if(target != null)
			System.out.println(target); 
		else
			System.out.println("Not Found this char");
	}
	
}
