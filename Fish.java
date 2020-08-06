package jAnimalKingdom;

public class Fish extends AbstAnimals{
    private String name;

    private int year;

    public Fish(String name, int year) {

        this.name = name;

        this.year = year;

    }

    public String getName() {
        return name;
    }

    public int getYD() {
        return year;
    }

    public String move() {
        return "Swim";
    }

    public String breath() {
        return "Gills";
    }

    public String reproduce() {
        return "Eggs";
    }

    @Override 
    public String toString() {
        return "\nId: " + id + " Name: " + name + " Year Named: " + year;
    }
}