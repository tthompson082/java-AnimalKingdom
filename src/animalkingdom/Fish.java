package animalkingdom;

public class Fish extends AbstractAnimals
{
    public Fish(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String getMove()
    {
        return "Swim";
    }

    @Override
    public String getBreath()
    {
        return "Gills";
    }

    @Override
    public String getReproduce()
    {
        return "Eggs";
    }

    @Override
    public String toString()
    {
        return "Fish {" + " name = " + getName() + ", year discovered = " + getYearDiscovered() + " }" + "\n";
    }
}