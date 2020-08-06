package jAnimalKingdom;

import java.util.List;

import java.util.ArrayList;

public class Main {

    private static List<AbstAnimals> filterAnimal(List<AbstAnimals> animals, Filter target) {

        List<AbstAnimals> tempList = new ArrayList<>();

        for (AbstAnimals v : animals) {
            if (target.whatever(v)) {
                tempList.add(v);
            }
        }

        return tempList;
    }

    public static void main(String[] args) {
        // System.out.print("Its Alive!!!");
        // Mammals
        Mammals panda = new Mammals("Panda", 1869);
        System.out
                .println("Animal " + "Id: " + panda.getId() + " Name: " + panda.getName() + " Year: " + panda.getYD());

        Mammals zebra = new Mammals("Zebra", 1778);
        System.out
                .println("Animal " + "Id: " + zebra.getId() + " Name: " + zebra.getName() + " Year: " + zebra.getYD());

        Mammals koala = new Mammals("Koala", 1816);
        System.out
                .println("Animal " + "Id: " + koala.getId() + " Name: " + koala.getName() + " Year: " + koala.getYD());

        Mammals sloth = new Mammals("Sloth", 1804);
        System.out
                .println("Animal " + "Id: " + sloth.getId() + " Name: " + sloth.getName() + " Year: " + sloth.getYD());

        Mammals armadillo = new Mammals("Armadillo", 1758);
        System.out.println("Animal " + "Id: " + armadillo.getId() + " Name: " + armadillo.getName() + " Year: "
                + armadillo.getYD());

        Mammals racoon = new Mammals("Racoon", 1758);
        System.out.println(
                "Animal " + "Id: " + racoon.getId() + " Name: " + racoon.getName() + " Year: " + racoon.getYD());

        Mammals bigfoot = new Mammals("Bigfoot", 2021);
        System.out.println(
                "Animal " + "Id: " + bigfoot.getId() + " Name: " + bigfoot.getName() + " Year: " + bigfoot.getYD());

        // Birds
        System.out.println();
        Birds pigeon = new Birds("Pigeon", 1838);
        System.out.println(
                "Animal " + "Id: " + pigeon.getId() + " Name: " + pigeon.getName() + " Year: " + pigeon.getYD());

        Birds peacock = new Birds("Peacock", 1821);
        System.out.println(
                "Animal " + "Id: " + peacock.getId() + " Name: " + peacock.getName() + " Year: " + peacock.getYD());

        Birds toucan = new Birds("Toucan", 1758);
        System.out.println(
                "Animal " + "Id: " + toucan.getId() + " Name: " + toucan.getName() + " Year: " + toucan.getYD());

        Birds parrot = new Birds("Parrot", 1824);
        System.out.println(
                "Animal " + "Id: " + parrot.getId() + " Name: " + parrot.getName() + " Year: " + parrot.getYD());

        Birds swan = new Birds("Swan", 1758);
        System.out.println("Animal " + "Id: " + swan.getId() + " Name: " + swan.getName() + " Year: " + swan.getYD());

        // Fish
        System.out.println();
        Fish salmon = new Fish("Salmon", 1758);
        System.out.println(
                "Animal " + "Id: " + salmon.getId() + " Name: " + salmon.getName() + " Year: " + salmon.getYD());

        Fish catfish = new Fish("Catfish", 1817);
        System.out.println(
                "Animal " + "Id: " + catfish.getId() + " Name: " + catfish.getName() + " Year: " + catfish.getYD());

        Fish perch = new Fish("Perch", 1758);
        System.out
                .println("Animal " + "Id: " + perch.getId() + " Name: " + perch.getName() + " Year: " + perch.getYD());

        List<AbstAnimals> animalsList = new ArrayList<>();

        animalsList.add(panda);
        animalsList.add(zebra);
        animalsList.add(koala);
        animalsList.add(sloth);
        animalsList.add(armadillo);
        animalsList.add(racoon);
        animalsList.add(bigfoot);
        animalsList.add(pigeon);
        animalsList.add(peacock);
        animalsList.add(toucan);
        animalsList.add(parrot);
        animalsList.add(swan);
        animalsList.add(salmon);
        animalsList.add(catfish);
        animalsList.add(perch);

        // Checking to make sure List works
        System.out.println("\n\n***Animals List***");
        System.out.println();
        System.out.println("Animals: " + animalsList);

        // Descending Order List
        System.out.println("\n\n***Descending Order by Year***");
        animalsList.sort((a1, a2) -> a2.getYD() - (a1.getYD()));
        System.out.println();
        System.out.println("Animals: " + animalsList);

        // Alphabetical Order
        System.out.println("\n\n***Alphabetical Order***");
        animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println("Animals: " + animalsList);

        // Order of Movement
        System.out.println("\n***Movement Order***");
        animalsList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println("Animals: " + animalsList);

        // Animals with Lungs
        System.out.println("\n***Animals With Lungs***");
        List<AbstAnimals> filteredList = filterAnimal(animalsList, v -> v.breath() == "Lungs");
        filteredList.forEach((v) -> System.out.println(v));

        // Animals with Lungs and 1758
        System.out.println("\n***Animals With Lungs***");
        filteredList = filterAnimal(animalsList, v -> v.breath() == "Lungs" && v.getYD() == 1758);
        filteredList.forEach((v) -> System.out.println(v));

        // Animals with lungs and eggs
        System.out.println("\n***Animals With Lungs and Eggs***");
        filteredList = filterAnimal(animalsList, v -> v.breath() == "Lungs" && v.reproduce() == "Eggs");
        filteredList.forEach((v) -> System.out.println(v));

        // Animals Alphabetically on 1758
        System.out.println("\n***Animals Named in 1758 Alphabetically***");
        filteredList = filterAnimal(animalsList, v -> v.getYD() == 1758);
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach((v) -> System.out.println(v));
    }

}
