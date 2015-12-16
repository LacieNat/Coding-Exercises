/*  
 * CS1020 (AY2012/3 Sem2)  
 * Lab #2 Ex3  
 * Author    :   
 * Matric no.:   
 * Description of program:   
 */ 

import java.util.*;

class SGTime {
 public int hour;
 public int minute;
 
 public SGTime() {
 }
 
 public SGTime(int hour, int minute) {
   this.hour = hour;
   this.minute = minute;
  
 }
 
 public boolean equals(Object obj){
   if(obj instanceof SGTime){
     SGTime time = (SGTime) obj;
     return ((this.hour == time.hour)&&(this.minute == time.minute));
   }
   else
     return false;
 }
 
 public String toString(){
   if(minute<10)
     return hour + ":0" + minute;
   else
     return hour + ":" + minute;
 }
 
}

class Airline {
 private String from_city;
 private String to_city;
 private SGTime departure_time;
 private int arrival_day;
 private SGTime arrival_time;
 private int cost;
 
 public Airline() {
  
 }
 
 public Airline(String from_city, String to_city, SGTime departure_time, 
                int arrival_day, SGTime arrival_time, int cost) {
   this.from_city = from_city;
   this.to_city = to_city;
   this.departure_time = departure_time;
   this.arrival_day = arrival_day;
   this.arrival_time = arrival_time;
   this.cost = cost;
  
 }
 
 public String getFromCity(){
   return from_city;
 }
 
 public String getToCity(){
   return to_city;
 }
 
 public SGTime getDepartureTime(){
   return departure_time;
 }
 
 public int getArrivalDay(){
   return arrival_day;
 }
 
 public SGTime getArrivalTime(){
   return arrival_time;
 }
 
 public int getCost(){
   return cost;
 }
 
 public String toString(){
   return from_city + " " + to_city + " " + departure_time.toString() + " " + arrival_day
     + " " + arrival_time.toString() + " " + cost;
 }
}

class ProcessQueries {
 private ArrayList <Airline> airlines;

 ProcessQueries() {
   airlines = new ArrayList<Airline>();

 }
 
 public ArrayList<Airline> getAirlines(){
   return airlines;
 }
 
 public void addAirline(Airline al){
  airlines.add(al);  
 }
 
 //return the earlier time
 public SGTime compareTime(SGTime time1, SGTime time2){
   if(time1.hour>time2.hour || (time1.hour==time2.hour&&time1.minute>time2.minute))
     return time2;
   else
     return time1;
 }
 
 //Check whether the the customer can make it for the flight given current time
 public boolean canFly(Airline airline, SGTime current_time){
   if(hrToMin(airline.getDepartureTime()) - hrToMin(current_time) >= 60)
     return true;
   else 
     return false;
 }
   
 
 //Type1 Query
 public Airline getEarliestDeparture(String fromCity, String toCity, SGTime current_time){
   Airline earliest = new Airline();
      
   for(Airline element: airlines){
     if(cityMatch(fromCity, toCity, element)){
        earliest = element;
        break;
     }
   }
   
   for(Airline element: airlines){
     if(cityMatch(fromCity, toCity, element) && canFly(element, current_time)){
       if(compareTime(element.getDepartureTime(), earliest.getDepartureTime()).equals(element.getDepartureTime()))
         earliest = element;
     }
   }
   
   
   
      
   return earliest;
 }
 
 //Type2 Query
 public Airline getEarliestArrival(String fromCity, String toCity, SGTime current_time){
   Airline earliest = new Airline();
   for(Airline element: airlines){
     if(cityMatch(fromCity, toCity, element)/* && canFly(element, current_time)*/){
       earliest = element;
       break;
     }
   }
   
   for(Airline element: airlines){
     if(cityMatch(fromCity, toCity, element) && canFly(element, current_time)){
       if(element.getArrivalDay() < earliest.getArrivalDay())
         earliest = element;
       else if(element.getArrivalDay() == earliest.getArrivalDay()){
         if(canFly(earliest, current_time)){
           if(compareTime(element.getArrivalTime(), earliest.getArrivalTime()).equals(element.getArrivalTime()))
             earliest = element;
         }
         else
           
     
       }
     }
   }
   return earliest;
 }
 
 //Converting hour to minutes
 public int hrToMin(SGTime time){
   return time.hour*60 + time.minute;
 }
 
 //Converting days to minutes
 public int dayToMin(Airline airline){
   return airline.getArrivalDay()*24*60;
 }
 
 //To calculate flight time
 public int flightTime(Airline airline){
   return hrToMin(airline.getArrivalTime()) - hrToMin(airline.getDepartureTime())
     + dayToMin(airline);
 }
   
   
 //Type3 Query
 public Airline getShortestFlight(String fromCity, String toCity, SGTime current_time){
   Airline min = new Airline();
    for(Airline element: airlines){
      if(cityMatch(fromCity, toCity, element)){
        min = element;
        break;
      }
    }
   
    for(Airline element: airlines){
      if(cityMatch(fromCity, toCity, element)){
        if(flightTime(element)<flightTime(min))
          min = element;
      }
    }
    return min;
 }
    
 
 //Type4 Query
 public Airline getLowestCost(String fromCity, String toCity, SGTime current_time){
   Airline min = new Airline();
   for(Airline element: airlines){
     if(cityMatch(fromCity, toCity, element)){
          min = element;
          break;
     }
   }
        
   for(Airline element: airlines){
     if(cityMatch(fromCity, toCity, element)){
       if(element.getCost()<min.getCost())
         min = element;
     }
   }
   return min;
 }

 
 
 //Check whether the city of the airlines matches the queries
 public boolean cityMatch(String fromCity, String toCity, Airline airline){
    if(airline.getFromCity().equals(fromCity) && airline.getToCity().equals(toCity))
      return true;
    else 
      return false;
 }
 
 }

class AirlineMain {
  
  //function to scan in the time
 public static SGTime readTime(Scanner sc){
   SGTime time;
   Scanner tsc = new Scanner(sc.next());
   tsc.useDelimiter(":");

   time = new SGTime(tsc.nextInt(), tsc.nextInt());
   tsc.close();

   return time;

  }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  ArrayList<Airline> newAirlines = new ArrayList<Airline>();
 
  int noOfAirlines = sc.nextInt();
  ProcessQueries queries = new ProcessQueries();
  
  for(int i=0; i<noOfAirlines; i++){
    Airline newAirline = new Airline(sc.next(), sc.next(), readTime(sc),
                                     sc.nextInt(), readTime(sc), sc.nextInt());
    queries.addAirline(newAirline);
  }
  
  // for(Airline element: queries.getAirlines){
    // element.toString();
   //}
   
  int noOfQueries = sc.nextInt();
  
  for(int j=0; j<noOfQueries; j++){
    switch(sc.nextInt()){
      case 1: newAirlines.add(queries.getEarliestDeparture(sc.next(), sc.next(), readTime(sc))); break;     
      case 2: newAirlines.add(queries.getEarliestArrival(sc.next(), sc.next(), readTime(sc))); break;
      case 3: newAirlines.add(queries.getShortestFlight(sc.next(), sc.next(), readTime(sc))); break;
      case 4: newAirlines.add(queries.getLowestCost(sc.next(), sc.next(), readTime(sc))); break;
    }
  }
  
   for(Airline element: newAirlines){
     System.out.println(element.toString());
   }
    

  // Declare the necessary variables.


  // Read in airline information.
  
  // Read in Queries and process them and output results accordingly.
 }
}

