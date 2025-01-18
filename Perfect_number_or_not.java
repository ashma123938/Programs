package Java;

public class Perfect_number_or_not {

	public static void main(String[] args) {
		
		//variable initialization and declaration
		int number = 28, sum = 0;

	     for (int i=1; i<number; i++)
	       {
	    	 
	    //check the condition when the number is divided by i the reminder is 0
	     	if (number % i == 0)
	     		
	    //we already initialize the sum equal to 0
	 	        sum = sum + i;
	       }
	     
       //the sum is equal to number then print is perfect number
	     if (sum == number)
	       System.out.println (number+ " Is a perfect number");
	     else
	       System.out.println (number+ " Is not a perfect number");

	   }
	 }
//output:28 is a perfect number