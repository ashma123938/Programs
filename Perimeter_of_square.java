package Java;
import java.util.Scanner;

           
public class Perimeter_of_square {
	
	public static void main(String[] args) {
		
		  //variable declaration
		 float s, perimeter;
		 
		   //we can take user input using scanner 
	      Scanner r = new Scanner(System.in);
	      
	      System.out.print("Enter the Side Length of Square: ");
	      s = r.nextFloat();
	      
	      // Calculate perimeter
	      perimeter = 4*s;
	      
	      // Display result
	      System.out.println("\nPerimeter = " +perimeter);
	   }
	}
	
		
		


