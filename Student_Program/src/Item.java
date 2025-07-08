package midterm;

/**
 * A class to model items stored in an inventory. For simplicity, let's assume each item in the
 * inventory has a description, price and a unique id. The system allows to add new items, find price by item's id and
 * print full inventory. Use this code to answer Part B.
 *
 * @author Ali Hassan
 * @author Paul Bonenfant, Feb. 2022
 */
public class Item {

    public int id;
    private String description;
    private double price;

    /**
     * An array to hold up to 100 items.
     */
    public static Item[] itemList = new Item[100];
    private int itemCounter = 0; // counts numbers of items in the itemList.

    public Item(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }


    /**
     * A method to add new item into the itemList.
     *
     * @param item the item object to be added into the itemList.
     */
    public void addItem(Item item) {
        itemList[itemCounter++] = item;
    }

    /**
     * A method to print full inventory i.e. item's ID, description and it's price.
     */
    public void printList() {
        for (Item item: itemList) {
            if (item == null) break;
            System.out.println("ID: " + item.id
                    + "\t Description: " + item.description
                    + "\t Price: " + item.price);
        }
    }

    /**
     * A method to get the price of a specific item in the itemList.
     *
     * @param id the ID of the item to be searched
     * @return the price of the item.
     */
    public double getItemPrice(int id) {
        double price = 0;
        for (int j = 0; j < itemCounter; j++) {
            if (itemList[j].id == id) {
                price = itemList[j].price;
                break;
            }
        }
        return price;
    }
}
