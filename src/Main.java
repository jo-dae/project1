import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("please make a selection:");
        System.out.println("(1)add a task");
        System.out.println("(2)remove a task");
        System.out.println("(3)update a task");
        System.out.println("(4)list all tasks");
        System.out.println("(0)exit");

        int userInput = input.nextInt();
        if (userInput == 1){
            addTask();

            if (userInput == 0);
            System.exit(0);
        }

        String selection = input.nextLine();

        System.out.println(selection);
    }
    static void addTask(){
        System.out.println("what task would you like to add");
        String task = input.nextLine();
    }

}