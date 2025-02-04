package observer_design_pattern;

import java.util.List;

import java.util.ArrayList;


public class Publisher {
    private final List<ConcreteSubscriber> concreteSubscribers = new ArrayList<>();

    public void subscribe(ConcreteSubscriber concreteSubscriber) {
        concreteSubscribers.add(concreteSubscriber);
    }

    public void unsubscribe(ConcreteSubscriber concreteSubscriber) {
        concreteSubscribers.remove(concreteSubscriber);
    }


    public void notify(Event event) {
        for (ConcreteSubscriber concreteSubscriber : concreteSubscribers) {
            concreteSubscriber.update(event);
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


