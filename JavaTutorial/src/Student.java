// explorer the concept of OOP using class

class Person{ // Class Person 
	//Encapsulating the ID property;
	private int ID;
	//setters 
	public void setID(int id) {
		ID = id;
	}	
	//getters
	int getID() {
		return ID;
	}	
	//display()
	public void Display() {
		System.out.println("This is the Person");
	}
	
}

public class Student extends Person 
{
	private String Name;
	public void setName(String pName) {
		Name= pName;
	}
	
	public String getName() {
		return Name;
	}
	
	public void Display() {
		System.out.println("\nThis is the Student");
	}
	
}