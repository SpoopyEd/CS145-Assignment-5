// Eduardo Aguilera
// CS145
// 1/27/26
// Assignment 5
// there is no such things as a Pokemon, they have a species, so this is abstract and a pokemon object
// Cannot be made, only extensions
import java.security.SecureRandom;
public abstract class Pokemon {
    private String species;
    private String name; // name is determined by user
    private String type; // type is determined based on species
    private static final SecureRandom randomNumbers = new SecureRandom(); // created to determine level
    private int lvl = randomNumbers.nextInt(10); // lvl is random integer (1-10)
    public Pokemon(String name) {
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    public int getLvl() {
        return lvl;
    }
    public void attack() {

    }
    public void sound() {

    }
}