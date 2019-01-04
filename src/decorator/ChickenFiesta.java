package decorator;

public class ChickenFiesta extends Pizza {

	private String name = "Chicken Fiesta";
	private double price = 15.00;
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public double getPrice() {
		return price;
	}
	
}
