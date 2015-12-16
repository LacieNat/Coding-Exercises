/*
 * CS1020 (AY2012/3 Sem2)
 * Lab #1 Ex2
 * Author    : Fan Yuxin Lacie
 * Matric no.: A0103494J
 * Description of program:  This program output the final states of 
 * the respective devices, and calculates the total number
 * of stops made to turn all the knobs
 */

import java.util.*;

class Knob {

 // Data attributes
 boolean isOn;      // is the device on?
 String currPos;    // current position of knob
 String targetPos;  // target position of knob

 // Constructor
 public Knob(boolean state, String newCurrPos, String newTargetPos) { 
   isOn = state;
   currPos = newCurrPos;
   targetPos = newTargetPos;
 }

 // Determine whether the device is on or off after num moves
 public boolean deviceIsOn(int num) {
   if(num%2==0)
     return isOn;

  return (!isOn); 
 }
 
 public int noOfPos(String pos){
   if(pos.equals("right"))
     return 0;
   else if(pos.equals("down"))
     return 1;
   else if(pos.equals("left"))
     return 2;
   else if(pos.equals("up"))
     return 3;
   else
     return -1;
 }
     
 // Compute the least moves to turn the knob
 public int ChangePos() {
   int _currPos; int _targetPos;
   
   _currPos = noOfPos(currPos);
   _targetPos = noOfPos(targetPos);
   
   if(_currPos == _targetPos)
     return 4;
   else if (_currPos > _targetPos)
     return(_targetPos - _currPos + 4);
   else
     return (_targetPos - _currPos);
 }
}

// The client (driver) class
class TurnKnobs{

 public static void main(String[] args){
   int noOfKnobs; 
   ArrayList<Knob> knobs = new ArrayList<Knob>();
   Scanner sc = new Scanner(System.in);
   noOfKnobs = sc.nextInt();
   for(int i=0; i<noOfKnobs; i++){
     String deviceState = new String(sc.next());
     if(deviceState.equals("on"))
       knobs.add(i, new Knob(true, sc.next(), sc.next()));
     else
       knobs.add(i, new Knob(false, deviceState, sc.next()));
        }
  int move = 0;
  for (Knob element: knobs){
    if(element.deviceIsOn(element.ChangePos()))
      System.out.println("on");
    else
      System.out.println("off");
    move = move + element.ChangePos();
  }

  System.out.println("Total stop(s) = " + move);
 }
}


