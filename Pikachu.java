// Eduardo Aguilera
// CS145
// 2/3/26
// Assignment 5
// Pikachu class, represents a cubone species pokemon
public class Pikachu extends Pokemon {
    public Pikachu() { // contructs Pikachu with its certain attributes
        String species = "Pikachu";
        String type = "Electric";
        super(species, type);
    }
    public Pikachu(String name) { // constructs Pikachu with a name
        String species = "Pikachu";
        String type = "Electric";
        super(species, type, name);
    }
    public void attack() { // overrides abtract attack from pokemon class
        System.out.println("Zap!");
    }
    public void sound() { // overrides abtract sound from pokemon class
        System.out.println("Pika!");
    }
}
