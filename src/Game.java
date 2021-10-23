public class Game
{

    private Player player;
    private int floor=-1;
    Game(Player player,int floor)
    {
        this.player=player;
        this.floor=floor;
//        if(floor==2)
//        {
//            elevator();
//        }
//        else if(floor==5)
//        {
//            normal_snake();
//        }
//        else if(floor==8)
//        {
//            ladder();
//        }
//        else if(floor==11)
//        {
//            cobra_snake();
//        }
//        else
//        {
//
//        }

    }
    public int getFloor() {
        return floor;
    }
    public void normal_snake(int points)
    {
        player.setFloor(this.floor);
        player.setPoints(points);
    }
    public void cobra_snake(int points)
    {
        player.setFloor(this.floor);
        player.setPoints(points);

    }
    public void elevator(int points)
    {
        player.setFloor(this.floor);
        player.setPoints(points);

    }
    public void ladder(int points)
    {
        player.setFloor(this.floor);
        player.setPoints(points);
    }
}
