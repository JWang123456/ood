package observer;

import java.util.ArrayList;
import java.util.Iterator;

public class CricketData implements Subject {
	
	int data = 3000;
	
	ArrayList<Observer> observerlist;
	
	CricketData(){
		observerlist = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observerlist.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		observerlist.remove(o);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observerlist.iterator();
		while(it.hasNext()){
			Observer o = it.next();
			o.update(data);
			o.display();
		}
	}
	
	
}
