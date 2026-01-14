import java.util.*;

class TodoListApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully.");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    } else {
                        System.out.print("Enter task number to delete: ");
                        int index = sc.nextInt();

                        if (index < 1 || index > tasks.size()) {
                            System.out.println("Invalid task number.");
                        } else {
                            tasks.remove(index - 1);
                            System.out.println("Task deleted successfully.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting To-Do List. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}