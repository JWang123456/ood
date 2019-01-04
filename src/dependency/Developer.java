package dependency;

public class Developer extends Employee {

	@Override
	public void work() {
		System.out.println("Do some developing");
	}
	@Override
	public String toString(){
		return "Developer: " + name;
	}
}
