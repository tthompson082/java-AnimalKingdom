package animalkingdom;

public abstract class AbstractAnimals
{
    // fields
    private static int maxId = 0;
    private String name;
    private int yearDiscovered;

    // constructor
    public AbstractAnimals(String name, int yearDiscovered)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    // abstract methods
    public abstract String getMove();
    public abstract String getBreath();
    public abstract String getReproduce();

    // methods
    public String getEat()
    {
        return "This animal eats the same as the rest.";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered)
    {
        this.yearDiscovered = yearDiscovered;
    }
}