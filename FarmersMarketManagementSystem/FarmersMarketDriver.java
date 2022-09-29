package FarmersMarketManagementSystem;

public class FarmersMarketDriver 
{
	public static void main(String[] args)
	{
		StallItem item1=new StandardItem("Red Delicious",10.0);
		StallItem item2=new StandardItem("Gala",8.0);
		StallItem item3=new PremiumItem("Fuji",5.0,2.5);
		StallItem item4=new DiscountedItem("Honeycrisp",12.0,10);
		StallItem item5=new FlatFiftyItem("Cripps Pink",24.0);
		
		System.out.println("Stall Details");
		System.out.println("------------------------------------------------------------");
		Stall stall=new Stall("Apple Stall","45 Golden Street");
		stall.addItems(item1);
		stall.addItems(item3);
		stall.addItems(item5);
		
		
		//Testing 1 - Stall
		
		System.out.println(stall);
		System.out.println("------------------------------------------------------------");
		
		
		System.out.println("StallItemDatabase Details");
		System.out.println("------------------------------------------------------------");
		StallItemDatabase stallDb=new StallItemDatabase(stall);
		
		stallDb.insert(0, item1);
		stallDb.insert(1, item2);
		stallDb.insert(2, item3);
		stallDb.insert(3, item4);
		stallDb.insert(4, item5);
		
		//Testing 2 - StallItemDatabase
		
		System.out.println(stallDb);
		
		System.out.println("------------------------------------------------------------");
	}
}
