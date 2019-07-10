package animalkingdom;

public class Mammals extends AbstractAnimals
{
    public Mammals(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String getMove()
    {
        return "Walk";
    }

    @Override
    public String getBreath()
    {
        return "Lungs";
    }

    @Override
    public String getReproduce()
    {
        return "Live Birth";
    }

    @Override
    public String toString()
    {
        return "Mammal {" + " name = " + getName() + ", year discovered = " + getYearDiscovered() + " }";
    }
}