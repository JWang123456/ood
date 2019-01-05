package strategy;

public abstract class Fighter {
	Kicks kicks;
	Jumps jumps;
	
	Fighter(Kicks kicks, Jumps jumps){
		this.kicks = kicks;
		this.jumps = jumps;
	}
	
	public void setKick(Kicks kicks){
		this.kicks = kicks;
	}
	
	public void setJump(Jumps jumps){
		this.jumps = jumps;
	}
	
	public void kick(){
		kicks.kick();
	}
	
	public void jump(){
		jumps.jump();
	}
	
	public void punch(){
		System.out.println("stantard punch");
	}
	
	public void roll(){
		System.out.println("stantard roll");
	}
	
	public abstract void display();
}
