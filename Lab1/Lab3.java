class Lab3{
	public static void main(String args[])
	{
		String text = args[0];
		// handling number is an integer
		// handling number is positive

		try
		{
			// doubtable code that might be broken (frgaile code)
			int iterations = Integer.parseInt(args[1]);

			if ( iterations > 0  )
			{
				for(int i = 1; i <= iterations; i++)
				{
					System.out.println(text);	
				}
			}else
			{					
				System.out.print("Negative");
			}
		}catch(NumberFormatException e){
			System.out.print("error");
		}
    	}
}