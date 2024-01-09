package dictionary;

import java.util.Set;

public class InsertData {

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
			Set<String> target = Dictionary.dictionary.get(firstLetter);
			
			if(target != null)
				// Add the word in the list of this key
				target.add(word);
			else
				System.out.println("Not found char");
		}
		return true;
	}
	
}
