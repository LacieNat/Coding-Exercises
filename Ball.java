import java.util.*;
class Ball {
  
  private static int code = 12345;
  
  private String colour;
  private double radius;
  
  public Ball() {
    setColour("yellow");
    setRadius(10.0);
  }
  
  public Ball(String newColour, double newRadius) {
    setColour(newColour);
    setRadius(newRadius);
  }
  
  public static int getCode() { return code; }
  
  public String getColour() { return colour; }
  
  public double getRadius() { return radius; }
  
  public static void setCode(int code) {
    Ball.code = code;
  }
  
  public void setColour(String colour){
    this.colour = colour;
  }
  
  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  public String toString() {
    return "[" + getColour() + "," + getRadius() + "]";
  }
  
  public boolean equals(Object obj) {
    if(obj instanceof Ball) {
      Ball ball = (Ball) obj;
      return this.getColour().equals(ball.getColour()) &&
             this.getRadius() == ball.getRadius();
    }
    else
      return false;
  }
}

class TestBall {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int inputCode;
    String inputColour;
    double inputRadius;
    
    Ball myBall = new Ball();
    
    System.out.println("myBall's default code: " + myBall.getCode());
    
    System.out.print("Enter code: ");
    inputCode = scanner.nextInt();
    System.out.print("Enter colour: ");
    inputColour = scanner.next();
    
    System.out.print("Enter radius: ");
    inputRadius = scanner.nextDouble();
    
    Ball.setCode(inputCode);
    myBall.setColour(inputColour);
    myBall.setRadius(inputRadius);
    
    System.out.println("Code is " + myBall.getCode());
    System.out.println("Colour is " + myBall.getColour());
    System.out.println("Radius is " + myBall.getRadius());
    
    System.out.println("Ball's contents are " + myBall);
  }
}
