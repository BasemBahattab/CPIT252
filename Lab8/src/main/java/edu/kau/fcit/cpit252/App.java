package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.observers.*;
import edu.kau.fcit.cpit252.subjects.*;

public class App 
{
    public static void main( String[] args )
    {
        Observer twObserver = new TwitterObserver("Basem_Bahattab");
        Observer fbObserver = new FacebookObserver("Basem_Bahattab");
        Observer emailObserver = new EmailObserver("bbahattab0004@stu.kau.edu.sa");
        Observer waObserver = new WhatsappObserver("966546685693");

        Subject s = new MessageSubject();

        s.subscribe(twObserver);
        s.subscribe(fbObserver);
        s.subscribe(emailObserver);

        s.notifyUpdate("The price has dropped from SAR 299.99 to SAR 249.99.");

        System.out.println("\nChange observers: unsubscribed email and subscribed Whatsapp\n");
        s.unsubscribe(emailObserver);
        s.subscribe(waObserver);

        s.notifyUpdate("The price has dropped from SAR 249.99 to SAR 199.99.");

    }
}
