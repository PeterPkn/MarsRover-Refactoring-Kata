package mars.rover;
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

    public void setPosX(int posX) {
        if(posX>0 || posX<this.fieldx) {
            this.posX = posX;
        }
    }

    public void setPosY(int posY) {
        if(posY>0 || posY<this.fieldy) {
            this.posY = posY;
        }
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public static String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {
            char instruction = instructions.charAt(0);
            switch(instruction){
                case 'L':
                    switch(direction){
                        case 'N':
                            return move(x, y, 'W', instructions.substring(1));
                        case 'W':
                            return move(x, y, 'S', instructions.substring(1));
                        case 'S':
                            return move(x, y, 'E', instructions.substring(1));
                        case 'E':
                            return move(x, y, 'N', instructions.substring(1));
                    }
                    break;
                case 'R':
                    switch(direction){
                        case 'N':
                            return move(x, y, 'E', instructions.substring(1));
                        case 'W':
                            return move(x, y, 'N', instructions.substring(1));
                        case 'S':
                            return move(x, y, 'W', instructions.substring(1));
                        case 'E':
                            return move(x, y, 'S', instructions.substring(1));
                    }
                case 'M':
                    switch(direction){
                        case 'N':
                            return move(x, y+1, 'W', instructions.substring(1));
                        case 'W':
                            return move(x, y-1, 'S', instructions.substring(1));
                        case 'S':
                            return move(x-1, y, 'E', instructions.substring(1));
                        case 'E':
                            return move(x+1, y, 'N', instructions.substring(1));
                    }
            }

        }
        return x + " " + y + " " + direction;
    }


}
