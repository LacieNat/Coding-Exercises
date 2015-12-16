// CS1020 (AY2012/3 Semester 2)
// Name: 
// Matric. No.: 
// Lab group: 
// (Write the program description below)
import java.util.*;

class DateConvert {

  public static boolean isLeapYear(int year){
    if(year%400==0 || (year%4==0 && year%100!=0))
      return true;
    else
      return false;
  }
    
  public static void main(String[] args) {
   
  String month; String date; int year; String[] newDate;
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter date in UK format: ");
  month = sc.next();
  date = sc.next();
  year = sc.nextInt();

  newDate = date.split(",");
  System.out.println("Date in American format: " +  newDate[0] + " " + month + " " + year);
  
  if(isLeapYear(year))
    System.out.println(year + " is a leap year.");
  else
    System.out.println(year + " is not a leap year.");

 }
}

