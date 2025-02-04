package observer_design_pattern;

import java.util.List;

public class ConcreteSubscriber implements Subscriber {
    private final String username;

    public ConcreteSubscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(Event event) {
        System.out.println(username + " received event: " + event.getMessage());
    }
}

