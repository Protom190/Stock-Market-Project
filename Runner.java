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
		System.out.println("The goal of the game is to beat the stock-trading robot by making a larger profit than the robot");
		
		for(turns=0;turns<10;turns++)
		{
		System.out.println("New turn, Turn #: "+turns);
		System.out.println("Yahoo Price: "+game.getYahooPrice()+" Google Price: "+game.getGooglePrice()+" Apple Price: "+game.getApplePrice()+" Disney Price: "+game.getDisneyPrice());
		System.out.println("Computer Profit: "+(robot.getCash()-500)+"\t Player Profit "+(user.getCash()-500));
		System.out.println("Enter action, format: Sell 5 Yahoo (Action, Number Of Stocks, Name of Stock)");
		System.out.println("Once done the turn, enter: 'done'");
		Scanner input=new Scanner(System.in);
		action=input.nextLine();
		boolean keepGoing=true;
		System.out.println("");
		while(keepGoing&&(action.indexOf("done")==-1))
		{
		System.out.println("");
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
		
		}
		}
		if(((turns!=8)||(turns!=10))&&(turns%2==0))
			game.pickRandomEvent();
		}
	
		//The computer's turn
		
		
	}

 
 
 
 
 
