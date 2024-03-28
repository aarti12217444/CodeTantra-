/*You are tasked with creating a simple calculator application that performs addition and multiplication operations.
Define a base class Calculation with a constructor that takes two parameters. 
Implement a method addition in the Calculation class. 
The addition method should take the two parameters and return their sum.
Create a child class My_Calculation that inherits from the Calculation class. 
In the child class, implement a method multiplication that returns the product of the two parameters that 
are inherited from the base class.
Input format:
The two lines of the input are integers.
Output format:
The first line is the integer representing the result of the addition operation.
The second line is the integer representing the result of the multiplication operation.
Note:
The code for handling inputs, creating objects, invoking methods, and printing results is already provided in the editor. 
Your task is to implement the Calculation class based on the given specifications.
*/
import java.util.Scanner;
public class MainCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


System.out.println(num1 + num2);
System.out.println(num1 * num2);
}
}


