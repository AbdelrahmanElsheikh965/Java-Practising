import java.util.Random;
public class ThousandElement{

     public static void main(String args[]){
	long sTime, eTime;

	int result, size = 1000, i = 0;
	Random randomObject = new Random();	 // Instantiate new object to generate random number
	int randomNumbers[] = new int[size];		// Declare and allocate array (1000) location
	
	sTime = System.currentTimeMillis();
	while (i < size)
	{
	     randomNumbers[i] = randomObject.nextInt(999);
	     //System.out.println(randomNumbers[i]);
	     i++;
	}
	eTime = System.currentTimeMillis();
	System.out.println("Time consumed to fill the array : " + (eTime - sTime));	

	sTime = System.currentTimeMillis();
	result = findMinOrMax(randomNumbers, size, "min");
	eTime = System.currentTimeMillis();
	System.out.println("Minimum is : " + result + " & Time consumed : " + (eTime - sTime));

	sTime = System.currentTimeMillis();
	result = findMinOrMax(randomNumbers, size, "max");
	eTime = System.currentTimeMillis();
	System.out.println("Maximum is : " + result + " & Time consumed : " + (eTime - sTime));

    }

    public static int findMinOrMax(int[] arr, int size, String type)
   {
	int target = arr[0], i = 0;

	switch(type)
	{
	    case "min":
		do
		{
                  	    if(arr[i] < target)
	       	       target = arr[i];
	 	    i++;
		}while (i < size);
		break;

	    case "max":
		do
		{
                  	    if(arr[i] > target)
	       	       target = arr[i];
	 	    i++;
		}while (i < size);
		break;

	    default:	
		return -1;			  
	}			
  	return target;
    }

}