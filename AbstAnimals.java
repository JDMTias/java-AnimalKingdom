package jAnimalKingdom;

abstract class AbstAnimals {

    protected int food;
    protected int id;
    protected static int maxId = 0;

    public AbstAnimals() {
        maxId++;
        id = maxId;
        food = 25;
    }

    abstract String getName();

    // abstract int getId();

    abstract int getYD();

    abstract String move();

    abstract String breath();

    abstract String reproduce();

    int getId() {
        return id;
    }

    void eatFood(int i) {
        food = food - i;
    }

    int getFoodLvl() {
        return food;
    }

}