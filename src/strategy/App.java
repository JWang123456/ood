package strategy;

public class App {

	private static void print(Fighter fighter){
		fighter.display();
		fighter.punch();
		fighter.jump();
		fighter.kick();
	}
	
	public static void main(String[] args) {
		
		Kicks high = new HighKick();
		Jumps log = new LongJump();
		
		Fighter fighter = new Bruce(high, log);
		
		print(fighter);
		
		Jumps jump = new Jump();
		fighter.setJump(jump);
		
		print(fighter);

	}

}
