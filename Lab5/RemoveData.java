package dictionary;

import java.util.Set;

public class RemoveData {

	/**
	 * Remove word from a collection by the first letter of the word.
	 * @param word
	 * @return
	 */
	public static boolean removeWord(String word) {
		char firstLetter = word.charAt(0);
		Set<String> targetCollection = Dictionary.dictionary.get(firstLetter);
		if(targetCollection != null)
			targetCollection.remove(word);
		else
			System.out.println("Not Found");
		return true;
	}
	
	/**
	 * Remove all values(words) of a specific key.
	 * @param key
	 * @return
	 */
	public static void removeKeyValues(char key) {
		Set<String> targetCollection = Dictionary.dictionary.get(key);
		
		if(targetCollection != null)
			targetCollection.clear();
		else
			System.out.println("Not Found");
	}
}
