package decorator;

public class Tomato extends Topping {

	Pizza pizza;
	Tomato(Pizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public String getName() {
		return pizza.getName() + " + tomato";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 3.50;
	}

}
