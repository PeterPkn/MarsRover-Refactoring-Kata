package mars.rover;
//Peter Push
//Leon Push
//Matthias Push
//Peter zweiter push
//Stefan Push
public class MarsRover {

    private int fieldx;
    private int fieldy;

    private int posX;
    private int posY;
    private char direction;

    public MarsRover(int fieldx, int fieldy) {
        this.fieldx = fieldx;
        this.fieldy = fieldy;
    }

    public static String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {
            char instruction = instructions.charAt(0);
            //dreht sich 90° nach Links
            if (instruction == 'L') {
                if (direction == 'N') {
                    return move(x, y, 'W', instructions.substring(1));
                } else if (direction == 'W') {
                    return move(x, y, 'S', instructions.substring(1));
                } else if (direction == 'S') {
                    return move(x, y, 'E', instructions.substring(1));
                } else if (direction == 'E') {
                    return move(x, y, 'N', instructions.substring(1));
                }
                //dreht sich 90° nach Rechts
            } else if (instruction == 'R') {
                if (direction == 'N') {
                    return move(x, y, 'E', instructions.substring(1));
                } else if (direction == 'W') {
                    return move(x, y, 'N', instructions.substring(1));
                } else if (direction == 'S') {
                    return move(x, y, 'W', instructions.substring(1));
                } else if (direction == 'E') {
                    return move(x, y, 'S', instructions.substring(1));
                }
                //geht um 1 Feld nach vorne
            } else if (instruction == 'M') {
                if (direction == 'N') {
                    return move(x, y + 1, 'N', instructions.substring(1));
                } else if (direction == 'S') {
                    return move(x, y - 1, 'S', instructions.substring(1));
                } else if (direction == 'W') {
                    return move(x - 1, y, 'W', instructions.substring(1));
                } else if (direction == 'E') {
                    return move(x + 1, y, 'E', instructions.substring(1));
                }
            }
        }
        return x + " " + y + " " + direction;
    }
}
