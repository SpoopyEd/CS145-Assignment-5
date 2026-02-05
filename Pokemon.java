// Eduardo Aguilera
// CS145
// 1/27/26
// Assignment 5
// there is no such things as a Pokemon, they have a species, so this is abstract and a pokemon object
// Cannot be made, only extensions
public abstract class Pokemon {
    private String species; // maybe final
    private String name;
    private String type;
    private int lvl;
    public Pokemon() {

    }
    public Pokemon(String name, String type, int lvl) {
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