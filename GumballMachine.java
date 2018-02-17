
public class GumballMachine
{
	
	private int num_gumballs;       
    private int cost;   
    private int total;
    private boolean accept_all;

    public GumballMachine(int size, int cost, boolean accept_all )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.cost = cost;
        this.total = 0;
        this.accept_all = accept_all;
    }

    public void insertCoin(int coin)
    {
        if (coin != 25 && coin != 5 && coin != 10) {
        	System.out.println("Wrong coin!");
        }
        else if (coin == 25) {
        	this.total += 25;
        }
        else if (!accept_all) {
        	System.out.println("Quarters only!");
        }
        else {
        	this.total += coin;
        }
    }
    
    public void turnCrank()
    {
    	if ( this.total >= this.cost )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs--;
    			this.total -= this.cost;
    			System.out.println( "Thanks for your money.  Gumball Ejected!\n" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert more coins." ) ;
    	}        
    }
}

