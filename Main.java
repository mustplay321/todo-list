/********************************
 * Simple To-do list application
 * 
 * Kaden Christie
 * Created: 9/8/24
 * Updated: 9/8/24
 ********************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
class Task {
    String taskName;
    String taskDescription;
    String taskDueDate;

    public static void Navigation() {
        //Print navigation options to the console
        System.out.println("Hello! Where would you like to start today? " 
        + "\n1: View all current tasks " 
        + "\n2: Add a task to the list "
        + "\n3: Edit a task "
        + "\n4: Remove a task");

        //Store and respond to user input
        Scanner userNavigation = new Scanner(System.in);
        String userNav = userNavigation.nextLine();
        int convertedUserNav = Integer.parseInt(userNav);
        userNavigation.close();

        switch(convertedUserNav) {
            case 1:
            //System.out.println(currentTasks);
            break;
            case 2:
            //add task to list
            break;
            case 3:
            //edit task
            break;
            case 4:
            //remove task
        }
    }

    public Task(String taskName, String taskDescription, String taskDueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDueDate = taskDueDate;
    }


}

public class Main {
    static List<Task> currentTasks = new ArrayList<>();
    public static void main(String[] args){
        Task.Navigation();
        Task newTask = new Task("Math Homework", "Do Math Homework", "Tuesday");
        currentTasks.add(newTask);
        System.out.println(currentTasks);
    }
}
