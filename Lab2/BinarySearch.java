import java.util.Random;
import java.util.Arrays;   

public class BinarySearch{

     public static void main(String args[]){

	long sTime, eTime;

	int result, size = 1000, i = 0;

	Random randomObject = new Random();	
	int randomNumbers[] = new int[size];		
	
	while (i < size)
	{
	     randomNumbers[i] = randomObject.nextInt(99);
	     //System.out.println(randomNumbers[i]);
	     i++;
	}
	
	Arrays.sort(randomNumbers);

	sTime = System.currentTimeMillis();
	result = binarySearch(randomNumbers, 50, 0, 999);
	eTime = System.currentTimeMillis();

	System.out.println("Element is found at : " + result + " & Time consumed : " + (eTime - sTime));

    }

     
     // 2 6 8 9 12
     public static int binarySearch(int[] arr, int needle, int start, int end)
      {
	int mid = (start + end) / 2;
	if (needle <= arr[end])
  	{
	    if(arr[mid] < needle)
	      {
	           start = mid+1;		// +1 is for changing boundaries if no found or be in infinite loop
                         return binarySearch(arr, needle, start, end);
	      }
	     else if(arr[mid] > needle)
	    {
	        end = mid-1;
                      //binarySearch(arr, needle, start, end);	               // return the value of current level regardless these useless calls
	        return binarySearch(arr, needle, start, end);	// return the deepest value out of this call
	    }
	    else if(arr[mid] == needle)
	   {
  	      return mid;
	   }
             }
	
            return -1;
      }

}