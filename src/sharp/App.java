package sharp;

public class App {

	public static void main(String[] args) {
		Sharp c = new Circle();
		Sharp r = new Rectangle();
		
//		Singleton sin = Singleton.getInstance();
//		Singleton sin2 = Singleton.getInstance();
		
		Singleton sin = new Singleton();
		Singleton sin2 = new Singleton();
		
		System.out.println(sin == sin2);
		
		c.draw();
		r.draw();
	}

}
