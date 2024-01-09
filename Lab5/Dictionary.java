package test;

import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
  ==>	 Develop a Dictionary of alphabets each of which is a key having a collection of words as a value.	 <== 
  NOTE: Maybe this is not the best implementation possible, or the best coding style or logic but it's the initial step into developing a more robust one.
*/
 
public class Dictionary {

//	private static HashMap<Character, Collection> dictionary;
	private static Map<Character, Set<String>> dictionary;
	
	public static void main(String[] args) {
		
		//Double Brace Initialization
		Dictionary.dictionary = new HashMap<>()
		{
			{
		     put('A', new TreeSet<>(Arrays.asList("Apple", "Adventure", "Atmosphere", "Acoustic", "Alligator", "Amethyst", "Avocado", "Astonish", "Astronomy", "Abundant")));
		     put('B', new TreeSet<>(Arrays.asList("Banana", "Brave", "Breeze", "Bubble", "Blossom", "Balloon", "Beacon", "Ballet", "Bonsai", "Blissful")));
		     put('C', new TreeSet<>(Arrays.asList("Cactus", "Cascade", "Crisp", "Calm", "Charm", "Celestial", "Cello", "Cerulean", "Cherish", "Cinnamon")));
		     put('D', new TreeSet<>(Arrays.asList("Dazzle", "Delight", "Dolphin", "Dream", "Dewdrop", "Diamond", "Dusk", "Divine", "Dainty", "Dragonfly")));
		     put('E', new TreeSet<>(Arrays.asList("8", "Eclipse", "Elegant", "Enchant", "Emerald", "Endless", "Essence", "Evergreen", "Exquisite", "Ephemeral")));
			}
		};


		// Get list of words by character 'C'
		Dictionary.getWords('C');
		System.out.println("--------------------------------------------------"); 		
		
		// Insert these two words in the correct letters groups.
		String [] words = {"Applf", "Best", "Car"};
		Dictionary.insert(words);
		
		// Remove this word from the whole dictionary.
		Dictionary.removeWord("Apple");
		  
		Dictionary.removeKeyValues('E');

		// Convert list of strings (returned from search function) to array 
		// And then, view the string representation of the array.
		System.out.println(Arrays.toString(Dictionary.search("olp").toArray()));
		
		Dictionary.printDictionary();
		
	}
	
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
		Set<String> target = dictionary.get(key);
		System.out.println(target); 
	}
	
	
	/**
	 * Append each word of passed array of strings to the its first letter corresponding collection.
	 * @param words
	 * @return true if insert was successful
	 */
	public static boolean insert(String[] words) {
		
		for(String word : words )
		{
			 // Get first char
			char firstLetter = word.charAt(0);
			
			// Get the corresponding list of words of first letter of each word in each iteration.
			Set<String> target = dictionary.get(firstLetter);
			
			// Add the word in the list of this key
			target.add(word);
		}
		return true;
	}


	/**
	 * Remove word from a collection by the first letter of the word.
	 * @param word
	 * @return
	 */
	public static boolean removeWord(String word) {
		char firstLetter = word.charAt(0);
		Set<String> targetCollection = dictionary.get(firstLetter);
		targetCollection.remove(word);
		return true;
	}
	
	/**
	 * Remove all values(words) of a specific key.
	 * @param key
	 * @return
	 */
	public static void removeKeyValues(char key) {
		Set<String> targetCollection = dictionary.get(key);
		targetCollection.clear();
	}
	
	
	/**
	 * Search for a word in the whole dictionary.
	 * @param regexPattern
	 * @return
	 */
	public static List<String> search(String regexPattern) {
		List<String> results = new ArrayList<>();
		
		Pattern pattern = Pattern.compile(regexPattern);
		
		Matcher matcher;
		
		for (Entry<Character, Set<String>> ele :  Dictionary.dictionary.entrySet()) {
			for(String word : ele.getValue())
			{
				matcher = pattern.matcher(word);
				boolean found = matcher.find();
				
				if (found)
					results.add(word);
			}
		}
	    
	    if(results.isEmpty())
	      System.out.println("Match not found");
	    
	    return results;
	}
	
	
}









