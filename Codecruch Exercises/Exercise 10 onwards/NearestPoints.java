// To compute the distance of the nearest pair of points
// in a list of points.

import java.util.*;
import java.awt.*;

class NearestPoints {
  
  public static double calculateDist(Point point1, Point point2){
    return Math.sqrt((point1.getX()-point2.getX())*(point1.getX()-point2.getX()) +
                                (point1.getY()-point2.getY())*(point1.getY()-point2.getY()));
  }
    

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  double minDist;

  int size = sc.nextInt();  // size of list;

  ArrayList<Point> points = new ArrayList<Point>(size);
  
  for(int i=0; i<size; i++){
    Point _point = new Point(sc.nextInt(), sc.nextInt());
    points.add(_point);
  }
  
  minDist = calculateDist(points.get(0), points.get(1));

  
  //Calculate the min dist between the points
   for(int i=0; i<points.size(); i++){
       Point newPoint = new Point();
       newPoint = points.get(0);
       points.remove(points.get(0));
       for(Point ele: points){
           if(calculateDist(newPoint, ele)<minDist)
           minDist = calculateDist(newPoint, ele);
    
    }
   }

  System.out.printf("Minimum distance = %.2f\n", minDist);
 }
}

