package IT;

import java.util.List;

public class TaskColumn implements Observable {
    private final Task.Status status;
    private final List<Observer> observers;
    private final List<Task> tasks;

    public TaskColumn(
            Task.Status status,
            List<Observer> observers,
            List<Task> tasks) {
        this.status = status;
        this.observers = observers;
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public boolean contains(Task.Status status) {
        return this.status == status;
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleTast(tasks.get(0));
        }
    }
}
