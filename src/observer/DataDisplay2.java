package observer;

public class DataDisplay2 implements Observer {

	int mydata;
	
	public DataDisplay2() {
		
	}

	@Override
	public void update(int data) {
		this.mydata = data * 2;
	}

	public void display(){
		System.out.println(mydata);
	}
}
