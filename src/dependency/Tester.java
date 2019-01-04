package dependency;

public class Tester extends Employee {
	
	@Override
	public void work() {
		System.out.println("Do some testing");
		
	}
	@Override
	public String toString(){
		return "Tester: " + name;
	}
}
