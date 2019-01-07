package command;

public class Remoter {
	Command command;
	
	public Remoter(Command command){
		this.command = command;
	}
	
	public void setRemoter(Command command){
		this.command = command;
	}
	
	public void excute(){
		command.excute();
	}
}
