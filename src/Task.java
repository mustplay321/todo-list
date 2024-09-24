
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * 
 */

class Task {

  String taskName;
  String taskDueDate;
    
  static Scanner userNavigation = new Scanner(System.in);

  static List<Task> currentTasks = new ArrayList<>();

  public Task(String taskName, String taskDueDate) {

    this.taskName = taskName;
    this.taskDueDate = taskDueDate;

  }

  public static void navigation() {

    //Print navigation options to the console
    println("Hello! Where would you like to start today? " 
        + "\n1: View all current tasks " 
        + "\n2: Add a task to the list "
        + "\n3: Edit a task "
        + "\n4: Remove a task");

    //Store and respond to user input
    //Scanner newTaskInput = new Scanner(System.in);
    Scanner userInput = new Scanner(System.in);
    String userNav = userInput.nextLine();
    int convertedUserNav = Integer.parseInt(userNav);

    switch (convertedUserNav) {
      case 1:
        //Print current tasks list
        if (currentTasks.isEmpty() == false) {
          println("Current Tasks: "); 
          for (int i = 0; i < currentTasks.size(); i++) {
            println(currentTasks.get(i).taskName + " Due: " + currentTasks.get(i).taskDueDate);
          }
        } else {
          println("There are currently no tasks on your list. Add some!");
        }
        Task.cont();
        break;
      case 2:
        //add task to list
        println("Enter the tasks name: ");
        String newTaskName = userInput.nextLine();
        println("Enter the Due Date: ");
        String newTaskDueDate = userInput.nextLine();
        Task newTask = new Task(newTaskName, newTaskDueDate);
        currentTasks.add(newTask);
        Task.cont();
        break;
      case 3:
        //edit task
        break;
      case 4:
        //remove task
        println("Please enter the name of the task you would like to remove: ");
        String removedTask = userInput.nextLine();
        for (int count = 0; count < currentTasks.size(); count++) {
          String tempTask = currentTasks.get(count).taskName;
          if (removedTask.equals(tempTask)) {
            currentTasks.remove(count);
          } 
        }
        Task.cont();
        break;
      default:
        println("Invalid Input");
        Task.cont();
    }
  }

  //Acts as a buffer between a user's action and the return to the navigation screen
  public static void cont() {
    println("Return to Navigation? y/n: ");
    String cont = userNavigation.nextLine();
    if (cont.equals("y")) {
      Task.navigation();
    } else if (cont.equals("n")) {
      System.exit(0);
    } else {
      println("Invalid Entry");
      Task.cont();
    }
  }



  //Print methods
  public static void println(String string) {
    System.out.println(string);
  }

  public static void print(String string) {
    System.out.print(string);
  }
}