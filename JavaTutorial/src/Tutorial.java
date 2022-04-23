import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class Tutorial {
	//methods in Java
	public static void DisplayA() {
		System.out.print("\nThis displays the value A\n");
	}
	public static void DisplayB() {
		System.out.print("This display the value B\n");
	}
	
	public static void Calculator(){
		int a = 4;
		int b = 5;
		//Arithmetic Operators
		
		System.out.println("Add: a + b = "+(a+b));
		System.out.println("Sub: a - b = "+(a-b));
		System.out.println("Mult: a * b = "+(a*b));
		System.out.println("Div: a / b = "+(a/b));
		System.out.println("remainder: a % b = "+(a%b));
		System.out.println("incr: ++a = "+(++a));
		System.out.println("decr: --b = "+(--b));
		
		// Relational Operators
		System.out.println("Is a equal to b "+(a==b));
		System.out.println("Is a not equal to b "+(a!=b));
		System.out.println("Is a greater than b "+(a>b));
		System.out.println("Is a less than b "+(a<b));
		System.out.println("Is a greater than or equal b "+(a>=b));
		System.out.println("Is a less than or equal b "+(a<=b));
		
		/* Loops in Java */
		
		//While Loop
		int i = 0;
		while(i <4) {
			System.out.println("The value of i is "+i);
			i++;
		}		
		//
		i = 0; // initialize i = 0 again
		do {
			System.out.println("Inside the do-while loop");
			System.out.println("The value of i is "+i);
			i++;
			
		}while(i<4);
		//FOR Loops 
		for(int j = 0; j<5;j++) {
			System.out.println("Value of j is: "+j);
		}
		//Nested Loops
		for(int  k= 0; k < 3;k++) {
			System.out.println("The value of k is "+k);
			for(int l = 0; l<3;l++) {
				System.out.println("The value of l is "+l);			
			}
		}
		
		
	}
	
	
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
				
		obj.close();
		
	
		/*List*/
		
		//Example: A = [1,2,3]
		int[] A = {1,2,3};
		Solution sol = new Solution();
		int n = sol.findNum(A);
		System.out.println("Find: "+n);
		
		double x_num = 5.00;
		int num1 = 0;
		double r = sol.mypow(x_num, num1);
		System.out.println(r);
		
		/* String Exercises*/
		
		//test 1
		int[] A1= {1,0,0,0,0,1,0,0};
		int num_day = 1;
		List<Integer> result = new ArrayList<>();
		
		result = sol.cellcompete(A1, num_day);
		System.out.println(result);
		
		//OOP example test
		//an example encapsulation for the student ID
		Student stud = new Student();
		stud.setID(23);
		System.out.print("The ID of the student is : " +stud.getID());
		
		//inheritance student class inherit from the Parent class
		stud.setName("KC Wang");
		System.out.print("\nThe name of the student is "+stud.getName());
		
		//Display the interface 
		stud.setID(20);
		stud.setName("UserA");
		stud.Display(); 
		
		Person per = new Person();
		per.Display();
		
		//Collections
		Stack<String> st = new Stack<String>();
		//adding elements
		st.push("A");
		st.push("B");
		st.push("C");
		//printing the content of the stack
		System.out.print(st.pop());
		System.out.print(st.pop());
		System.out.print(st.pop());
		
		//call the method DisplayA and DisplayB
		DisplayA();
		DisplayB();
		
		//Calculator
		Calculator();
		
		
		
		
	}

}