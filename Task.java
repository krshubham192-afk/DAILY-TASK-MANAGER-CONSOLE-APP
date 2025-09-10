import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(String title, LocalDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getTitle() { return title; }
    public LocalDate getDueDate() { return dueDate; }
    public boolean isCompleted() { return isCompleted; }

    public void markCompleted() { this.isCompleted = true; }

    @Override
    public String toString() {
        return (isCompleted ? "[✓] " : "[ ] ") + title + " (Due: " + dueDate + ")";
    }

    public String toFileString() {
        return title + "|" + dueDate + "|" + isCompleted;
    }

    public static Task fromFileString(String line) {
        String[] parts = line.split("\\|");
        Task task = new Task(parts[0], LocalDate.parse(parts[1]));
        if (Boolean.parseBoolean(parts[2])) task.markCompleted();
        return task;
    }
}
