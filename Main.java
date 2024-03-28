/*Create a class named Temperature with the following attributes:
A float variable celsius represents the temperature in Celsius.
A float variable fahrenheit represents the temperature in Fahrenheit.
A method inputTemperature() that takes user input for temperature in Celsius.
Create a class named Conversion that extends Temperature to calculate and display the temperature in Fahrenheit.
 This class should have the following attributes:
A method convertToFahrenheit() that calculates and prints the temperature in Fahrenheit up to 2 decimal places.
Hint: Temperature in fahrenheit = (temperature in celsius * 9 / 5) + 32
Note: The main class has been provided to you in the editor.*/

import java.util.Scanner;
class Temperature{
	float celsius;
	float fahrenheit;
	void inputTemperature(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp in Celsius: ");
		celsius=sc.nextFloat();
	}
}
class Conversion extends Temperature{
	 void convertToFahrenheit(){
		fahrenheit=(celsius*9/5)+15;
	System.out.printf("Temperature in fahrenheit %.2f\n",fahrenheit);
	 }
}
public class Main{
	public static void main(String [] args){
		Conversion c1=new Conversion();
		c1.inputTemperature();
		c1.convertToFahrenheit();
	}
}












/* public class Main{
 	public static void main(String[] args){
 		Scanner scanner = new Scanner(System.in);
		
 		System.out.print("Enter temperature in Celsius: ");
		float n=scanner.nextFloat();

		System.out.print("Temperature in Fahrenheit: ");
float d=(n*9/5)+32;
		
//System.out.println(n);
	System.out.println(d);

 	}
}*/






