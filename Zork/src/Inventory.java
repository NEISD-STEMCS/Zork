
public class Inventory {

	private int size = 0;
	private Item[] inv;
	
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

	public Item get(int index)
	{
		return inv[index];
	}
	
	/**
	 * Returns the number of elements in the Inventory
	 * @return the number of elements in the inventory
	 */
	public int getSize() {
		return size;
	}

	/**
	 * This method will add an Item to the array
	 * at position [size]
	 * 
	 * @param item The item to be added
	 * @return the location in the inventory
	 * where it was added (-1 for couldn't do it)
	 * 
	 * 
	 */
	
	public int add(Item item)
	{
		if (size < inv.length)
		{
			inv[size] = item;
			size++;
			return size-1;
		}
		else
		{
			return -1;
		}
	}
	
	/**
	 * This method will remove an entry from the
	 * array (inv) at position (index).  If the 
	 * size is larger than index it will move the 
	 * items down to fill the gap
	 * @param index
	 */
	public void remove(int index)
	{
		if (index < size){	//If it's a valid index (If the index is greater than size, we aren't using that index and can't remove it)
			inv[index] = null;  //remove this one
			for (int i = index; i < size; i++) //starting at index and moving up, copy the next over this one
			{
				inv[i] = inv[i+1];			
			}
			size--;
			inv[size]=null; //remove the last one that was copied
		}
	}
	
	/**
	 * pickUp accepts an inventory and an index, picks up the specified item and 
	 * returns the index where it was place
	 * @param srcInv The source inventory
	 * @param index The index of the object to be picked up
	 * @return The index where the object was placed
	 */
	public int pickUp(Inventory srcInv, int index)
	{
		int destIndex = this.add(srcInv.get(index));
		srcInv.remove(index);
		return destIndex;
	}
	
	/**
	 * Displays the index and item description for each item in the inventory
	 */
	public void display()
	{
		for (int i = 0; i < size; i++)
		{
			System.out.printf("%2d\t%s\n", i, inv[i].getName());
		}
	}
	
	/**
	 * Returns the index of an item with the specified string in its description
	 * @param keyword the word to look for
	 * @return the index where the item was placed
	 */
	public int find(String keyword) {
		for (int i = 0; i < size; i++)
		{
			if (inv[i].getName().indexOf(keyword)>=0)
				return i;
		}
		return -1;
	}
	
	
}
