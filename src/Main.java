import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Hello, _______");
        System.out.println("Please enter your name: ");
        name = sc.nextLine();

        System.out.println("Welcome, " + name + " to my small java program!");
        System.out.println("I hope you enjoyed yourself!");
        System.out.println("GoodBye!");
    }
}