package question4.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import question4.model.Product;

public class Main {
	static Scanner scanner=new Scanner(System.in);

    public static void main(String args[]){
    	List<Product> prods = new ArrayList<>();
    	
    	System.out.println("Enter 5 Products");
    	System.out.println();
    	for(int i=0;i<5;i++) {
    	System.out.println("Enter Product Name");
		String productName=scanner.nextLine();
    	System.out.println("Enter Product Price ");
		int productPrice=scanner.nextInt();
		scanner.nextLine();   
		Product pro=new Product(productName,productPrice);
		prods.add(pro);
		}		displayProductInfo(prods);

    }

	public static void addStudent(Product pro) {
		List<Product> prods = new ArrayList<>();
		prods.add(pro);
		
		displayProductInfo(prods);

	}
	public static void displayProductInfo(List<Product> prods) {
	
		Product maxprice = prods.stream().max(Comparator.comparingInt(Product::getProductPrice)).get();
		Product minprice = prods.stream().min(Comparator.comparingInt(Product::getProductPrice)).get();
		List<Product> startsWithS=prods.stream().filter(s -> s.getProductName().startsWith("s")).collect(Collectors.toList());
		List<Product> filteredPrice = prods.stream().filter(s->s.getProductPrice()>100&&s.getProductPrice()<200)
		.collect(Collectors.toList());
		
		System.out.println("Product with Highest price is "+maxprice);
		System.out.println("Product with Lowest price is "+minprice);
		System.out.println("All the Products whose names starts with s are");
		startsWithS.forEach(s -> System.out.println(s));
		Iterator<Product> itr=filteredPrice.iterator();
		while(itr.hasNext()) {
		System.out.println("All the products whose price is between 100 and 200 are ");
		System.out.println(itr.next());}
   	}
}
