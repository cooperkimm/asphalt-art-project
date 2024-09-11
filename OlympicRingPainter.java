import org.code.neighborhood.*;
public class OlympicRingPainter extends PainterPlus {
  /*
  * Paints the olympic rings using different colors 
  */
  public void paintRings(){
    int counter = 0;
    move();
    turnRight();
    while(counter < 5){
      move();
      counter = counter + 1;
    }
    turnLeft();
    paintCircleOutline("blue");
    while(counter < 8){
      move();
      counter = counter + 1;
    }
    turnRight();
    move();
    move();
    turnLeft();
    paintCircleOutline("yellow");
    while(counter < 11){
      move();
      counter = counter + 1;
    }
    turnLeft();
    move();
    move();
    turnRight();
    paintCircleOutline("black");
     while(counter < 11){
      move();
      counter = counter + 1;
    }
    while(counter < 14){
      move();
      counter = counter + 1;
    }
    turnRight();
    move();
    move();
    turnLeft();
    paintCircleOutline("green");
     while(counter < 17){
      move();
      counter = counter + 1;
    }
    turnLeft();
    move();
    move();
    turnRight();
    paintCircleOutline("red");
    moveFast();
    turnRight();
    moveFast();
    turnLeft();
  }
    
}
  
