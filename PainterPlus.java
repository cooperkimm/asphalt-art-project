import org.code.neighborhood.*;

public class PainterPlus extends Painter{
  /*
  * Painter is able to turnRight using three turnLeft
  */
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }
  /*
  * Painter takesAllPaint when on bucket
  */
  public void takeAllPaint(){
    while(isOnBucket()){
      takePaint();
    }
  }
  /*
  * While the painter is able to move, it moves
  */
  public void moveFast(){
    while(canMove()){
      move();
    }
  }
  /*
  * While the painter has paint, it paints until it runs out 
  */
  public void paintToEmpty(String color){
    while(hasPaint()){
      paint(color);
      move();
    }
  }
  /*
  * The Painter paints a donut using paint
  */
  public void paintDonut(String color){
    while(hasPaint()){
      turnRight();
      paint(color);
      move();
      paint(color);
      move();
    }
  }
  /*
  * Painter is able to paint without a bucket with parameters for the color and amount of spaces
  */
   public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }
  /*
  * Painter paints a circle outline which is used for the medals and olympic rings
  */
  public void paintCircleOutline(String color){
    paintLine(color,2);
    turnLeft();
    move();
    paintLine(color,2);
    turnLeft();
    move();
    paintLine(color,2);
    turnLeft();
    move();
    paintLine(color,2);
    turnLeft();
    move();
  }
}