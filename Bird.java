// Eduardo Aguilera
// CS145
// 1/27/26
// Assignment 5

public class Bird extends Pokemon {
    private final int wings = 2;
    public Bird() { // constructs a bird with no parameters as a default
        super("Bird", null, 2);
    }
    public Bird(String name, String color, int legs) { // constructs bird using parameters
        super(name ,color, legs);
    }
    public int getWings() {
        return wings;
    }
    public void move() { // overrides move from animal class
        System.out.println("Flap flap"); // true for almost every bird
    }
    public void eat() { // overrides eat from animal class
        System.out.println("Peck peck");
    }
    public void sound() { // overrides sound from animal class
        System.out.println("Chirp Chirp");
    }
}
