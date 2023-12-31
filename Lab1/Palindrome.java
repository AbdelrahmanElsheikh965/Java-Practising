class Palindrome{

	public static void main(String args[])
	{
		palindrome(args[0]);
    	}
	
	public static void palindrome(String text)
	{	
		int i, j, lastIndex = text.length()-1;
		Boolean flag = true;

		for(i=0, j=lastIndex; i<lastIndex && j >= 0; i++, j--)
		{
			if(text.charAt(i) != text.charAt(j))
			{
				flag = false;
				i++;		// means break
			}
		}	

		if(flag == true)
		{
			System.out.print("Yes");			
		}else
		{
			System.out.print("No");
		}
		
    	}

}