public class Computer extends StockGame
{
	private double cash;
	
	public Computer()
	{
		cash=500;
	}
	
	public void buyStocks(int numstocks,String stockName)
	{
		if(stockName.equals("Yahoo"))
		{
		cash-=numstocks*getYahooPrice();
		setYahooPrice(1+(.02*numstocks));
		}
		else if(stockName.equals("Google"))
		{
			cash-=numstocks*getGooglePrice();
			setGooglePrice(1+(.02*numstocks));
		}
		else if(stockName.equals("Apple"))
		{
			cash-=numstocks*getApplePrice();
			setApplePrice(1+(.02*numstocks));
		}
		else if(stockName.equals("Disney"))
		{
			cash-=numstocks*getDisneyPrice();
			setDisneyPrice(1+(.02*numstocks));
		}
		else
		{
			cash=0000000;
		}
	}
	public void sellStocks(int numStocks,String stockName)
	{
		if(stockName.equals("Yahoo"))
		{
		cash+=numStocks*getYahooPrice();
			setYahooPrice(1-(.02*numStocks));
		}
		else if(stockName.equals("Google"))
		{
			cash+=numStocks*getGooglePrice();
			setGooglePrice(1-(.02*numStocks));
		}
		else if(stockName.equals("Apple"))
		{
			cash+=numStocks*getApplePrice();
			setApplePrice(1-(.02*numStocks));
		}
		else if(stockName.equals("Disney"))
		{
			cash+=numStocks*getDisneyPrice();
			setDisneyPrice(1-(.02*numStocks));
		}
		else
		{
			cash=cash;
		}
		
	}
	public double getCash()
	{
	return cash;
	}
}
 
 
 
