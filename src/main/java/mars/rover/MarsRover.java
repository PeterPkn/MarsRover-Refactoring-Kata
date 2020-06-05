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

    public MarsRover(int fieldx, int fieldy, int posX,int posY,char direction) {
        this.fieldx = fieldx;
        this.fieldy = fieldy;
        this.posX=posX;
        this.posY=posY;
        this.direction=direction;
    }

    public static String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {
            char instruction = instructions.charAt(0);
            if (instruction == 'L') {
                if (direction == 'N') {
                    return move(x, y, 'W', instructions.substring(1, instructions.length()));
                } else if (direction == 'W') {
                    return move(x, y, 'S', instructions.substring(1, instructions.length()));
                } else if (direction == 'S') {
                    return move(x, y, 'E', instructions.substring(1, instructions.length()));
                } else if (direction == 'E') {
                    return move(x, y, 'N', instructions.substring(1, instructions.length()));
                }
            } else if (instruction == 'R') {
                if (direction == 'N') {
                    return move(x, y, 'E', instructions.substring(1, instructions.length()));
                } else if (direction == 'W') {
                    return move(x, y, 'N', instructions.substring(1, instructions.length()));
                } else if (direction == 'S') {
                    return move(x, y, 'W', instructions.substring(1, instructions.length()));
                } else if (direction == 'E') {
                    return move(x, y, 'S', instructions.substring(1, instructions.length()));
                }
            } else if (instruction == 'M') {
                if (direction == 'N') {
                    return move(x, y + 1, 'N', instructions.substring(1, instructions.length()));
                } else if (direction == 'S') {
                    return move(x, y - 1, 'S', instructions.substring(1, instructions.length()));
                } else if (direction == 'W') {
                    return move(x - 1, y, 'W', instructions.substring(1, instructions.length()));
                } else if (direction == 'E') {
                    return move(x + 1, y, 'E', instructions.substring(1, instructions.length()));
                }
            }
        }
        return x + " " + y + " " + direction;
    }
}
