
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Part01.
        // Create a class called TodoList. It should have a constructor without parameters and the following methods:
        // public void add(String task) - add the task passed as a parameter to the todo list.
        // public void print() - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
        // public void remove(int number) - removes the task associated with the given number; the number is the one seen associated with the task in the print.

        // Part02.
        // Next, implement a class called UserInterface.
        // The command stop stops the execution of the loop, after which the execution of the program advances out of the start method.
        // The command add asks the user for the next task to be added. Once the user enters this task, it should be added to the to-do list.
        // The commmand list prints all the tasks on the to-do list.
        // The command remove asks the user to enter the id of the task to be removed. When this has been entered, the specified task should be removed from the list of tasks.
        
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }
}
