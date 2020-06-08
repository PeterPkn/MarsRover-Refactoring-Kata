package mars.rover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void
    acceptance_test_1() {
        String newPosition = MarsRover.move(1, 2, 'N', "LMLMLMLMM");
        assertEquals("1 3 N", newPosition);
    }

    @Test
    public void
    acceptance_test_2() {
        String newPosition = MarsRover.move(3, 3, 'E', "MMRMMRMRRM");
        assertEquals("5 1 E", newPosition);
    }

    @Test
    public void neuePosition() {
        String neuePosition = MarsRover.move(5, 3, 'S', "5 5");
        assertEquals("5 3 S", neuePosition);
    }

    @Test
    public void
    acceptance_test_3() {
        String newPosition = MarsRover.move(0, 0, 'S', "MML");
        assertEquals("0 -3 E", newPosition);
    }
    @Test
    public void acceptance_test_8() {
        String newPosition = MarsRover.move(0, 0, 'S', "MMML");
        assertEquals("0 -3 E", newPosition);
    }

    @Test
    public void acceptance_test_9() {
        String newPosition = MarsRover.move(0, 0, 'S', "MMML");
        assertEquals("0 -3 E", newPosition);
    }

    @Test
    public void acceptance_test_10() {
        String newPosition = MarsRover.move(0, 0, 'S', "MMML");
        assertEquals("0 -3 E", newPosition);
    }
    //Test
}