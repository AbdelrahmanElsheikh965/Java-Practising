package test;

import java.util.*;
import java.util.Map.Entry;

/* 
  ==>	 Develop a Dictionary of alphabets each of which is a key having a collection of words as a value.	 <== 
  NOTE: Maybe this is not the best implementation possible, or the best coding style or logic but it's the initial step into developing a more robust one.
*/
 
public class Dictionary {

	private static HashMap<Character, Collection> dictionary;
	
	public static void main(String[] args) {
		
		//Double Brace Initialization
		Dictionary.dictionary = new HashMap<>()
		{
			{
		     put('A', Arrays.asList("Apple", "Adventure", "Atmosphere", "Acoustic", "Alligator", "Amethyst", "Avocado", "Astonish", "Astronomy", "Abundant"));
		     put('B', Arrays.asList("Banana", "Brave", "Breeze", "Bubble", "Blossom", "Balloon", "Beacon", "Ballet", "Bonsai", "Blissful"));
		     put('C', Arrays.asList("Cactus", "Cascade", "Crisp", "Calm", "Charm", "Celestial", "Cello", "Cerulean", "Cherish", "Cinnamon"));
		     put('D', Arrays.asList("Dazzle", "Delight", "Dolphin", "Dream", "Dewdrop", "Diamond", "Dusk", "Divine", "Dainty", "Dragonfly"));
		     put('E', Arrays.asList("Eagle", "Eclipse", "Elegant", "Enchant", "Emerald", "Endless", "Essence", "Evergreen", "Exquisite", "Ephemeral"));
			}
		};

		
		// Get list of words by character 'C'
		Dictionary.getWords('C');
		System.out.println("--------------------------------------------------"); 		
		
		// Insert these two words in the correct letters groups.
		String [] words = {"Best", "Car"};
		Dictionary.insert(words);
		Dictionary.printDictionary(); 
		System.out.println("--------------------------------------------------"); 
		
		// Remove this word from the whole dictionary.
		Dictionary.removeWord("Apple");
		Dictionary.printDictionary(); 
		  
		
	}
	
	/**
	 * Print every entry set in the map each of which on a separate line.
	 */
	public static void printDictionary() {
		for (Entry<Character, Collection> ele :  Dictionary.dictionary.entrySet()) 
			System.out.println(ele.getKey() + ":"+ ele.getValue()); 
	}

	
	/**
	 * Print list of words corresponding to they key chosen
	 * @param key
	 */
	public static void getWords(char key) {
		Collection target = dictionary.get(key);
		System.out.println(target); 
		
	}
	
	/**
	 * Append each word of passed array of strings to the its first letter corresponding collection.
	 * @param words
	 * @return true if insert was successful
	 */
	@SuppressWarnings("unchecked")
	public static boolean insert (String[] words) {
		
		for(String word : words )
		{
			 // Get first char
			char firstLetter = word.charAt(0);
			
			// Get the corresponding list of words of first letter of each word in each iteration.
			List<String> modifiableArrayList = new ArrayList<>(dictionary.get(firstLetter));
			
			// Add the word in the list of this key
			modifiableArrayList.add(word);
			
			// Update the list with the new one.
			Dictionary.dictionary.put(firstLetter, modifiableArrayList);
		}
		return true;
	}
	

	/**
	 * Remove word from a collection by the first letter of the word.
	 * @param word
	 * @return
	 */
	public static boolean removeWord(String word) {
		
		List<String> modifiableArrayList = new ArrayList<>(Dictionary.dictionary.get(word.charAt(0)));
		modifiableArrayList.remove(word);
		Dictionary.dictionary.put(word.charAt(0), modifiableArrayList);
		
		return true;
	}
	
}









