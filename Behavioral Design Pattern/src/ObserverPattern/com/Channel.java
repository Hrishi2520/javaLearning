package ObserverPattern.com;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subs = new ArrayList<>();
    String title;

    public void subscribe(Subscriber sub) {
        subs.add(sub);
        System.out.println(sub + " is added as a new subscriber...\n");
    }
    public void unSubscribe(Subscriber sub) {
        subs.remove(sub);
        System.out.println(sub + " is removed as a subscriber...\n");
    }

    public void notifySubscriber() {
        for (Subscriber sub : subs) {
            sub.update();
        }
    }

    public void upload(String title) {
        this.title = title;
        notifySubscriber();
    }
}
