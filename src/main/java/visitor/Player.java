package visitor;

public class Player implements Employee {

    private int number;
    private String name;
    private String position;

    private Team team;


    public Player(int number, String name, String position, Team team) {
        this.number = number;
        this.name = name;
        this.position = position;
        this.team = team;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTeamName() {
        return this.team.getName();
    }

    public String accept(Visitor visitor) {
        return visitor.showPlayer(this);
    }
}
