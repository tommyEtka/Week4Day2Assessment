package PersonManagerEmployeePoly;

import java.util.InputMismatchException;
import java.util.Scanner;

public class assessment {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		System.out.println("Please enter in two integers");

//while(true)
try {	
			float x = scan1.nextFloat();
		scan1.nextLine();
			float y = scan1.nextFloat();
		scan1.nextLine();			
			

			float result = x / y;
			//break;
}
catch (InputMismatchException e) {
	System.out.println("Error 0 cannot be in the denominator");
	
			
	}
	catch(ArithmeticException e)
	{

			//System.out.println(result);
		}
	}
}