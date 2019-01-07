package adapter;

public class BirdAdapter implements Duck {

//	adapter make duck instant able to call bird method, or say behave like a bird	
	
	Bird sparrow;
	
	public BirdAdapter(Bird sparrow){
		this.sparrow = sparrow;
	}
	
	@Override
	public void squeak() {

		sparrow.makeSound();
		
	}

}
