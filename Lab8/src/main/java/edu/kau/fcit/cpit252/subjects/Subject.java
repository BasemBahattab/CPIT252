package edu.kau.fcit.cpit252.subjects;

import edu.kau.fcit.cpit252.observers.Observer;


public interface Subject{
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notifyUpdate(String m);
}
