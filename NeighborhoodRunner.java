import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    // This painter paints the background, podium, and medals
    SetUpPainter gabe = new SetUpPainter();
    gabe.paintBackground("beige",16);
    // This painter paints the olympic rings
    OlympicRingPainter justin = new OlympicRingPainter();
    justin.paintRings();

    
  }
}