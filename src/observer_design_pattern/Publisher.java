package observer_design_pattern;

import java.util.List;

import java.util.ArrayList;


public class Publisher {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }


    public void notify(Event event) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(event);
        }
    }
}

//    public void notify(Event event) {
//        for (Subscriber subscriber : subscribers) {
//            if (subscriber.getSubscribed().contains(event)) {
//                System.out.println("Your subscription has recent activity: " + LocalDateTime.now());
//            }
//        }
//    }


