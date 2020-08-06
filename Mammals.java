package jAnimalKingdom;

public class Mammals extends AbstAnimals {

    private String name;

    private int year;

    public Mammals(String name, int year) {

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
        return "Walk";
    }

    public String breath() {
        return "Lungs";
    }

    public String reproduce() {
        return "Live Births";
    }

    @Override 
    public String toString() {
        return "\nId: " + id + " Name: " + name + " Year Named: " + year;
    }
} 