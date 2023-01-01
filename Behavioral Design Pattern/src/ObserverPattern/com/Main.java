package ObserverPattern.com;

public class Main {
    public static void main(String[] args) {
        Channel pelligent = new Channel();
        Subscriber s1 = new Subscriber("Hrishi");
        Subscriber s2 = new Subscriber("Vishal");
        Subscriber s3 = new Subscriber("Ashish");
        Subscriber s4 = new Subscriber("Bhavesh");
        Subscriber s5 = new Subscriber("Ketan");

        pelligent.subscribe(s1);
        pelligent.subscribe(s2);
        pelligent.subscribe(s3);
        pelligent.subscribe(s4);
        pelligent.subscribe(s5);

        pelligent.unSubscribe(s1);
        pelligent.unSubscribe(s2);

        s1.subscribeChannel(pelligent);
        s2.subscribeChannel(pelligent);
        s3.subscribeChannel(pelligent);
        s4.subscribeChannel(pelligent);
        s5.subscribeChannel(pelligent);

        pelligent.upload("Observer Design Pattern Tutorial..");
    }
}