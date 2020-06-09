package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void acceptance_test_1() {
        String newPosition = MarsRover.move(1, 2, 'N', "LMLMLMLMM");
        assertEquals("1 3 N", newPosition);
    }

    @Test
    public void acceptance_test_2() {
        String newPosition = MarsRover.move(3, 3, 'E', "MMRMMRMRRM");
        assertEquals("5 1 E", newPosition);
    }

    @Test
    public void acceptance_test_3() {
        String newPosition = MarsRover.move(0, 0, 'S', "MMML");
        assertEquals("0 -3 E", newPosition);
    }

    @Test
    public void acceptance_test_4() {
        String neuePosition = MarsRover.move(5, 3, 'S', "MMRM");
        assertEquals("6 3 N", neuePosition);
    }

    @Test
    public void acceptance_test_5() {
        String newPosition = MarsRover.move(0, 0, 'S', "MMML");
        assertEquals("0 -3 E", newPosition);
    }

    @Test
    public void acceptance_test_6BorderNorth() {
        MarsRover test = new MarsRover(5,5);
        String newPosition = test.move(3, 3, 'S', "LLMMM");
        assertEquals("3 5 N", newPosition);
    }

    @Test
    public void acceptance_test_7BorderEast() {
        MarsRover test = new MarsRover(2,2);
        String newPosition = test.move(0, 0, 'S', "MLM");
        assertEquals("1 0 E", newPosition);
    }
    @Test
    public void acceptance_test_8BorderSouth() {
        MarsRover test = new MarsRover(5,5);
        String newPosition = test.move(3, 3, 'S', "MLLRRMMM");
        assertEquals("3 0 S", newPosition);
    }

    @Test
    public void acceptance_test_9BorderWest() {
        MarsRover test = new MarsRover(2,3);
        String newPosition = test.move(1, 1, 'S', "MRMM");
        assertEquals("0 0 W", newPosition);
    }

    @Test
    public void acceptance_test_10LongTravel() {
        MarsRover test = new MarsRover(5,5);
        String newPosition = test.move(3, 3, 'W', "MLMRMLMLMRMLMLMRMLMLM");
        assertEquals("3 2 W", newPosition);
    }
}