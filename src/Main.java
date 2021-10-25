import java.util.Scanner;

public class Main extends Game {
     Dice dice;
     Player player=new Player("",0,0);

     int dice_roll=0;
    boolean start=false;
    boolean end=false;
    public static void main(String[] args)
    {
        Main main=new Main();
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=cin.nextLine();

        // name is set
        main.set_name(name);
         // checking to get first
        while(!main.start) {
            System.out.println("Hit Enter to roll the Dice");
            String enter = cin.nextLine();
            if (enter.equals("")) {
                if (!main.get_number()) {
                    System.out.println("Game Cannot Start Until you get one");
                }
                else
                    System.out.println("Game started");
            }
        }

        while (main.start && !main.end)
        {
            System.out.println("Hit Enter to roll the Dice");
            String enter = cin.nextLine();
            if (enter.equals("")) {
                main.get_output(name);
            }
            System.out.println("");
        }

        if(main.end)
        {
            System.out.println();
            System.out.println();
            System.out.println("GAME OVER");
            System.out.println(name + " accumulated " + main.player.getPoints());
        }
    }
    public void set_name(String name)
    {
        player.setName(name);
    }
    public boolean get_number()
    {
        dice=new Dice();
        dice_roll=dice.getNumber_showing();
        System.out.println("Dice Gave : "+dice_roll);
        if(dice_roll==1){start=true;return true;}
        return false;

    }

    public void get_output(String name)
    {
        dice=new Dice();
        dice_roll=dice.getNumber_showing();
        System.out.println("Dice Gave : "+dice_roll);
        int x=player.getFloor();
        if(x+dice_roll>13){return;}
        if(x+dice_roll==13){end=true;}
        player.setFloor(x+dice_roll);
//        System.out.println("Player floor :" + player.getFloor());
        x= player.getFloor();
        new Game(player,x);

    }


}
