// Find number of occurrences of a word in a sentence

class SentenceAndWord{

 	public static void main(String [] args)
	{
		System.out.print(findNOC("Helleo world word", "word"));
	}

	public static int findNOC(String text, String word)
	{		
		int count = 0, size = word.length();
		int index  = text.indexOf(word);	// indexOf returns first index of target string.
	
		// indexOf returns -1 if it did not find the starting index for the first letter of the target string.
		while(index != -1)	
		{
			count++;
			text = text.substring(index+1);	// find again index of the first letter in the remaining part
			index = text.indexOf(word);		// overwrite old index with the new index. 
		}

		return count;
	}

}