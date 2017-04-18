
public class Item {

	private String name;
	private int att;
	private int def;
	private int keyNum;
	
	/**Creates an item with <name> as
	* the name
	* @param name The name of the object
	**/
	public Item(String name)
	{
		this.name = name;
		att = 0;
		def = 0;
		keyNum = -1;
	}
	
	/**
	 * Creates an item will all of its attributes
	 * 
	 * @param name = the name of the object
	 * @param att = the attack additive points
	 * @param def = the defense additive points
	 * @param keynum = the key number (-1 if not a key)
	 */
	public Item(String name, int att, int def, int keyNum)
	{
		this.name = name;
		this.att = att;
		this.def = def;
		this.keyNum = keyNum;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}
