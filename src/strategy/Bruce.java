package strategy;

public class Bruce extends Fighter {

	Bruce(Kicks kicks, Jumps jumps) {
		super(kicks, jumps);
	}

	@Override
	public void display() {
		System.out.println("Brucc Lee");
	}

}
