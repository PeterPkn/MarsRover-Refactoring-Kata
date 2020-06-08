package mars.rover;
public class MarsRover {

    private static int fieldx;
    private static int fieldy;

    public MarsRover(int fieldx, int fieldy) {
        this.fieldx = fieldx;
        this.fieldy = fieldy;
    }

    public static String move(int x, int y, char direction, String instructions) {
        char ursprungsDirection = direction;
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
                            if(y+1 > fieldy){return move(x, y, 'W', instructions.substring(1));}
                            else{return move(x, y+1, 'W', instructions.substring(1));}
                        case 'W':
                            if(y-1 < 0){ return move(x, y, 'S', instructions.substring(1));}
                            else{return move(x, y-1, 'S', instructions.substring(1));}
                        case 'S':
                            if(x-1 < 0){ return move(x, y, 'S', instructions.substring(1));}
                            else{return move(x, x-1, 'S', instructions.substring(1));}
                        case 'E':
                            if(x+1 > fieldx){return move(x, y, 'W', instructions.substring(1));}
                            else{return move(x, x+1, 'W', instructions.substring(1));}
                    }
            }

        }
        return x + " " + y + " " + direction;
    }


}
