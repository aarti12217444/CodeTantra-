/*Create a class named Person with the following characteristics:

A String variable name.
A method inputName() that takes user input for the name.
A method displayName() that prints the name to the console.


Create a class named Citizen that inherits from Person and has the following characteristics:

An int variable age.
A method inputAge() that takes user input for the age.
A method displayAge() that prints the age to the console.


Note: The main class has been provided to you in the editor. The MainPerson class creates an instance of Citizen, 
takes user input for name and age, and then displays the entered name and age. The program demonstrates the use of inheritance,
 where the Citizen class inherits attributes and methods from the Person class.
*/
import java.util.Scanner;
class Person{
	String name;
	void inputName(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.nextLine();
	}
	void displayName(){
		System.out.println("Name: "+name);
	}
}
class Citizen extends Person{
	int age;
	public void inputAge(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		age=sc.nextInt();
	}
	public void displayAge(){
		System.out.println("Age: "+age);
	}
}
public class MainPerson{
	public static void main(String[] args){
		Citizen c=new Citizen();
		//c.inputAge();
		c.inputName();
		c.displayName();
		c.inputAge();
		c.displayAge();
	}
}
	



//2nd method
/*
public class MainPerson{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String s=sc.nextLine();
		System.out.println("Name: "+s);
		
		System.out.print("Enter age: ");
		int i=sc.nextInt();
		System.out.println("Age: "+i);
		// System.out.println("Name: "+s);
		// System.out.println("Age: "+i);
	}
}*/
