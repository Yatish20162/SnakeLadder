import java.util.Scanner;

public class Main {
    Dice dice=new Dice();
    Player player=new Player("",0,0);
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=cin.nextLine();
    }
}
