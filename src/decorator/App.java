package decorator;

public class App {

	public static void main(String[] args) {
		Pizza farm = new FarmHouse();
		Pizza farmPlus = new Barbeque(farm);
		System.out.println(farm.getName() + ": " + farm.getPrice());
		System.out.println(farmPlus.getName() + ": " + farmPlus.getPrice());
		
		Pizza chicken = new ChickenFiesta();
		Pizza chickenPlus = new Tomato(chicken);
		chickenPlus = new Barbeque(chickenPlus);
		
		System.out.println(chicken.getName() + ": " + chicken.getPrice());
		System.out.println(chickenPlus.getName() + ": " + chickenPlus.getPrice());
	}

}
