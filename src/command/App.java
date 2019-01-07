package command;

public class App {

	public static void main(String[] args) {
		Command command = new TurnOnTV(new TV());
		
		Remoter remoter = new Remoter(command);
		
		remoter.excute();
		
		Command anothercommand = new TurnOffTV(new TV());
		
		remoter.setRemoter(anothercommand);
		
		remoter.excute();
		
		remoter.setRemoter(new TurnOnLight(new Light()));
		
		remoter.excute();

	}

}
