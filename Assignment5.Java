// Eduardo Aguilera
// CS145
// Demonstrate understanding of abstract class
// Pokemon abstract class created, extensions of it can be made, user interacts with the objects
// extended from it
import java.util.Scanner;
public class Assignment5 {
    public static Scanner input = new Scanner(System.in);  // Create a Scanner object
    public static void main(String[] args) {
        // store caught Pokemon here, store as Pokemon or Cubone object?
        // maybe create menu to select pokemon that the user wants to throw a pokeball at
        System.out.println("You caught a Cubone Pokemon!");
        System.out.println("What would you like to name it?");
        String name = input.nextLine();
        Cubone cubone = new Cubone(name);
        System.out.printf("Level %d %s has been added to your party!%n", cubone.getLvl(), cubone.getName());
        cubone.attack();
        cubone.sound();

        // user can make caught pokmeon do an action via a menu
    }
}