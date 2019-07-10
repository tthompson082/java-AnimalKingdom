package animalkingdom;

import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        System.out.println(panda.getId());
        System.out.println(zebra.getId());
    }
}