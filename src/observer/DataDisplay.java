package observer;

public class DataDisplay implements Observer {

	private int mydata;
	
	public DataDisplay() {
		
	}
	
	@Override
	public void update(int data) {
		this.mydata = data;
	}
	
	@Override
	public void display(){
		System.out.println(mydata);
	}

	

}
