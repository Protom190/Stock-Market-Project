import java.util.Scanner;
 
 
 
public class Runner
{
	public static void main(String[] args)
	{
		StockGame game=new StockGame();
		int turns=0;
		Computer robot=new Computer();
		Player user=new Player();
		String action="";
		System.out.println("The goal of the game is to beat the stock-trading robot by making a larger profit than the robot. You both have $50 dollars right now .You have 10 turns to win!");

		//Initializing Robots turn values which will be used after users turn
		int cash=(int)robot.getCash();
		int numberStocksYahoo=0;
		 int numberStocksGoogle=0;
		 int numberStocksDisney=0;
		 int numberStocksApple=0;
		 int yahooBoughtPrice=0;
		 int googleBoughtPrice=0;
		 int disneyBoughtPrice=0;
		 int appleBoughtPrice=0;
		 
		for(turns=0;turns<10;turns++)
		{
			//Random Event Controller at beginning of turn
			if(turns<10)
		{
				game.pickRandomEvent();
				//So that players can't buy or sell stocks worth 0  
				if(game.getYahooPrice()==0)
				{
				game.setYahooPrice(1);
				}
				if(game.getGooglePrice()==0)
				{
				game.setGooglePrice(1);
				}
				if(game.getApplePrice()==0)
				{
				game.setApplePrice(1);
				}
				if(game.getDisneyPrice()==0)
				{
				game.setDisneyPrice(1);
				}
				
				System.out.println("Your random event is "+game.getCurrentRandomEvent());
		}
		
		System.out.println("New turn, Turn #: "+turns);		
		System.out.println("Yahoo Price: "+game.getYahooPrice()+", Google Price: "+game.getGooglePrice()+", Apple Price: "+game.getApplePrice()+", Disney Price: "+game.getDisneyPrice());
		System.out.println("Computer Profit: "+(robot.getCash()-50)+"\t Player Profit: "+(user.getCash()-50)+"\t Player Cash @ BeginningTurn: "+user.getCash()+"\t \tComputer Cash @ BeginningTurn: "+robot.getCash());
		System.out.println("Enter action, format: Sell 5 Yahoo (Action, Number Of Stocks, Name of Stock)");
		System.out.println("Once done the turn, enter: 'done'");
		action="initial";
		boolean keepGoing=true;
		System.out.println(""); 
		while(keepGoing&&(action.indexOf("done")==-1))
		{	
		if(user.getCash()<=0)
		{
			System.out.println("You are out of Cash!. You must sell stocks or end the turn by typing done.");
		}
		Scanner input2=new Scanner(System.in);
		action=input2.nextLine();
		System.out.println("");
		if((action.indexOf("done")!=-1))
		{
			keepGoing=false;
		}
			if((action.indexOf("done")==-1))
		{
			keepGoing=true;
		}
		int numStocks=0;
		String nameStock="";
		if(action.indexOf("1")!=-1)
		{
			numStocks=1;
		}
		else if(action.indexOf("2")!=-1)
		{
			numStocks=2;
		}
		else if(action.indexOf("3")!=-1)
		{
			numStocks=3;
		}
		else if(action.indexOf("4")!=-1)
		{
			numStocks=4;
		}
		else 
		{
			numStocks=5;
		}
		
 
		if(action.indexOf("Yahoo")!=-1)
		{
			nameStock="Yahoo";
		}
		else if(action.indexOf("Google")!=-1)
		{
			nameStock="Google";
		}
		else if(action.indexOf("Apple")!=-1)
		{
			nameStock="Apple";
		}
		else if(action.indexOf("Disney")!=-1)
		{
			nameStock="Disney";
		}
		
 
		if((action.indexOf("sell")!=-1)|| (action.indexOf("Sell")!=-1))
		{
			user.sellStocks(numStocks, nameStock);
		}
		else if((action.indexOf("Buy")!=-1)||(action.indexOf("buy")!=-1))
		{
			user.buyStocks(numStocks,nameStock);
		}
		System.out.println("Current Player Cash "+ user.getCash());
		
		
		}
		//End of Humans Turn/while loop
		
		
		//The computer's turn after the while statement for the human player
				//Computer's strategy for making the most profit(the computer goes through algorithms calculating profit from each stock and then it chooses the most profitable option)
				
				 
	
				if(cash>0)
				 {
					//Creating Variables for Current game data and computer stock storage stats
					 int yahooPrice=game.getYahooPrice();
					 int googlePrice=game.getGooglePrice();
					 int disneyPrice=game.getDisneyPrice();
					 int applePrice=game.getApplePrice();
					 int numberStocks=3;
					 
					 
					 //Selling Stocks
					 System.out.println("Yahoo bought price" + yahooBoughtPrice);
					 
					 if(yahooPrice>yahooBoughtPrice && numberStocksYahoo>0)
					 {
						 robot.sellStocks(numberStocksYahoo, "Yahoo");
						 System.out.println("Computer sold "+numberStocks+" Of Yahoo");
					 }
					 if(googlePrice>googleBoughtPrice && numberStocksGoogle>0)
					 {
						 robot.sellStocks(numberStocksGoogle, "Google");
						 System.out.println("Computer sold "+numberStocks+" Of Google");
					 } 
					 if(disneyPrice>disneyBoughtPrice && numberStocksDisney>0)
					 {
						 robot.sellStocks(numberStocksDisney, "Disney");
						 System.out.println("Computer sold "+numberStocks+" Of Disney");
					 } 
					 if(applePrice>appleBoughtPrice && numberStocksApple>0 )
					 {
						 robot.sellStocks(numberStocksApple, "Apple");
						 System.out.println("Computer sold "+numberStocks+" Of Apple");
					 }
					 
					 //buying stocks
					 if(yahooPrice<=2)
					 {
						 yahooBoughtPrice=yahooPrice+2;
						 robot.buyStocks(numberStocks, "Yahoo");
						 numberStocksYahoo+=numberStocks;
						 System.out.println("Computer bought "+numberStocks+" Of Yahoo");
					 }
					 
					 
					 if(googlePrice<=2)
					 {
						 googleBoughtPrice=googlePrice+2;
						 robot.buyStocks(numberStocks, "Google");
						 numberStocksGoogle+=numberStocks;
						 System.out.println("Computer bought "+numberStocks+" Of Google");
					 } 
					 
					 if(disneyPrice<=2)
					 {
						 disneyBoughtPrice=disneyPrice+2;
						 robot.buyStocks(numberStocks, "Disney");
						 numberStocksDisney=numberStocks;
						 System.out.println("Computer bought "+numberStocks+" Of Disney");
					 } 
				
					 if(applePrice<=2)
					 {
						 appleBoughtPrice=disneyPrice+2;
						 robot.buyStocks(numberStocks, "Apple");
						 numberStocksApple+=numberStocks;
						 System.out.println("Computer bought "+numberStocks+" Of Apple");
					 } 
				 }
					
				 
				 else
				 {
					 System.out.println("The robot is out of Cash, next turn");
				 }
		 }
		int playerProfit=(int)user.getCash()-50;
		int robotProfit=(int)robot.getCash()-50;
		if(playerProfit>robotProfit)
		{
			System.out.println("Congratulation, you won!!!!. You beat the robot with a profit higher by: "+(playerProfit-robotProfit));	
		}
		else
		{
			System.out.println("Unfortunetely, the robot beat you! Your profit was lower by:  "+(robotProfit-playerProfit));	
		}
		
		
		
		
		
		
		
		
		}
	}
			
			
		
	
		
		
		
	
