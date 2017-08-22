 public class StockGame
{
	private static int YahooPrice;
	private static int GooglePrice;
	private static int ApplePrice;
	private static int DisneyPrice;
	private static String currentRandomEvent;
	
	
	public StockGame()
	{
		YahooPrice=(int)(Math.random()*10+5);
		GooglePrice=(int)(Math.random()*5+5);
		ApplePrice=(int)(Math.random()*10+5);
		DisneyPrice=(int)(Math.random()*5+5);
		
	}
	
    public int getYahooPrice ()
    {
    return YahooPrice;
    }
	public int getGooglePrice()
	{
	return GooglePrice;
	}
	public int getApplePrice()
	{
		return ApplePrice;
	}
	public int getDisneyPrice()
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
	
	public void stockMarketCrash()
	{	
		
		YahooPrice=(int)(Math.random()*5);
		GooglePrice=(int)(Math.random()*5);
		ApplePrice=(int)(Math.random()*5);
		DisneyPrice=(int)(Math.random()*5);
	}
	
	public void newPresident()
	{
		
		YahooPrice=(int)(Math.random()*5+2);
		GooglePrice=(int)(Math.random()*5+2);
		ApplePrice=(int)(Math.random()*5+2);
		DisneyPrice=(int)(Math.random()*5+2);
		
	}
	
	public void warBoom()
	{
	
		
		YahooPrice=(int)(Math.random()*5+3);
		GooglePrice=(int)(Math.random()*5+3);
		ApplePrice=(int)(Math.random()*5+3);
		DisneyPrice=(int)(Math.random()*5+3);
	}
	
	public void supplyShock()
	{
		
		YahooPrice=(int)(Math.random()*5);
		GooglePrice=(int)(Math.random()*5);
		ApplePrice=(int)(Math.random()*5);
		DisneyPrice=(int)(Math.random()*5);
	}

	public void pickRandomEvent()
	{
	int randomPick=((int)(Math.random()*4));
	if (randomPick==0)
	{
		this.stockMarketCrash();
		currentRandomEvent="Stock Market Crash";
	}
	else if (randomPick==1)
	{
		this.warBoom();
		currentRandomEvent="WarBoom";
	}
	else if(randomPick==2)
	{
		this.supplyShock();
		currentRandomEvent="Supply Shock";
	}
	else 
	{
		this.newPresident();
		currentRandomEvent="New President";
	}
	
	
	}
	
	public String getCurrentRandomEvent()
	{
		return currentRandomEvent;
	}
	
}

 
 
