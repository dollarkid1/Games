package turtle;

import static turtle.Direction.*;
import static turtle.PenPosition.*;


public class Turtle {

    private Pen pen = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);
    public Pen getPen() {
        return pen;

    }

    public void penDown() {
        pen.setPositionTo(DOWN);
    }

    public void penUp() {
        pen.setPositionTo(UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection){
            case EAST -> changeCurrentDirectionTo(SOUTH);
            case SOUTH -> changeCurrentDirectionTo(WEST);
            case WEST -> changeCurrentDirectionTo(NORTH);
            case NORTH -> changeCurrentDirectionTo(EAST);
        }
    }

    private void changeCurrentDirectionTo(Direction newDirection) {
      currentDirection = newDirection;
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> changeCurrentDirectionTo(NORTH);
            case NORTH -> changeCurrentDirectionTo(WEST);
            case WEST -> changeCurrentDirectionTo(SOUTH);
            case SOUTH -> changeCurrentDirectionTo(EAST);
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
