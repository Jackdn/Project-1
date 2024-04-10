import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static Scanner input=new Scanner(System.in);
    public static  ArrayList<Task>tasks=new ArrayList<>();
    public static void main(String[] args){
        try{
        System.out.println("Please choose an option:\n" +
                "(1) Add a task.\n" +
                "(2) Remove a task.\n" +
                "(3) Update a task.\n" +
                "(4) List tasks by priority.\n" +
                "(5) List all tasks.\n" +
                "(0) Exit.");
        String userInput=input.nextLine();
        while(!(userInput.equals("0"))){
            boolean validInput=false;
            while(!validInput){
                switch (userInput){
                    case "1" ->{
                    addTask();
                    validInput=true;
                    }
                    case "2" ->{
                        removeTask();
                        validInput=true;
                    }
                    case "3" ->{
                        updateTask();
                        validInput=true;
                    }
                    case "4" ->{
                        listTasks();
                        validInput=true;
                    }
                    case "5" ->{
                        listAllTasks();
                        validInput=true;
                    }
                    default -> {
                        System.out.println("That is not a valid input, please try again");
                        userInput= input.nextLine();
                    }
                }
                }
            System.out.println("Please choose an option:\n" +
                    "(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List tasks by priority.\n" +
                    "(5) List all tasks.\n" +
                    "(0) Exit.");
            userInput=input.nextLine();
            }

        }catch (Exception e){
            System.out.println("Something went wrong. Please try running the code again.");
        }


    }
    static void addTask(){
        System.out.println("Please give the task a name.");
        String newTaskName=input.nextLine();

        System.out.println("Please give a description of a task.");
        String newTaskDescription=input.nextLine();

        System.out.println("Give this task a priority from 1-5, with 5 being the most important.");
        String newTaskPriority=input.nextLine();

        boolean validInput=false;
        while (!validInput){
            switch(newTaskPriority){
                case "1", "2", "3", "4", "5" ->validInput=true;
                default -> {
                    System.out.println("This is not a valid priority, please input a valid priority.");
                    newTaskPriority=input.nextLine();
                }
            }
        }
        Task newtask=new Task(newTaskName,newTaskDescription,newTaskPriority);
        tasks.add(newtask);
    }
    static void removeTask(){
        System.out.println("Please type a number to the task you would like to remove.");
        String taskNumb = input.nextLine();
        int taskindex= parseInt(taskNumb) -1;
        tasks.remove(taskindex);
    }
    static void updateTask(){
        System.out.println("Please type a number to the task you would like to update.");
        String taskNumb = input.nextLine();
        int taskindex= parseInt(taskNumb) -1;

        System.out.println("What is the title of the updated task?");
        String updatedTitle=input.nextLine();

        System.out.println("What is the description of the updated task?");
        String updateddescription=input.nextLine();

        System.out.println("What is the priority of the updated task?");
        String updatedPriority=(input.nextLine());

        Task updatedTask=new Task(updatedTitle,updateddescription,updatedPriority);
        tasks.set(taskindex, updatedTask);
    }
    static void listTasks(){
        Collections.sort(tasks);
        System.out.println("what priority would you like to list? (1-5)");
        String priority=input.nextLine();
        boolean validPriority=false;
        while(!validPriority){
            switch (priority){
                case "1","2","3","4","5" -> {
                    validPriority=true;
                    for(Task task:tasks){
                        if (task.getPriority()==(priority)){
                            System.out.println(task);
                        }
                    }
            }
                default -> System.out.println("that is not a valid priority level, please input a valid priority level.");
        }
    }
}
    static void listAllTasks(){
        Collections.sort(tasks);
        System.out.println(tasks);
    }
}