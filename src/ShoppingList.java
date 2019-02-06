import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingList {
	
	static ArrayList<String> listName = new ArrayList<>();
	static ArrayList<Double> listPrice = new ArrayList<>();

	
	static HashMap<String, Double> menu = new HashMap<>();
	 //static means it belongs to the class
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String name;
		double price;
		String yn = "y";

	
		System.out.println("Welcome To Stop-n-Go!");
		
		 
		//array of 8 item names and prices 
	        menu.put("Pomegrante", 2.99); 
	        menu.put("Strawberries", 4.99); 
	        menu.put("Bananas", 3.99);
	        menu.put("Apples", 1.99);
	        menu.put("Raspberries",6.99);
	        menu.put("Grapes",7.99); 
	        menu.put("Oranges", 9.99); 
	        menu.put("Pineapple", 10.99); 
	        menu.put("Grapefruit", 8.99);
	        
	        
		while(!yn.equalsIgnoreCase("n")) {
			print(menu);
			System.out.println("Please enter an item name:");
			//Prompt
			name = scnr.nextLine();
			//Scanner
			boolean location = menu.containsKey(name);
			price = menu.get(name);
			System.out.println("Adding " + name + " to cart at " + getPrice(name));
			shoppingCart(name, getPrice(name));
			//finish
			System.out.println("Would you like to order anything else (y/n)?");
			//Prompt
			yn = scnr.nextLine();
			//Scanner
		    
		}
	    
			printList(); 
	        System.out.println("Average: " + avgItems(listPrice));
	        //lowPrice();
	        //highestPrice();
	        
	        
	        } 
	      
		
		public static void print(HashMap<String, Double> menu) {

			System.out.printf("%-20s %-10s\n","Item","Price");
		    System.out.println("=============================");

			
			
			for (Map.Entry<String,Double> entry : menu.entrySet()) {
			    String key = entry.getKey();
			    double value = entry.getValue();
			    System.out.printf("%-20s $%-10s\n",key,value);
			    //f is added for formatting
			  
			  }
			
			
	    }

		public static double getPrice(String name) {
			for (Map.Entry<String,Double> entry : menu.entrySet()) {
			    String key = entry.getKey();
			    double value = entry.getValue();
			    //use .equals to compare strings
			    if(key.equals(name))
			    	return value;
			   
		} 
		
					return 0.0;
		
	}
		
		public static void shoppingCart(String name, double price) {
			listName.add(name); 
			listPrice.add(price);
		}
	
		public static void printList() {
			int i = 0;
			for (String entry : listName) {
				System.out.printf("%-20s $%-10s\n", entry, listPrice.get(i));
				//f is added for formatting
				i++;
		  }
			
   }
		
		public static double avgItems(ArrayList<Double> items) {
			double sum = 0;
			
			for(Double price : listPrice ) {
				sum += price;
			}
			sum = sum / listPrice.size();
			printList();
			
			return sum;
		}
}


