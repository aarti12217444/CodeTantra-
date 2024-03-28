/*Create a class named MathOperation with the following attributes:

int variable number1.
int variable number2.


Create a class named ArithmeticOperations that inherits from MathOperation and has the following characteristics:

A method inputNumbers() that takes user input for number1 and number2.
A method displaySum() that calculates and prints the sum of the numbers.
A method displayDifference() that calculates and prints the difference (number1 - number2).
A method displayProduct() that calculates and prints the product of the numbers.
A method displayQuotient() that calculates and prints the quotient (number1 / number2).


Note: Driver code has already been provided, you just need to write the code for the classes.
*/

import java.util.Scanner;
class MathOperation{
	int n1;
	int n2;
}
class ArithmeticException extends MathOperation{
	void inputNumbers(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		n1=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		n2=sc.nextInt();
	}
	public void displaySum(){
		System.out.print("Sum:" +(n1+n2));
	}
	public void displayDifference(){
		System.out.print("Difference:" +(n1-n2));
	}
	public void displayProduct(){
		System.out.print("Product:" +(n1*n2));
	}
	public void  displayQuotient(){
		System.out.printf("%.2f\nQuotient:" +(n1/n2));
	}
}
public class Main2{
	public static void main(String[] args){
		ArithmeticException i=new ArithmeticException();
		i. inputNumbers();
		i. displaySum();
		i.displayDifference();
		i.displayProduct();
		i.displayQuotient();
	}
}







































class MathOperation{
	int n1;
	int n2;
}
class ArithmeticOperations extends MathOperation{
	void inputNumbers() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("first number: ");
		n1 = scanner.nextInt(); 
		
		System.out.print("second number: ");
		n2 = scanner.nextInt();
	}
	void displaySum() {
		System.out.println("Sum: " + (n1+n2));
		
	}
	void displayDifference() {
		System.out.println("Difference: " + (n1-n2));
	}
	void displayProduct() {
		System.out.println("Product: " + (n1*n2));
	}
	void displayQuotient() {
		if(n2 == 0) {
			System.out.println("Cannot divide by zero. Quotient is undefined.");
		}
		else {
		System.out.println("Quotient: " + ( n1 / (float) n2 ));
		}
	}
}

public class Main2 {
    public static void main(String[] args) {
        ArithmeticOperations mathOps = new ArithmeticOperations();
        mathOps.inputNumbers();
        mathOps.displaySum();
        mathOps.displayDifference();
        mathOps.displayProduct();
        mathOps.displayQuotient();
    }
}










