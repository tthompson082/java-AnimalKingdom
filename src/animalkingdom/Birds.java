package animalkingdom;

public class Birds extends AbstractAnimals
{
    public Birds(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String getMove()
    {
        return "Fly";
    }

    @Override
    public String getBreath()
    {
        return "Lungs";
    }

    @Override
    public String getReproduce()
    {
        return "Eggs";
    }

    @Override
    public String toString()
    {
        return "Bird {" + " name = " + getName() + ", year discovered = " + getYearDiscovered() + " }";
    }
}