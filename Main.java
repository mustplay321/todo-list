/********************************
 * Simple To-do list application
 * 
 * Kaden Christie
 * Created: 9/8/24
 * Updated: 9/10/24
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
    
    static Scanner userNavigation = new Scanner(System.in);

    static List<Task> currentTasks = new ArrayList<>();

    public Task(String taskName, String taskDescription, String taskDueDate) {

        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDueDate = taskDueDate;

    }

    public static void Navigation() {

        //Print navigation options to the console
        println("Hello! Where would you like to start today? " 
        + "\n1: View all current tasks " 
        + "\n2: Add a task to the list "
        + "\n3: Edit a task "
        + "\n4: Remove a task");

        //Store and respond to user input
        Scanner newTaskInput = new Scanner(System.in);
        Scanner userNavigation = new Scanner(System.in);
        String userNav = userNavigation.nextLine();
        int convertedUserNav = Integer.parseInt(userNav);

        switch(convertedUserNav) {
            case 1:
            //Print current tasks list
            if (currentTasks.size() > 0) {
                println("Current Tasks: "); 
                for (int i = 0; i < currentTasks.size(); i++) {
                    println(currentTasks.get(i).taskName);
                }
            }
            else {
                println("There are currently no tasks on your list. Add some!");
            }
            Task.Cont();
            break;
            case 2:
            //add task to list
            println("Enter the tasks name: ");
            String newTaskName = newTaskInput.nextLine();
            println("Enter a description: ");
            String newTaskDescription = newTaskInput.nextLine();
            println("Enter the Due Date: ");
            String newTaskDueDate = newTaskInput.nextLine();
            Task newTask = new Task(newTaskName, newTaskDescription, newTaskDueDate);
            currentTasks.add(newTask);
            Task.Cont();
            break;
            case 3:
            //edit task
            break;
            case 4:
            //remove task

        }
    }

    public static void Cont() {
        println("Return to Navigation? y/n: ");
        String cont = userNavigation.nextLine();
        if (cont.equals("y")) {
            Task.Navigation();
        }
        else if (cont.equals("n")) {
            System.exit(0);
        }
        else {
            println("Invalid Entry");
            Task.Cont();
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

public class Main {
    public static void main(String[] args){

        Task.Navigation();
        
    }



    //Print methods
    public static void println(String string) {
        System.out.println(string);
    }

    public static void print(String string) {
        System.out.print(string);
    }
}
