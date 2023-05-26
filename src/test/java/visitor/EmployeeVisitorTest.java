package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeVisitorTest {

    @Test
    void shouldDisplayPlayer() {
        Player player = new Player(11, "Gabriel Pec", "Forward", new Team("Vasco da Gama"));

        EmployeeVisitor visitor = new EmployeeVisitor();
        assertEquals("Player number 11, named Gabriel Pec plays as Forward.", visitor.show(player));
    }

    @Test
    void shouldDisplayCoach() {
        Coach coach = new Coach("120110302", "Mauricio Barbieri");

        EmployeeVisitor visitor = new EmployeeVisitor();
        assertEquals("Coach named Mauricio Barbieri has the following coach license: 120110302.", visitor.show(coach));
    }

    @Test
    void shouldDisplayExecutive() {
        Executive executive = new Executive("Paulo Bracks", "Business");

        EmployeeVisitor visitor = new EmployeeVisitor();
        assertEquals("Our executive named Paulo Bracks works at the Business department.", visitor.show(executive));

    }
}
