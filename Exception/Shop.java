/*4)define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;

parameterized constructor which will accept above details at the time
of creating object.
	member function
void display()
which will display all the details of product
create instances of this class and call the method display.*/

package Assignment;

class Item
{
	private String itemid;
	private String name;
	private int cost;
	public Item(String itemid, String name, int cost) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}
	void Display()
	{
		System.out.println("ItemID is:"+"\t"+itemid);
		System.out.println("Item Name is:"+"\t"+name);
		System.out.println("Item Cost is:"+"\t"+cost);
	}
	

}
public class Shop {

	public static void main(String[] args) 
	{
		Item item=new Item("G120","ParleG",10);
		item.Display();
		
	}

}
