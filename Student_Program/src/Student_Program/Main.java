package Student_Program;

import java.util.Scanner;
import midterm.Item;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create initial Item to manage inventory
        Item itemManager = new Item(0, null, 0); // Initial dummy item

        // User adds a new item
        System.out.println("=== Add New Item ===");
        System.out.print("Enter description: ");
        String description = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();
        input.nextLine(); // consume newline

        Item newItem = new Item(++itemManager.id, description, price);
        itemManager.addItem(newItem);

        // Add two predefined items
        Item item2 = new Item(++itemManager.id, "Sony Headphones", 199.99);
        itemManager.addItem(item2);

        Item item3 = new Item(++itemManager.id, "JBL Speaker", 99.99);
        itemManager.addItem(item3);

        // Display inventory
        System.out.println("\n=== Inventory List ===");
        itemManager.printList();

        // Search for item price by ID
        System.out.print("\nEnter item ID to find its price: ");
        int searchId = input.nextInt();
        double foundPrice = itemManager.getItemPrice(searchId);

        System.out.println("Price of item with ID " + searchId + " is: $" + foundPrice);
    }
}
