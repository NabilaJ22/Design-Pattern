public class Flower
{
    public Flower(String color)
    {
        System.out.println("The Flower color.");
    }
 
public void bloom() 
  {
        System.out.println("The flower blooms.");
     }

     public String  name ;
     {
        System.out.println("The Flowers Name Rose.");

     }

    }

    // Rose class
    class Rose extends Flower 
    {
    public Rose(String color)
     {
        super(color);
    }

    public void prick () 
    {
        System.out.println("Be careful! The rose has thorns.");
    }

    }
     // Sunflower class
    class Sunflower extends Flower
    {
    public Sunflower(String color)

     {
        super(color);
    }
    public void followSun() 
    {
        System.out.println("The sunflower follows the sun's movement.");
    }
}


















        