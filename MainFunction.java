 /*Create a class named NumberIn with the following attributes:

An int variable num.
A method inputNum() that takes user input for the number.


Create a class named CubeOut that inherits from NumberIn and has the following characteristics:

A method displayCube() that prints the cube of the entered number to the console.


Note: The main class has been provided to you in the editor.*/


import java.util.Scanner;
class NumberIn{
int num;
void inputNum(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number: ");
num=sc.nextInt();
	}
}
class CubeOut extends NumberIn{

public void displayCube(){
System.out.print("Cube: "+(num*num*num));
	}
}
public class MainFunction{
public static void main(String[] args){
CubeOut c=new CubeOut();
c.inputNum();
c.displayCube();
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*class NumberIn{
		int num;
		void inputNum(){
			Scanner scanner=new Scanner(System.in);
			System.out.print("Enter number: ");
			num=scanner.nextInt();
		}
	}
		class CubeOut extends NumberIn{
			void displayCube(){
				System.out.println(num*num*num);
			}
		}
	

public class MainFunction {
    public static void main(String[] args) {
    	CubeOut cubeeout = new CubeOut();
        cubeeout.inputNum();
        cubeeout.displayCube();
    }
}*/
