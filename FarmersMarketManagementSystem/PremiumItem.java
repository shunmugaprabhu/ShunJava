package FarmersMarketManagementSystem;

public class PremiumItem extends StallItem 
{
	private double taxPercentage;
	public PremiumItem()
	{
		super();
	}
	public PremiumItem(String iName, double iPrice,double taxPer)
	{
		super(iName,iPrice);
		taxPercentage=taxPer;		
	}
	public  double getPrice()
	{
		return (super.getPrice() + super.getPrice() * taxPercentage/100.0);
	}
	public String toString()
	{
		return getName()+"\t"+getPrice();
	}
}