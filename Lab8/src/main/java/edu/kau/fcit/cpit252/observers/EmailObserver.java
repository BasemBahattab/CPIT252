package edu.kau.fcit.cpit252.observers;

import edu.kau.fcit.cpit252.utils.SendEmail;

public class EmailObserver extends Observer {

    public EmailObserver(String recipient) {
        super.setRecipient(recipient);
    }

    @Override
    public void update(String message) {
        System.out.println("Email Observer :: @" + getRecipient() + " " + message);
        //Cannot implement SendEmail due to security issues
    }
}
