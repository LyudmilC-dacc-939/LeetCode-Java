package observer_design_pattern;

public class Event {
    private final String message;

    public Event(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

//public class Event {
//    private Publisher publisher;
//
//    public Event() {
//        publisher.notify(this);
//    }
//}
