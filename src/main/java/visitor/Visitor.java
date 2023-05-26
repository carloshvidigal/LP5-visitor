package visitor;

public interface Visitor {

    String showPlayer(Player player);
    String showCoach(Coach coach);
    String showExecutive(Executive executive);
}
