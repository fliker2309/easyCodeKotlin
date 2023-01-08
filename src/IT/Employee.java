package IT;

public abstract class Employee {

    private final String name;

    private final TaskProgressCallback callback;

    private final Task.Status taskStatus;

    protected Employee(String name, TaskProgressCallback callback, Task.Status taskStatus) {
        this.name = name;
        this.callback = callback;
        this.taskStatus = taskStatus;
    }

    public void toTask(Task task){}
}
