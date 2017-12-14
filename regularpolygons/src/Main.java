public class Main {
	public static void main(String[] args)
	{
		
		//Create new Stock(String symbol, String name, double currentPrice, double previousPrice)
		RegularPolygon a = new RegularPolygon();
		RegularPolygon b = new RegularPolygon(6, 4);
		RegularPolygon c = new RegularPolygon(10, 4, 5.6, 7.8);
		
		
		//Print results
		System.out.println("Polygon A - Area: "+ a.getArea() + " - Perimeter: "+ a.getPerimeter());	
		System.out.println("Polygon B - Area: "+ b.getArea() + " - Perimeter: "+ b.getPerimeter());
		System.out.println("Polygon C - Area: "+ c.getArea() + " - Perimeter: "+ c.getPerimeter());
	}
	
	
	
}