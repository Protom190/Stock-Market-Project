public class Computer extends StockGame
{
	private int cash;
	
	public Computer()
	{
		cash=50;
	}
	
	public void buyStocks(int numstocks,String stockName)
	{
		if(stockName.equals("Yahoo"))
		{
			cash-=(numstocks*getYahooPrice());
		
		}
		else if(stockName.equals("Google"))
		{
			cash-=(numstocks*getGooglePrice());
		
		}
		else if(stockName.equals("Apple"))
		{
			cash-=(numstocks*getApplePrice());
			
		}
		else if(stockName.equals("Disney"))
		{
			cash-=(numstocks*getDisneyPrice());
			
		}
		
	}
	public void sellStocks(int numStocks,String stockName)
	{
		if(stockName.equals("Yahoo"))
		{
		cash+=(numStocks*getYahooPrice());
			
		}
		else if(stockName.equals("Google"))
		{
			cash+=(numStocks*getGooglePrice());
		}	
		else if(stockName.equals("Apple"))
		{
			cash+=(numStocks*getApplePrice());
			
		}
		else if(stockName.equals("Disney"))
		{
			cash+=(numStocks*getDisneyPrice());
			
		}
		
		
	}
	public double getCash()
	{
	return cash;
	}
}
