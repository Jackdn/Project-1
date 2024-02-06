import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Please choose an option:\n" +
                "(1) Add a task.\n" +
                "(2) Remove a task.\n" +
                "(3) Update a task.\n" +
                "(4) List all tasks.\n" +
                "(0) Exit.");
        String userInput=input.nextLine();
        ArrayList<String> tasks = new ArrayList<String>();
        while(!(userInput.equals("0"))){
            if (userInput.equals("1")){
               addTask(tasks);

            }
            if (userInput.equals("2")){
                removeTask(tasks);

            }
            if (userInput.equals("3")){
                updateTask(tasks);
            }
            if (userInput.equals("4")){
                System.out.println("Here is a list of all the tasks.");
                System.out.println(tasks);

            }
            System.out.println("Please select a different option:\n" +
                    "(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List all tasks.\n" +
                    "(0) Exit.");
            userInput=input.nextLine();

        }

    }
    static ArrayList<String> addTask(ArrayList a){
        Scanner input= new Scanner(System.in);
        System.out.println("Please add a task.");
        a.add(input.nextLine());
        return a;
    }
    static ArrayList<String> removeTask(ArrayList b){
        Scanner input= new Scanner(System.in);
        System.out.println(b);
        System.out.println("Please type a number to the task you would like to remove.");
        String taskNumb = (input.nextLine());
        int taskindex= parseInt(taskNumb) -1;
        b.remove(taskindex);
        return b;
    }
    static ArrayList<String> updateTask(ArrayList c){
        Scanner input= new Scanner(System.in);
        System.out.println(c);
        System.out.println("Please type a number to the task you would like to update.");
        String taskNumb = (input.nextLine());
        int taskindex= parseInt(taskNumb) -1;
        c.remove(taskindex);
        System.out.println("Please update the task.");
        c.add(input.nextLine());
        return c;
    }
}