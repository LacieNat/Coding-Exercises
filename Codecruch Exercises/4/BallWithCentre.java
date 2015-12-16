// BallWithCentre class:
import java.awt.*;

class BallWithCentre {

 /************** Data members **********************/
 private static int quantity = 0; 

 private String colour;
 private double radius;
 private Point centre;

 /************** Constructors **********************/
 public BallWithCentre(){
   colour = "yellow";
   radius = 10.0;
   centre = new Point(0, 0);
 }
 
 public BallWithCentre(String colour, double radius, Point centre){
   this.colour = colour;
   this.radius = radius;
   this.centre = centre;
 }


 /**************** Accessors ***********************/
 public String getColour(){
   return colour;
 }
 
 public double getRadius(){
   return radius;
 }
 
 public Point getCentre(){
   return centre;
 }


 /**************** Mutators ************************/
 public void setColour(String newColour){
   this.colour = newColour;
 }
 
 public void setRadius(double newRadius){
   this.radius = newRadius;
 }
 
 public void setCentre(Point newCentre){
   this.centre = newCentre;
 }


 /***************** Overriding methods ******************/
 // Overriding toString() method
 public String toString() {
   return "[colour="+colour+", radius="+radius+", centre=("+centre.x+","+centre.y+")]";
 }

 // Overriding equals() method
 public boolean equals(Object obj) {
   if (obj instanceof BallWithCentre){
     BallWithCentre ball = (BallWithCentre) obj;
     return this.getColour().equals(ball.getColour()) && this.getRadius() == ball.getRadius() && 
       this.getCentre().equals(ball.getCentre());
   }
   else
     return false;
 }
}


