// Find number of occurrences of a word in a sentence

class SentenceAndWord_2{

 	public static void main(String [] args)
	{
		String text = "test word test tst";
		String word  = "test";
		int i = 0, j, count = 0, num = 0;

		for(j = 0; j<text.length(); j++)
		{
			if(word.charAt(i) == text.charAt(j))
			{
				num++;
				i++;
			}else{
				i = 0;
				num = 0; 
			}

			if(num == word.length())
			{
				count++;
				i = 0;
			}
		}

		System.out.print(count);
		
	}

}