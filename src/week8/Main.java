package week8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SMS message = new SMS("ope", "Awesome stuff!");
        System.out.println(message.read());

        ArrayList<SMS> messages = new ArrayList<SMS>();
        messages.add(message);
        messages.add(new SMS("unknown number", "I hid the body."));

        for (SMS sms: messages) {
            System.out.println(sms.read());
        }
    }
}
