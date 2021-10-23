import java.util.Random;

public class Dice
{
    private int number_showing;
    Dice()
    {
        roll();
    }
    public void roll()
    {
        Random rand=new Random();
        number_showing=rand.nextInt(2)+1;
    }
}
