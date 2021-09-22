package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;
import static turtle.PenPosition.*;

public class TurtleTest {

    Pen pen;
    Turtle ijapa;


    @BeforeEach
    void setUp() {

        ijapa = new Turtle();
        pen = new Pen();

    }

    @Test
    void testThatTurtleHasAPen(){
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertNotNull(pen);

    }



    @Test
    void TestThatTurtleCanMovePenUp(){
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertSame(PenPosition.UP, pen.getPosition());
    }

    @Test
    void TestThatTurtleCanMovePenDown(){
        //Given
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertSame(UP, pen.getPosition());
        //When
        ijapa.penDown();
        //Assert
        assertSame(DOWN, ijapa.getPen().getPosition());
    }
    @Test
    @DisplayName("TestThatTurtleCanMovePenUpAfterMovingDownBefore")
    void TestThatTurtleCanMovePenUpAgain(){
        //Given
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertSame(UP, pen.getPosition());
        ijapa.penDown();
        //When
        ijapa.penUp();
        //Assert
        assertSame(UP, ijapa.getPen().getPosition());
    }

    @Test
    @DisplayName("test That Turtle Can Turn Right While Facing East")
    void testThatTurtleCanTurnRight1(){
        //given
        assertSame(EAST,ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(SOUTH,ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("test That Turtle Can Turn Right While Facing South")
    void testThatTurtleCanTurnRight2(){
        //given
        ijapa.turnRight();
        assertSame(SOUTH,ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(WEST,ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("test That Turtle Can Turn Right While Facing West")
    void testThatTurtleCanTurnRight3(){
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST,ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(NORTH,ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("test That Turtle Can Turn Right While Facing North")
    void testThatTurtleCanTurnRight4(){
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH,ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(EAST,ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("test That Turtle Can Turn Left While Facing East")
    void testThatTurtleCanTurnLeft1(){
        //given
        assertSame(EAST,ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(NORTH,ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("test That Turtle Can Turn Left While Facing North")
    void testThatTurtleCanTurnLeft2(){
        //given
        ijapa.turnLeft();
        assertSame(NORTH,ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(WEST,ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("test That Turtle Can Turn Left While Facing West")
    void testThatTurtleCanTurnLeft3(){
        //given
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST,ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(SOUTH,ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("test That Turtle Can Turn Left While Facing South")
    void testThatTurtleCanTurnLeft4(){
        //given
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH,ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(EAST,ijapa.getCurrentDirection());
    }

    @Test
    void testThatTheTurtleCanMoveForwardWhileFacingEast(){
        //given
        assertEquals( new Position(0,0), ijapa.getCurrentPosition());

    }




}
