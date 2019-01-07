package command;

public class TurnOffTV extends Command {

	TV tv;
	
	public TurnOffTV(TV tv){
		this.tv = tv;
	}
	
	@Override
	public void excute() {
		tv.disconnect();
		tv.off();		
	}

}
