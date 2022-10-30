package edu.kau.fcit.cpit252.subjects;

import edu.kau.fcit.cpit252.observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class MessageSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(String m) {
        for(Observer o : observers){
            o.update(m);
        }
    }

}
