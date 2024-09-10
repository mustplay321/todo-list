/********************************
 * Simple To-do list application
 * 
 * Kaden Christie
 * Created: 9/8/24
 * Updated: 9/9/24
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

        currentTasks.add(this);

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
                for (int i = 0; i < currentTasks.size(); i++) {
                    println("Current Tasks: " + currentTasks.get(i).taskName);
                }
            }
            else {
                println("There are currently no tasks on your list. Add some!");
            }
            Task.Navigation();
            break;
            case 2:
            //add task to list
            
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

        //Task testTask1 = new Task("Math Homework", "Do Math Homework", "Tuesday");
        //Task testTask2 = new Task("Math Homework", "Do Math Homework", "Tuesday");
        //Task testTask3 = new Task("Math Homework", "Do Math Homework", "Tuesday");
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
