class LabBonus{
	public static void main(String args[])
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.print(" x :" + x);
		System.out.println(" y :" + y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.print(" x :" + x);
		System.out.println(" y :" + y);
    	}
}