package command;

public class TurnOnLight extends Command {

	Light light;
	public TurnOnLight(Light light){
		this.light = light;
	}
	
	@Override
	public void excute() {
		light.on();
	}

}
