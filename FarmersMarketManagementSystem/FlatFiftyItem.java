package FarmersMarketManagementSystem;

public class FlatFiftyItem extends StallItem 
{	
	public FlatFiftyItem()
	{
		super();
	}
	public FlatFiftyItem(String iName, double iPrice)
	{
		super(iName,iPrice);		
	}
	public  double getPrice()
	{
		return super.getPrice()/2.0;			//50% discount
	}
	public String toString()
	{
		return getName()+"\t"+getPrice();
	}
}