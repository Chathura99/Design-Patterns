import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

class ConcreteObserverA implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer A received: " + message);
    }
}

class ConcreteObserverB implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer B received: " + message);
    }
}

class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        subject.attach(observerA);
        subject.attach(observerB);

        subject.notifyObservers("Hello World!");
    }
}
