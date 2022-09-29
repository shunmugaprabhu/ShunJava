package FarmersMarketManagementSystem;

public class DiscountedItem extends StallItem 
{
	private double discountPercentage;
	public DiscountedItem()
	{
		super();
	}
	public DiscountedItem(String iName, double iPrice,double discPer)
	{
		super(iName,iPrice);
		discountPercentage=discPer;		
	}
	public  double getPrice()
	{
		return (super.getPrice() - super.getPrice() * discountPercentage/100.0);
	}
	public String toString()
	{
		return getName()+"\t"+getPrice();
	}
}