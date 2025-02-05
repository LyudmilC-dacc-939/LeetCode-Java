package observer_design_pattern;

public class ObserverDesignPattern {

    //2. Observer Design Pattern
    //Problem:
    //Implement an event subscription system using the Observer design pattern.
    //
    //Create a Publisher class that can notify Subscriber objects when a new event is published.
    //Implement methods subscribe(subscriber), unsubscribe(subscriber), and notify(event).

    public static void main(String[] args) {

        Publisher publisher = new Publisher();

        Subscriber user1 = new ConcreteSubscriber("Alice");
        Subscriber user2 = new ConcreteSubscriber("Bob");

        publisher.subscribe(user1);
        publisher.subscribe(user2);

        Event event1 = new Event("New blog post published!");
        publisher.notify(event1);

        publisher.unsubscribe(user2);

        Event event2 = new Event("Live stream starting now!");
        publisher.notify(event2);
    }
}
