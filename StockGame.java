 import java.util.ArrayList;
 
 public class StockGame
{
	private static int YahooPrice;
	private static int GooglePrice;
	private static int ApplePrice;
	private static int DisneyPrice;
	private	static ArrayList<String> list;
	
	
	public StockGame()
	{
		YahooPrice=(int)(Math.random()*10);
		GooglePrice=(int)(Math.random()*5+5);
		ApplePrice=(int)(Math.random()*3);
		DisneyPrice=(int)(Math.random()*5+2);
		
	}
	
    public double getYahooPrice ()
    {
    return YahooPrice;
    }
	public double getGooglePrice()
	{
	return GooglePrice;
	}
	public double getApplePrice()
	{
		return ApplePrice;
	}
	public double getDisneyPrice()
	{
		return DisneyPrice;
	}
	
	public void setYahooPrice(double price)
	{
		YahooPrice=(int)price;
	}
	
	public void setGooglePrice(double price)
	{
		GooglePrice=(int)price;
	}
	
	public void setApplePrice(double price)
	{
		ApplePrice=(int)price;
	}
	
	public void setDisneyPrice(double price)
	{
		DisneyPrice=(int)price;
	}
	
	public void StockMarketCrash()
	{	
		double percentage=(int)(Math.random()*10+20);
		YahooPrice*=(1-percentage);
		GooglePrice*=(1-percentage);
		ApplePrice*=(1-percentage);
		DisneyPrice*=(1-percentage);
	}
	
	public void TrumpBecomesPresident()
	{
		double percentage=(int)(Math.random()*10+10);
		YahooPrice*=(1+percentage);
		GooglePrice*=(1+percentage);
		ApplePrice*=(1+percentage);
		DisneyPrice*=(1+percentage);
		
	}
	
	public void AnikateBecomesPresident()
	{
	
		double percentage=(int)(Math.random()*10+90);
		YahooPrice*=(1-percentage);
		GooglePrice*=(1-percentage);
		ApplePrice*=(1-percentage);
		DisneyPrice*=(1-percentage);
	}
	
	public void SupplyShock()
	{
		double percentage=(int)(Math.random()*40);
		YahooPrice*=(1-percentage);
		GooglePrice*=(1-percentage);
		ApplePrice*=(1-percentage);
		DisneyPrice*=(1-percentage);
	}

	public String pickRandomEvent()
	{
	list.add("SupplyShock");
	list.add("AnikateBecomesPresident");
	list.add("TrumpBecomesPresident");
	list.add("StockMarketCrash");
	int listLength=4;
	int index=(int)Math.random()*listLength;
	String randomPick=list.remove(index)+"()";
	listLength--;
	if(listLength<0)
	{
		return("All random Events used up");
	}
	return (randomPick);
	}
}

 
 
 
 
