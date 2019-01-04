package decorator;

public class Barbeque extends Topping {

	Pizza pizza;
	
	Barbeque(Pizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public String getName() {
		return pizza.getName() + " + barbeque";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 5.50;
	}
	

}
