package visitor;

public class Coach implements Employee {

    private String coachLicenseID;
    private String name;

    public Coach(String coachLicenseID, String name) {
        this.coachLicenseID = coachLicenseID;
        this.name = name;
    }

    public String getCoachLicenseID() {
        return coachLicenseID;
    }

    public String getName() {
        return name;
    }

    public String accept(Visitor visitor) {
        return visitor.showCoach(this);
    }
}
