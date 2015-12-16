/*  
 * CS1020 (AY2012/3 Sem2)  
 * Lab #2 Ex2  
 * Author    :   Fan Yuxin
 * Matric no.:   A0103494
 * Description of program: This program creates 3 classes: Schedule Module and Timetable. It has 2 
 * valid operations which are module and count. module adds the a valid module that does not clash with 
 * any other module in the students timetable. Count counts the number of lessons on that particular
 * day.
 */ 

import java.util.*;

class Schedule {
  //Attributes of Schedule
  private String day;
  private int startTime;
  private int endTime;
  
  //Constructor of Schedule
  public Schedule(String day, int startTime, int endTime){
    this.day = day;
    this.startTime = startTime;
    this.endTime = endTime;
  }

 /* clashWith: to check whether this schedule clash with a Schedule called otherSchedule
  * Pre-cond: otherSchedule must not be null
  * Post-cond: returns true if the schedules clashes and false if otherwise
  */
 public boolean clashWith(Schedule otherSchedule) {
   if((day.equals(otherSchedule.getDay())) &&
      (otherSchedule.getStartTime()<endTime && startTime<otherSchedule.getEndTime()))
     return true;
  return false;
 }
 
 //Accessors
 public String getDay(){
   return day;
 }
 
 public int getStartTime(){
   return startTime;
 }
 
 public int getEndTime(){
   return endTime;
 }
}

class Module {
  //Attributes of Module
  private String code;
  private Schedule lectureSchedule;
  private Schedule tutorialSchedule;
  private Schedule labSchedule;

  //Constructor of Module
  public Module(String code, Schedule lectureSchedule, Schedule tutorialSchedule, Schedule labSchedule){
    this.code = code;
    this.lectureSchedule = lectureSchedule;
    this.tutorialSchedule = tutorialSchedule;
    this.labSchedule = labSchedule;
  }
  
    
 /* count: to count number of classes(lecture, tutorial, and lab of only this Module) on day.
  *        For example: when day = "Monday", lecture is on Monday, tutorial is on Monday
  *        but lab is on Tuesday, then return 2. (lecture and tutorial are on Monday).
  * Pre-cond:Counts the number of schedules on that day itself. day must be a valid day
  * Post-cond: returns the count
  */
  public int count(String day) {
    int count = 0;
    if (lectureSchedule.getDay().equals(day))
      count++;
    if (tutorialSchedule.getDay().equals(day))
      count++;
    if (labSchedule.getDay().equals(day))
      count++;
    
  return count;
 }

 /* clashWith: to check whether this module clash with a Module called otherModule
  * Pre-cond: otherModule must not be null. All schedule must be filled in
  * Post-cond: returns true if there is at least one pair of schedule in the module that clashes
  */
 public boolean clashWith(Module otherModule) {
  return lectureSchedule.clashWith(otherModule.getLectureSchedule()) ||
         lectureSchedule.clashWith(otherModule.getTutorialSchedule()) ||
         lectureSchedule.clashWith(otherModule.getLabSchedule()) ||
         tutorialSchedule.clashWith(otherModule.getLectureSchedule()) ||
         tutorialSchedule.clashWith(otherModule.getTutorialSchedule()) ||
         tutorialSchedule.clashWith(otherModule.getLabSchedule()) ||
         labSchedule.clashWith(otherModule.getLectureSchedule()) ||                         
         labSchedule.clashWith(otherModule.getTutorialSchedule()) ||                          
         labSchedule.clashWith(otherModule.getLabSchedule());                        
 }
 
 //Accessors
 public String getCode(){
   return code;
 }
 
 public Schedule getLectureSchedule(){
   return lectureSchedule;
 }
 
 public Schedule getTutorialSchedule(){
   return tutorialSchedule;
 }
 
 public Schedule getLabSchedule(){
   return labSchedule;
 }
}

class Timetable {
 private ArrayList<Module> listOfMod;

 //Constructor
 public Timetable(){
   listOfMod = new ArrayList<Module>();
 }

 /* checkClash: to check whether otherModule clash with one of 
  *       the modules in our timetable list.
  * Pre-cond: otherModule must be valid and not null. All schedules must be filled in
  * Post-cond: returns true if the modules in the timetable clashes with the new input module
  */
 public boolean checkClash(Module otherModule) {
   for(Module element: listOfMod){
     if(element.clashWith(otherModule))
       return true;
   }
  return false;
 }

 /* add: to add a new module to the timetable list.
  * Pre-cond: module is a valid module with valid parameters
  * Post-cond: adds module into the list in timetable
  */
 public void add(Module module) {
   listOfMod.add(module);
 }

 /* count: to count number of classes on day.
  * Pre-cond: day must be a valid day
  * Post-cond: counts the number of classes on that day
  */
 public int count(String day) {
   int count = 0;
   for(Module element: listOfMod){
     count+=element.count(day);
   }
  return count;
 }
 
 //Accessor
 public ArrayList<Module> getListOfMod(){
   return listOfMod;
 }
}

class Register {
  
  //To read the inputs of a schedule
  public static Schedule readSchedule(Scanner sc){
    Schedule newSchedule = new Schedule(sc.next(), sc.nextInt(), sc.nextInt());
    return newSchedule;
  }
  
  //To read the inputs of a module
  public static Module readModule(Scanner sc){
    Module newMod = new Module(sc.next(), readSchedule(sc), readSchedule(sc), readSchedule(sc));
    return newMod;
  } 
  

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in); //Scanner object
  Timetable myTimetable = new Timetable();
  String[] output;
  Module mod;
  String op, day;
  
  int noOfOp = sc.nextInt();
  output = new String[noOfOp];
  for(int i=0; i<noOfOp; i++){
    op = sc.next();
    if(op.equals("MODULE")){
      mod = readModule(sc);
      if(myTimetable.getListOfMod().size()==0){
        myTimetable.add(mod);
        output[i] = "Added";
      }
      else{
        if(myTimetable.checkClash(mod)) 
          output[i] = "Clashed";
        else{
          myTimetable.add(mod);
          output[i] = "Added";
        }
      }
    }
    else if(op.equals("COUNT")){
      day = sc.next();
      Integer newCount = myTimetable.count(day);
      output[i] = newCount.toString();
    }
  }
  
   for(String element: output)
     System.out.println(element);
   

 }
}
