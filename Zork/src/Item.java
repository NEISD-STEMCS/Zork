
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
		setAtt(0);
		setDef(0);
		setKeyNum(-1);
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
		this.setAtt(att);
		this.setDef(def);
		this.setKeyNum(keyNum);
	}
	
	public String getName() {
		return name;
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getKeyNum() {
		return keyNum;
	}

	public void setKeyNum(int keyNum) {
		this.keyNum = keyNum;
	}
	
	
	
}
