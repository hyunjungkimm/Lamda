package refactoring.designPattern.observer;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObserver(String tweet);
}
