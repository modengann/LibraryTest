import processing.core.*;

public class App extends PApplet {
  float x = 100;
  float y = 100;
  float speedX = 5;
  float speedY = 5;
  float radius = 25;

  public void settings() {
    size(500, 500);
  }

  public void draw() {
    background(255);

    // Draw the ball
    fill(0, 0, 255);
    ellipse(x, y, radius * 2, radius * 2);

    // Update the position of the ball
    x += speedX;
    y += speedY;

    // Check for collision with the walls
    if (x - radius < 0 || x + radius > width) {
      speedX = -speedX;
    }
    if (y - radius < 0 || y + radius > height) {
      speedY = -speedY;
    }
  }

  public static void main(String[] args) {
    PApplet.main("App");
  }
}
