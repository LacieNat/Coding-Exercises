class Module {
  private String title;
  private Time schedule;
  
  public Module (String title, Time schedule){
    title = title;
    schedule = schedule;
  }
  
  public String getTitle() { return title; }
  public Time getSchedule() { return schedule; }
}

class Timetable {
  private Module[] listOfModules;
  
  public Timetable(){
    
  
  public Module[] getModules() { return listOfModules; }
  
  public static void main(String[] args) {
    Timetable myTimetable = new Timetable();