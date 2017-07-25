public class Player extends StockGame
{
	private double cash;
	
	
	public Player()
	{
		cash=500;
	}
	
	public void buyStocks(int numstocks,String stockName)
	{
		if(stockName.equals("Yahoo"))
		{
		cash-=numstocks*getYahooPrice();
		setYahooPrice((1+(.02*numstocks))*getYahooPrice());
		}
		else if(stockName.equals("Google"))
		{
			cash-=numstocks*getGooglePrice();
			setGooglePrice((1+(.02*numstocks))*getGooglePrice());
		}
		else if(stockName.equals("Apple"))
		{
			cash-=numstocks*getApplePrice();
			setApplePrice((1+(.02*numstocks))*getApplePrice());
		}
		else if(stockName.equals("Disney"))
		{
			cash-=numstocks*getDisneyPrice();
			setDisneyPrice((1+(.02*numstocks))*getDisneyPrice());
		}
		else
		{
			cash=cash;
		}
	}
	
		public void sellStocks(int numStocks,String stockName)
		{
		if(stockName.equals("Yahoo"))
		{
		cash+=numStocks*getYahooPrice();
		setYahooPrice((1-(.02*numStocks))*getYahooPrice());
		}
		else if(stockName.equals("Google"))
		{
			cash+=numStocks*getGooglePrice();
			setGooglePrice((1-(.02*numStocks))*getGooglePrice());
		}
		else if(stockName.equals("Apple"))
		{
			cash+=numStocks*getApplePrice();
			setApplePrice((1-(.02*numStocks))*getApplePrice());
		}
		else if(stockName.equals("Disney"))
		{
			cash+=numStocks*getDisneyPrice();
			setDisneyPrice((1-(.02*numStocks))*getDisneyPrice());
		}
		else
		{
			cash=0000000;
		}
		}
		
		public double getCash()
		{
		return cash;
		}
		
}
 
 
