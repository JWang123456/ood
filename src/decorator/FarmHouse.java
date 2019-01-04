package decorator;

public class FarmHouse extends Pizza {

	private String name = "Farm House";
	private double price = 10.00;
	
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public String getName() {
		return name;
	}

}
