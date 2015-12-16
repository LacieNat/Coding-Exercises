import java.util.*;
import java.awt.*;

class TestBallWithCentre {

 // This method reads ball's input data from user, creates
 // a ball object, and returns it to the caller.
 public static BallWithCentre readBall(Scanner sc) {

  System.out.print("Enter colour, radius and centre: ");
  String inputColour = sc.next();
  double inputRadius = sc.nextDouble();
  int x = sc.nextInt();
  int y = sc.nextInt();
  Point centre = new Point(x, y);
  
  BallWithCentre ball = new BallWithCentre(inputColour, inputRadius, centre);
  
  return ball;
 }

 // complete the function body
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  // Read input and create 1st ball object
  System.out.println("1st ball");
  BallWithCentre b1 = readBall(scanner);

  // Read input and create 2nd ball object
  System.out.println("2nd ball");
  BallWithCentre b2 = readBall(scanner);

  // Read input and create 3rd ball object
  System.out.println("3rd ball");
  BallWithCentre b3 = readBall(scanner);
  
  System.out.println(" ");
  if(!b1.equals(b2))
    System.out.println("1st and 2nd balls are not the same.");
  else
    System.out.println("1st and 2nd balls are the same.");
  
  System.out.println("The largest ball created is:");
  if((b1.getRadius()>b2.getRadius()) && (b1.getRadius()>b3.getRadius()))
    System.out.println(b1.toString());
  else if((b2.getRadius()>b1.getRadius()) && (b2.getRadius()>b3.getRadius()))
    System.out.println(b2.toString());
  else if((b3.getRadius()>b1.getRadius()) && (b3.getRadius()>b2.getRadius()))
    System.out.println(b3.toString());
  
 }
}

