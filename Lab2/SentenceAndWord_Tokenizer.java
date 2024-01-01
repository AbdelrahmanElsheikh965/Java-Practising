// using StringTokenizer class to find the number of occurrences of a word in a sentence

import java.util.StringTokenizer; 

class SentenceAndWord_Tokenizer{

 	public static void main(String [] args)
	{
		StringTokenizer st = new StringTokenizer("this is a !test sample !test word", " ");
		String word = "!test";
		
		int i = 1, count = 0, length = st.countTokens();
		while(st.hasMoreTokens())	// after splitting with delimiter
		{					
			if(st.nextToken().equals(word))	// nextToken returns word by word.
	                               	count++;	
		}
		System.out.print(count);
	}

}