import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the dice game.\nWhat is your name?");
        String playerName = myObj.nextLine();
        System.out.println("What is your threshold?");
        int threshold = myObj.nextInt();
        System.out.println("How many sides on the die? (Minimum of 4)");
        int sides = myObj.nextInt();
        if (sides < 4){
            System.out.println("That is too low");
        }
    }
}
