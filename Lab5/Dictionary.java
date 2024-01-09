// All classes can see each other as being in the same package in the same directory so they don't need to import;
package dictionary;

import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
  ==>	 Develop a Dictionary of alphabets each of which is a key having a collection of words as a value.	 <== 
*/
 
public class Dictionary {

	public static Map<Character, Set<String>> dictionary;


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
		ReadData.getWords('C');
		System.out.println("--------------------------------------------------"); 		
		
		// Insert these two words in the correct letters groups.
		String [] words = {"Applf", "Best", "Car"};
		InsertData.insert(words);
		
		// Remove this word from the whole dictionary.
		RemoveData.removeWord("Apple");
		  
		// Remove all values (words) of a specific key (character).
		RemoveData.removeKeyValues('E');

		// Convert list of strings (returned from search function) to array 
		// And then, view the string representation of the array.
		System.out.println("Search Results : " + Arrays.toString(SearchForData.search("olp").toArray()));
		
		ReadData.printDictionary();
		
	}
	
	
}









