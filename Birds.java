package jAnimalKingdom;

public class Birds extends AbstAnimals {

    private String name;

    private int year;

    public Birds(String name, int year) {

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
        return "Fly";
    }

    public String breath() {
        return "Lungs";
    }

    public String reproduce() {
        return "Eggs";
    }

    @Override 
    public String toString() {
        return "\nId: " + id + " Name: " + name + " Year Named: " + year;
    }
}