package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int choice;

        do {
            System.out.println("\n===== Student Task Manager =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Mark Task Completed");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter Deadline: ");
                    String deadline = sc.nextLine();

                    System.out.print("Enter Priority (High/Medium/Low): ");
                    String priority = sc.nextLine();

                    manager.addTask(new Task(id, title, subject, deadline, priority));
                    break;

                case 2:
                    manager.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter Task ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Title: ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter New Subject: ");
                    String newSubject = sc.nextLine();

                    System.out.print("Enter New Deadline: ");
                    String newDeadline = sc.nextLine();

                    System.out.print("Enter New Priority: ");
                    String newPriority = sc.nextLine();

                    manager.updateTask(updateId, newTitle, newSubject, newDeadline, newPriority);
                    break;

                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = sc.nextInt();
                    manager.deleteTask(deleteId);
                    break;

                case 5:
                    System.out.print("Enter Task ID to mark completed: ");
                    int completeId = sc.nextInt();
                    manager.markCompleted(completeId);
                    break;

                case 6:
                    System.out.println("Exiting Student Task Manager...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}