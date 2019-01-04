package dependency;

import java.util.ArrayList;

public class Manager {

	private ArrayList<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee e){
		employees.add(e);
	}
	
	public void removeEmployee(Employee e){
		employees.remove(e);
	}
	
	public void displayEmployee(){
		System.out.println(employees);
	}
	
}
