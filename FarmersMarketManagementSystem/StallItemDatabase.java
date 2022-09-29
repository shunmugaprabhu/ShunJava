package FarmersMarketManagementSystem;

import java.util.ArrayList;

public class StallItemDatabase 
{
	private Stall stall;
	private ArrayList<StallItem> items;	
	public StallItemDatabase(Stall st)
	{
		stall=st;
		items=new ArrayList<StallItem>();		
	}
	public void insert(int itno, StallItem item)
	{		
		items.add(itno,item);
	}
	public StallItem retrieve(int pos)
	{
		return items.get(pos);
	}	
	public String toString()
	{
		String result="";
		
		for(int i=0;i<items.size();i++)
		{
			Object obj=items.get(i);
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
