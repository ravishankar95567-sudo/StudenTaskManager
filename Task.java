package app;

public class Task {
    private int id;
    private String title;
    private String subject;
    private String deadline;
    private String priority;
    private boolean completed;

    public Task(int id, String title, String subject, String deadline, String priority) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.deadline = deadline;
        this.priority = priority;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Title: " + title +
                " | Subject: " + subject +
                " | Deadline: " + deadline +
                " | Priority: " + priority +
                " | Status: " + (completed ? "Completed" : "Pending");
    }
}