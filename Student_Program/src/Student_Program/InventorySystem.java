package Student_Program;

import java.util.Scanner;
import midterm.Item;

/**
 * Simulator to add items, print inventory and to search item's price.
 *
 * @author Ali Hassan
 * @author Paul Bonenfant Feb 2021
 */
public class InventorySystem {

    public static void main(String[] args) {
        
        Item item1 = new Item(0, null, 0);//No ID, decription or price assigned.


         // Add a new item to the inventory. Program asks the user to enter name
         // and quantity of the item. For new item's ID, program simply
         // increments the ID of the last item added.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter description of the item to add:");
        String description = input.nextLine();
        
        System.out.println("Enter the price:");
        double price = input.nextDouble();
        
        Item item2 = new Item(++item1.id, description, price);
        item1.addItem(item2);


        // Add two more items.
        Item item3 = new Item(++item1.id, "Sony Headphones", 199.99);
        item1.addItem(item3);

        Item item4 = new Item(++item1.id, "JBL Speaker", 99.99);
        item1.addItem(item4);

        // Print the list
        item1.printList();

        // Search for a specific price
        System.out.println("Enter ID of the item whose price you want to find:");
        int id = input.nextInt();
        System.out.println("Item's price is: " + item1.getItemPrice(id));
    }
}
