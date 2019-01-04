package dependency;

public abstract class Employee {
	
	protected String name;
	
	public abstract void work();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
