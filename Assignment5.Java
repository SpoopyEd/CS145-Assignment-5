// Eduardo Aguilera
// CS145
// 2/3/26
// Assignment 5
// Demonstrate understanding of abstract class
// Pokemon abstract class created, extensions of it can be made, user interacts with the objects
// extended from it
import java.util.Scanner;
public class Assignment5 {
    public static Scanner input = new Scanner(System.in);  // Create a Scanner object
    public static void main(String[] args) {
        String userIn; // stores user input
        Cubone cubone = new Cubone();
        System.out.printf("You caught a %s Pokemon!%n", cubone.getSpecies());
        System.out.println("What would you like to name it?");
        userIn = input.nextLine();
        cubone.setName(userIn);
        System.out.printf("Level %d %s has been added to your party!%n", 
        cubone.getLvl(), cubone.getSpecies());
        action(cubone);
        Pikachu pikachu = new Pikachu();
        System.out.printf("You caught a %s Pokemon!%n", pikachu.getSpecies());
        System.out.println("What would you like to name it?");
        userIn = input.nextLine();
        pikachu.setName(userIn);
        System.out.printf("Level %d %s has been added to your party!%n", 
        pikachu.getLvl(), pikachu.getSpecies());
        action(pikachu);
    }
    public static void action(Pokemon pokemon) { // prompts user for the pokemon to do an action
        int answer = 0; // answer variable for action choosen
        boolean tryLoop= true;
        while (tryLoop == true) { // keep trying until succesful, just like life
            System.out.printf("What would you like to have %s do?%n1 to Attack, 2 to make a Sound%n",
            pokemon.getName());
            try {
                answer = input.nextInt();
                switch (answer) {
                case 1:
                    pokemon.attack();
                    tryLoop = false;
                    break;
                case 2:
                    pokemon.sound();
                    tryLoop = false;
                    break;
                default:
                    System.out.println("1 or 2 not given, try again");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Digit answer only, 1 to Attack, 2 to make a Sound");
            } finally {
                input.nextLine(); // clears input
            }
        }
    }
}