
public class Inventory {

	int size = 0;
	public Item[] inv;
	
	/**
	 * Inventory constructor
	 * Creates the default blank inventory with
	 * 10 spaces
	 */
	public Inventory()
	{
		inv = new Item[10];
	}
	
	/**
	 * Inventory Constructor
	 * Creates the blank inventory with 
	 * <items> spaces
	 * 
	 * @param items the number of Items the 
	 * inventory can hold
	 * 
	 */
	public Inventory(int items)
	{
		inv = new Item[items];
	}
	
	/**
	 * This method will add an Item to the array
	 * at position [size]
	 * 
	 * @param item The item to be added
	 * @return the location in the inventory
	 * where it was added (-1 for couldn't do it)
	 */
	public int add(Item item)
	{
		inv[size] = item;
		size++;
		return size-1;
	}
	
}
