// Eduardo Aguilera
// CS145
// 1/27/26
// Assignment 5

public class Cubone extends Pokemon {
    public Cubone() {
        String species = "Cubone";
        String type = "Normal";
        super(species, type);
    }
    public Cubone(String name) { // constructs Cubone using parameters
        String species = "Cubone";
        String type = "Normal";
        super(species, type, name);
    }
    public void attack() { // overrides attack from animal class
        System.out.println("Wack!");
    }
    public void sound() { // overrides sound from animal class
        System.out.println("Cubone!");
    }
}
