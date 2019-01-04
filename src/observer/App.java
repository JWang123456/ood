package observer;

import java.util.ArrayList;

public class App {

	private static ArrayList<Observer> instant(){
		
		Observer ob = new DataDisplay();
		Observer ob2 = new DataDisplay2();
		
		ArrayList<Observer> list = new ArrayList<>();
		
		list.add(ob);
		list.add(ob2);
		
		return list;
	}
	
	public static void main(String[] args) {
		Subject sub = new CricketData();
		
		ArrayList<Observer> l= instant();
		
		for(Observer ob : l){
			sub.registerObserver(ob);
		}
		
		sub.notifyObservers();
		
//		System.out.println("-----------------");
//		
//		sub.unregisterObserver(l.get(1));
//		
//		sub.notifyObservers();
//		
	}

}
