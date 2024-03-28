/*Create a class named Product with the following attributes:

String variable productName (represents the name of the product).
double variable price (represents the price of the product).


Create a class named ProductInfo that inherits from Product and has the following characteristics:

A method inputProductDetails() that takes user input for the product's name and price.
A method displayProductInfo() that prints the product's name and price to the console.


Note: Driver code has already been provided, you just need to write the code for the classes.
*/

import java.util.Scanner;
class Product{
	String pName;
	double price;
}
class ProductInfo extends Product{
	void inputProductDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("pName: ");
		pName=sc.nextLine();
		System.out.println("price: ");
		price=sc.nextDouble();
	}
	public void displayProductInfo(){
		System.out.println("pName: "+pName);
		System.out.println("price: "+price);
	}
}
public class Main4{
	public static void main(String[] args){
		ProductInfo p=new ProductInfo();
		p.inputProductDetails();
		p.displayProductInfo();
	}
}



































/*class Product{
	String productName;
	double price;
}
class ProductInfo extends Product{
	void inputProductDetails(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("product name: ");
		productName=scanner.nextLine();
		
		System.out.print("price: "+"$");
		price=scanner.nextDouble();
	}
	void displayProductInfo(){
		System.out.println("product name: "+productName);
		System.out.println("price: "+"$"+price);
	}
}

public class Main {
    public static void main(String[] args) {
        ProductInfo productData = new ProductInfo();
        productData.inputProductDetails();
        productData.displayProductInfo();
    }
}*/
