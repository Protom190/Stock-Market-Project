public class Player extends StockGame
	{
		private int cash;
		
		
		public Player()
		{
			cash=50;
		}
		
		public void buyStocks(int numstocks,String stockName)
		{
			if(stockName.equals("Yahoo"))
			{
			cash=cash-(numstocks*getYahooPrice());// The problme is right here with the calling of getYahooPrice which calls a bad value. Player and computer can extend StocKGame because in Runner they have differnt intitialized Objects.class Must find a way to call Yahoo price
			
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


