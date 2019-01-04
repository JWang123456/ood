package dependency;

public class App {

	public static void main(String[] args) {
		Manager Tom = new Manager();
		
		Employee dev = new Developer();
		Employee tes = new Tester();
		
		tes.setName("Bob");
		dev.setName("Jhon");
		
		Tom.addEmployee(dev);
		Tom.addEmployee(tes);
		
		Tom.displayEmployee();

	}

}
