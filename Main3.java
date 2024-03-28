/*Create a class named Vehicle with the following attributes:

String variable make (represents the vehicle's make or manufacturer).
String variable model (represents the vehicle's model).


Create a class named CarInfo that inherits from Vehicle and has the following characteristics:

A method inputCarDetails() that takes user input for the car's make and model.
A method displayCarInfo() that prints the car's make and model to the console.


Note: Driver code has already been provided, you just need to write the code for the classes.*/


import java.util.Scanner;
class Vehicle{
	String make;
	String model;
}
class CarInfo extends Vehicle{
	void inputCarDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter car's make: ");
		make=sc.nextLine();
		System.out.println("enter model: ");
		model=sc.nextLine();
	}
	public void displayCarInfo(){
		System.out.print("make: "+make);
		System.out.print("model: "+model);
	}
}
public class Main3{
	public static void main(String[] args){
		CarInfo c1=new CarInfo();
		c1.inputCarDetails();
		c1.displayCarInfo();
	}
}
	


































/*class Vehicle{
	String make;
	String model;
}
class CarInfo extends Vehicle{
	void inputCarDetails(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter car make: ");
		make=scanner.nextLine();
		
		System.out.print("Enter car model: ");
		model=scanner.nextLine();
	}
	
	void displayCarInfo(){
		System.out.println("Car Make: "+make);
		System.out.println("Car Model: "+model);
	}
}

public class Main {
    public static void main(String[] args) {
        CarInfo carData = new CarInfo();
        carData.inputCarDetails();
        carData.displayCarInfo();
    }
}*/
