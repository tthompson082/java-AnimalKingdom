package animalkingdom;

import java.util.*;

public class Main 
{
    public static void printAnimals(ArrayList<AbstractAnimals> animals, CheckAnimal tester)
    {
        for (AbstractAnimals a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a);
            }
        }
    }
    
    public static void main(String[] args)
    {
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<AbstractAnimals> animalList = new ArrayList<>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        // list animals in descending order by date named
        System.out.println("*** Animals in Descending Order by Date ***");
        animalList.sort((o1, o2) -> o2.getYearDiscovered() - o1.getYearDiscovered());
        animalList.forEach(a -> System.out.println(a));
        System.out.println();

        // list animals alphabetically
        System.out.println("*** Animals in Alphabetical Order ***");
        animalList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        animalList.forEach(a -> System.out.println(a));
        System.out.println();

        // list Animals by Movement
        System.out.println("*** Animals By Movement ***");
        animalList.sort((o1, o2) -> o1.getMove().compareToIgnoreCase(o2.getMove()));
        animalList.forEach(a -> System.out.println(a + " " + a.getMove()));
        System.out.println();

        // list animals that breath with lungs
        System.out.println("*** Animals with Lungs ***");

    }
}