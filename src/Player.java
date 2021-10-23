public class Player
{
    private String name;
    private int points;
    private int floor;
    Player(String name,int pts,int floor)
    {
        this.name=name;
        this.floor=floor;
        this.points=pts;
    }

    public String getName() {
        return name;
    }

    public int getFloor() {
        return floor;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
