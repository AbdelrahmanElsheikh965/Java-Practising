package dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchForData {

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
