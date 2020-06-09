package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void acceptance_test_1DirectionTestNorth() {
        MarsRover test = new MarsRover(5, 5);
        String newPosition = MarsRover.move(0, 0, 'N', "MMMRMLLM");
        assertEquals("0 3 W", newPosition);
    }

    @Test
    public void acceptance_test_2DirectionTestEast() {
        MarsRover test = new MarsRover(10, 10);
        String newPosition = MarsRover.move(3, 1, 'O', "MMMRMLLM");
        assertEquals("3 1 O", newPosition);
    }

    @Test
    public void acceptance_test_3DirectionSouth() {
        MarsRover test = new MarsRover(3, 1);
        String newPosition = MarsRover.move(0, 0, 'S', "MRRMLRMM");
        assertEquals("0 1 N", newPosition);
    }

    @Test
    public void acceptance_test_4DirectionWest() {
        MarsRover test = new MarsRover(7, 7);
        String neuePosition = MarsRover.move(5, 3, 'S', "RRRLLLMMMLM");
        assertEquals("6 0 E", neuePosition);
    }

    @Test
    public void acceptance_test_5NullTravel() {
        MarsRover test = new MarsRover(0, 0);
        String newPosition = MarsRover.move(0, 0, 'S', "");
        assertEquals("0 0 S", newPosition);
    }

    @Test
    public void acceptance_test_6BorderNorth() {
        MarsRover test = new MarsRover(5, 5);
        String newPosition = MarsRover.move(3, 3, 'S', "LLMMM");
        assertEquals("3 5 N", newPosition);
    }

    @Test
    public void acceptance_test_7BorderEast() {
        MarsRover test = new MarsRover(2, 2);
        String newPosition = MarsRover.move(0, 0, 'S', "MLM");
        assertEquals("1 0 E", newPosition);
    }

    @Test
    public void acceptance_test_8BorderSouth() {
        MarsRover test = new MarsRover(5, 5);
        String newPosition = MarsRover.move(3, 3, 'S', "MLLRRMMM");
        assertEquals("3 0 S", newPosition);
    }

    @Test
    public void acceptance_test_9BorderWest() {
        MarsRover test = new MarsRover(2, 3);
        String newPosition = MarsRover.move(1, 1, 'S', "MRMM");
        assertEquals("0 0 W", newPosition);
    }

    @Test
    public void acceptance_test_10LongTravel() {
        MarsRover test = new MarsRover(5, 5);
        String newPosition = MarsRover.move(3, 3, 'W', "MLMRMLMLMRMLMLMRMLMLM");
        assertEquals("3 2 W", newPosition);
    }
}