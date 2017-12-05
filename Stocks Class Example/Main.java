public class Main {
	public static void main(String[] args)
	{
		
		//Create new Stocks
		Stock a = new Stock("A","a");	
		Stock b = new Stock("B", "b");
		Stock c = new Stock("C", "c");
		
		
		//Reassign values
		a.currentPrice = 1;	
		b.currentPrice = 6;
		c.currentPrice = 7;
		a.previousClosingPrice = 2;		
		b.previousClosingPrice = 3;
		c.previousClosingPrice = 4;
		
		//Print results
		System.out.println("The best is "+ getBestPerformance(a,b,c));	
		System.out.println("The worst is "+ getWorstPerformance(a,b,c));
	}
	
	//Do work to getBestPerformance
	public static Stock getBestPerformance(Stock... stocks)
	{
		Stock best = stocks[0];
		double highest = 0;
		
		for(Stock s : stocks)
		{
			double cp = s.getChangePercent();
			if(cp >= highest) {
				highest = cp;
				best = s;
			}
			
			
		}
		return best;
	}
	
	//Do work to getWorstPerformance
	public static Stock getWorstPerformance(Stock... stocks)
	{
		Stock worst = stocks[0];
		double lowest = 0;
		
		for(Stock s : stocks)
		{
			double cp = s.getChangePercent();
			if(cp <= lowest)
			{
				lowest = cp;
				worst = s;
			}
		}
		return worst;
	}
	
}