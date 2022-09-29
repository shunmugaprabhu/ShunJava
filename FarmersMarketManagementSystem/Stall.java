package FarmersMarketManagementSystem;

public class Stall 
{
	private String name,address;
	private StallItem[] items;
	private int itemPos;
	public Stall()
	{
		name="";
		items=new StallItem[10];
		itemPos=0;
	}
	public Stall(String n,String addr)
	{
		name=n;
		address=addr;
		itemPos=0;
		items=new StallItem[10];
	}
	public Stall(String n,String addr,StallItem[] it)
	{
		name=n;
		address=addr;
		items=it;
		
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String addr)
	{
		address=addr;
	}
	public String getAddress()
	{
		return address;
	}
	public void addItems(StallItem item)
	{
		items[itemPos++]=item;
	}
	public StallItem[] getItems()
	{
		return items;
	}	
	public String toString()
	{
		String result="";
		result+=name+"\t"+address+"\n";
		for(int i=0;i<itemPos;i++)
		{
			Object obj=items[i];
			if(obj instanceof  StandardItem)
				result+=((StandardItem) obj).toString()+"\n";
			else if(obj instanceof  PremiumItem)
				result+=((PremiumItem) obj).toString()+"\n";
			else if(obj instanceof  DiscountedItem)
				result+=((DiscountedItem) obj).toString()+"\n";
			else
				result+=((FlatFiftyItem) obj).toString()+"\n";			
		}
		return result;
	}
}
