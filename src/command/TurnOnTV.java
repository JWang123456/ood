package command;

public class TurnOnTV extends Command {

	TV t;
	public TurnOnTV(TV t){
		this.t = t;
	}
	
	@Override
	public void excute() {
		t.on();
		t.connect();
	}

}
