// Eduardo Aguilera
// CS145
// 2/3/26
// Assignment 5
// there is no such things as just a Pokemon, they have a species
// so this is abstract and a pokemon object can not be made, only extensions
import java.security.SecureRandom;
public abstract class Pokemon {
    private String species; // species is determined by the subclass
    private String type; // type is determined based on species
    private String name; // name is determined by user
    private static final SecureRandom randomNumbers = new SecureRandom(); // created to determine level
    private int lvl = randomNumbers.nextInt(10) + 1; // lvl is random integer (1-10)
    public Pokemon(String species, String type) {
        this.species = species;
        this.type = species;
    }
    public Pokemon(String species, String type, String name) {
        this.species = species;
        this.type = species;
        this.name = name;
    }
    public void setSpecies(String species) {
        this.species = species;
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
    public abstract void attack();
    public abstract void sound();
}