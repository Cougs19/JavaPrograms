import java.util.Scanner;


public class Tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello there!");
		
		/* Data types */
		int a = 5; //integer a is assigned to 5
		
		float b = 1.2f; //float b assigned to 1.2f
		
		String c = "Hello"; //string c 
		
		char d = 'A';//char d 
		
		boolean e = true;// boolean 
		
		double f = 1.2345;//
		
		//Printing the output of the declared variables above
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		System.out.println("e: "+e);
		System.out.println("f: "+f);
		
		/* Decision Making*/
		System.out.println("Enter a value: "); //prompts the user for input
		Scanner obj = new Scanner(System.in); //create new object to get user input from the console	
		String num = obj.nextLine(); //gets the user input
		
		int i = Integer.valueOf(num); //convert the string to integer
		
		if(i == 1) {
			System.out.println("Inside the if statement");
			System.out.println("The value is: "+i);
		}
		else
		{
			System.out.println("Inside the else statement");
			System.out.println("The value is: "+i);
		}
		
	}

}
