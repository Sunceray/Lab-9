import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Lab9 {
 
	//1. Display a list of at least 8 item names and prices
	
	private static Map<String,Double> menu = new TreeMap<>();
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		//1. Display a list of at least 8 item names and prices
		//2. Ask the user to enter a name
		
		List<String> purchasedItems = new ArrayList<>();
		List<Double> totalCost = new ArrayList<>();
		String orderStuff;
		String userInput = null;
		String userInput1 = "";
		
		
		System.out.println("Welcome to The Silver Dollar!");
		System.out.println("Item\t\tPrice");
		System.out.println("=============================");
		
		
		populateMenu();  //calling the method
		printMenu();
		
	
		do {
			
		System.out.println("What would you like to order?");
			
		orderStuff = scnr.nextLine(); //initializing 
		if(menu.get(orderStuff) == null) {
			System.out.println("Invaild Entry");
			continue;
		}
		
		
		System.out.println("Adding" + orderStuff + "to cart at" + menu.get(orderStuff));
		
		purchasedItems.add(orderStuff); // 
		totalCost.add(menu.get(orderStuff));
		scnr.nextLine();
		
		System.out.println("Would you like to order anything else? y/n");
		userInput1 = scnr.nextLine();
		
		if (userInput1.equalsIgnoreCase("n")) {
			break;
			
		}
		printMenu();
	
		} while(userInput1.equals(""));
		
		System.out.println("No Worries, Come Again!");
			
			
			
		}
		
	
 
	
		private static void printMenu() {
		for (String name : menu.keySet()) {
			System.out.printf("%-20s $%-10s\n",name, menu.get(name));
	
	
		}
		
		
		
		
		}
	
	private static void populateMenu() {
		menu.put("Lambchops", 59.99);
		menu.put("Chicken Alfredo", 49.99);
		menu.put("Hot Wings", 39.99);
		menu.put("Garlic Fries", 10.99);
		menu.put("Philly Cheesesteak", 39.99);
		menu.put("Cheeseburger", 29.99);
		menu.put("Crab Legs", 89.99);
		menu.put("Veggie Burger",10.99);
		
		
	}
	
	
	
}
