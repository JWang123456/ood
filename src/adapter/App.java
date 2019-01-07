package adapter;

public class App {

	public static void main(String[] args) {

		Bird sparrow = new Sparrow();
		Duck toyDuck = new ToyDuck();
		
//		sparrow.makeSound();
		toyDuck.squeak();
		
		BirdAdapter fakeDuck = new BirdAdapter(sparrow);
		
		fakeDuck.squeak();

	}

}
