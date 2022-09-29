package FarmersMarketManagementSystem;

abstract public class StallItem 
{
	private String itemName;
	private double itemPrice;
	
	public StallItem()
	{
		itemName="";
		itemPrice=0.0;
	}
	public StallItem(String iName, double iPrice)
	{
		itemName=iName;
		itemPrice=iPrice;
	}
	public void setItemName(String iName)
	{
		itemName=iName;
	} 
	public String getName()
	{
		return itemName;
	}
	public void setItemPrice(double iPrice)
	{
		itemPrice=iPrice;
	}
	public double getPrice()
	{
		return itemPrice;
	}
	public String toString()
	{
		return itemName+"\t\t"+String.valueOf(itemPrice);
	}
}
