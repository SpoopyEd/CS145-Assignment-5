// Eduardo Aguilera
// CS145
// 2/3/26
// Demonstrate understanding of abstract class
// Pokemon abstract class created, extensions of it can be made, user interacts with the objects
// extended from it
import java.util.Scanner;
public class Assignment5 {
    public static Scanner input = new Scanner(System.in);  // Create a Scanner object
    public static void main(String[] args) {
        int answer = 0; // answer variable for user
        // store caught Pokemon here, store as Pokemon or Cubone object?
        // maybe create menu to select pokemon that the user wants to throw a pokeball at
        Cubone cubone = new Cubone();
        System.out.printf("You caught a %s Pokemon!%n", cubone.getSpecies());
        System.out.println("What would you like to name it?");
        String name = input.nextLine();
        cubone.setName(name);
        System.out.printf("Level %d %s has been added to your party!%n", 
        cubone.getLvl(), cubone.getName());
        System.out.printf("What would you like to have %s do?%n1 to Attack, 2 to make a Sound%n",
        cubone.getName());
        try {
            answer = input.nextInt();
        } catch (Exception e) {
            System.out.println("Digit answer only, 1 to Attack, 2 to make a Sound");
        } finally {
            input.nextLine(); // clears input
        } switch (answer) {
            case 1:
                cubone.attack();
                break;
            case 2:
                cubone.sound();
                break;
            default:
                System.out.println("1 or 2 not given, try again");
                break;
        }
    }
}