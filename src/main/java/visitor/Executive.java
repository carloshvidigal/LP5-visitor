package visitor;

public class Executive implements Employee {

    private String name;
    private String department;

    public Executive(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String accept (Visitor visitor){
        return visitor.showExecutive(this);
    }
}
