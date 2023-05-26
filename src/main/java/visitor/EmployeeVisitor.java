package visitor;

public class EmployeeVisitor implements Visitor{

    public String show(Employee employee) {
        return employee.accept(this);
    }

    @Override
    public String showPlayer(Player player) {
        return "Player number " + player.getNumber() +
                ", named " + player.getName() +
                " plays as " + player.getPosition() + ".";
    }

    @Override
    public String showCoach(Coach coach) {
        return "Coach named " + coach.getName() +
                " has the following coach license: " +
                coach.getCoachLicenseID() + ".";
    }

    @Override
    public String showExecutive(Executive executive) {
        return "Our executive named " + executive.getName() +
                " works at the " + executive.getDepartment() +
                " department.";
    }
}
