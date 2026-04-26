package app;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void updateTask(int id, String title, String subject, String deadline, String priority) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setTitle(title);
                task.setSubject(subject);
                task.setDeadline(deadline);
                task.setPriority(priority);
                System.out.println("Task updated successfully!");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                System.out.println("Task deleted successfully!");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void markCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                System.out.println("Task marked as completed!");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}