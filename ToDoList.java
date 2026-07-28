import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {

        // Create our dynamic ArrayList
        // The <String> part tells Java that this list will ONLY hold text.

        ArrayList<String> tasks = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("---Welcome to your To-Do App---");

        while (isRunning) {
            System.out.println("\nOptions: [1] View tasks  [2] Add Task  [3] Remove Task  [4]Exit");
            System.out.println("Choose an option: ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.println("\n-- Your Tasks ---");

                if (tasks.size() == 0) {
                    System.out.println("Your list is empty! Enjoy your day.");
                } else {
                    for (int i=0; i<tasks.size(); i++) {
                        System.out.println((i+1) + ". " + tasks.get(i));
                    }
                }
            }

            else if (choice.equals("2")) {
                System.out.println("Enter your new task: ");
                String newTask = input.nextLine();

                tasks.add(newTask);
                System.out.println("Task added!");
            }

            else if (choice.equals("3")) {
                System.out.print("Enter the task NUMBER to remove: ");
                int taskNumber = Integer.parseInt(input.nextLine());

                if(taskNumber > 0 && taskNumber <= tasks.size()) {
                    tasks.remove(taskNumber - 1);
                    System.out.println("Task removed!");
                } else {
                    System.out.println("Invalid task number.");
                }
            }

            else if (choice.equals("4")) {
                System.out.println("Saving your list... Goodbye!");
                isRunning = false;
            }

            else {
                System.out.println("Please choose 1, 2, 3, or 4.");
            }
        }

        input.close();
    }
}
