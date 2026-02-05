// Eduardo Aguilera
// CS145
// 1/27/26
// Assignment 5
// there is no such things as a Pokemon, they have a species, so this is abstract and a pokemon object
// Cannot be made, only extensions
public abstract class Pokemon {
    private String species;
    private String name; // name is determined by user
    private String type; // type is determined based on species
    private int lvl; // random int with limits (1-10)
    public Pokemon(String name) {
        this.name = name;
    }
    public Pokemon(String name, String type, int lvl) { // not sure if this constructor would ever be used
        this.name = name;
        this.type = type;
        this.lvl = lvl;
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