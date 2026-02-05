// Eduardo Aguilera
// CS145
// 1/27/26
// Assignment 5

public class Cubone extends Pokemon {
    private final String species = "Cubone"; // Any cubone object will be the pokemon species cubone
    private final String type = "Normal"; // all cubone pokemon are normal type
    public Cubone(String name) { // constructs Cubone using parameters
        super(name);
    }
    public void attack() { // overrides attack from animal class
        System.out.println("Wack!");
    }
    public void sound() { // overrides sound from animal class
        System.out.println("Cubone!");
    }
}
