package observer_design_pattern;

public class ObserverDesignPattern {

    //2. Observer Design Pattern
    //Problem:
    //Implement an event subscription system using the Observer design pattern.
    //
    //Create a Publisher class that can notify Subscriber objects when a new event is published.
    //Implement methods subscribe(subscriber), unsubscribe(subscriber), and notify(event).

    public static void main(String[] args) {
        ConcreteSubscriber concreteSubscriber1 = new ConcreteSubscriber();
        concreteSubscriber1.setUsername("Donna");

        ConcreteSubscriber concreteSubscriber2 = new ConcreteSubscriber();
        concreteSubscriber1.setUsername("Michael");

        ConcreteSubscriber concreteSubscriber3 = new ConcreteSubscriber();
        concreteSubscriber1.setUsername("wickey");

        Event event1 = new Event();
        Event event2 = new Event();

    }
}
