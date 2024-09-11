import org.code.neighborhood.*;

public class SetUpPainter extends PainterPlus {
  /*
  * Uses all the methods to paint the background and layout of the asphalt art
  */
  int count;
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }

    paintLine(color, size);
    turnAround();
    medalsPodium();
  }
  /*
  * Uses the isFacingEast condition to turn west
  */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }
  /*
  * Uses the isFacingWest condition to turn east
  */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }
  /*
  * turns 180 degrees using two turnRight
  */
  public void turnAround() {
    turnRight();
    turnRight();
  }
  /*
  * Resets the Painter position by returning it to the bottom left corner
  */
  void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }
  /*
  * Paints the olympic podium and gold, silver, and bronze medals using different colors
  */
  public void medalsPodium(){
    while(count < 3){
      move();
      paintLine("olive",4);
      count = count + 1;
    }
    turnLeft();
    move();
    turnLeft();
    move();
    while(count < 9){
      move();
      count = count + 1;
    }
    paintLine("olive",2);
    turnAround();
    while(count < 15){
      move();
      count = count + 1;
    }
    paintCircleOutline("tan");
    turnLeft();
    paintLine("tan",3);
    turnRight();
    move();
    turnRight();
    paintLine("tan",3);
    turnAround();
    move();
    turnLeft();
    while(count < 21){
      move();
      count = count + 1;
    }
    turnAround();
    paintCircleOutline("gold");
    turnLeft();
    paintLine("gold",3);
    turnRight();
    move();
    turnRight();
    paintLine("gold",3);
    turnRight();
    while(count < 27){
      move();
      count = count + 1;
    }
    turnLeft();
    move();
    turnLeft();
    paintCircleOutline("silver");
    turnLeft();
    paintLine("silver",3);
    turnRight();
    move();
    turnRight();
    paintLine("silver",3);
    move();
    turnLeft();
    while(count < 39){
      move();
      count = count + 1;
    }
  }
}