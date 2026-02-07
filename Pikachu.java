// Eduardo Aguilera
// CS145
// 2/3/26
// Assignment 5

public class Pikachu extends Pokemon {
    public Pikachu() {
        String species = "Pikachu";
        String type = "Electric";
        super(species, type);
    }
    public Pikachu(String name) { // constructs Pikachu using parameters
        String species = "Pikachu";
        String type = "Electric";
        super(species, type, name);
    }
    public void attack() { // overrides attack from animal class
        System.out.println("Zap!");
    }
    public void sound() { // overrides sound from animal class
        System.out.println("Pika!");
    }
}
