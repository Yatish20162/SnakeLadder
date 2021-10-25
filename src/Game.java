public class Game
{

    private Player player;
    private int floor=-1;
    Game(){}
    Game(Player player,int floor)
    {
        this.player=player;
        this.floor=floor;
        if(floor==2)
        {
            elevator(player.getPoints());return;
        }
        if(floor==5)
        {
            normal_snake(player.getPoints());return;
        }
        if(floor==8)
        {
            ladder(player.getPoints());return;
        }
        if(floor==9)
        {
            cobra_snake(player.getPoints());return;
        }
            empty_floor(player.getPoints());

    }
    public int getFloor() {
        return floor;
    }
    public void normal_snake(int points)
    {
        System.out.println("Players position is: " + player.getFloor());
        System.out.println(player.getName()+"Has Reached on snake floor");
        player.setFloor(1);
        player.setPoints(points-2);
        System.out.println("Total points is :" +player.getPoints());
        empty_floor(player.getPoints());


    }
    public void cobra_snake(int points)
    {
        System.out.println("Players position is: " + player.getFloor());
        System.out.println(player.getName()+"Has Reached on cobra floor");
        player.setFloor(3);
        player.setPoints(player.getPoints()-4);
        System.out.println("Total points is :" +player.getPoints());
        empty_floor(player.getPoints());


    }
    public void elevator(int points)
    {
        System.out.println("Players position is: " +player.getFloor());
        System.out.println(player.getName()+" Has Reached on Elevator floor");
        player.setFloor(10);
        player.setPoints(player.getPoints()+4);
        System.out.println("Total points is :" +player.getPoints());
        empty_floor(player.getPoints());

    }
    public void ladder(int points)
    {
        System.out.println("Players position is: " + player.getFloor());
        System.out.println(player.getName()+"Has Reached on Ladder floor");
        player.setFloor(12);
        player.setPoints(player.getPoints()+2);
        System.out.println("Total points is :" +player.getPoints());
        empty_floor(player.getPoints());


    }
    public void empty_floor(int points)
    {
        System.out.println("Players position is: " + player.getFloor());
        System.out.println(player.getName()+"Has Reached on Empty floor");

        player.setPoints(player.getPoints()+1);
        System.out.println("Total points is :" +player.getPoints());
    }
}
