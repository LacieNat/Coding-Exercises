import java.util.Vector;

class TestVector {
  
  public static void main(String[] args) {
    
    Vector<String> courses = new Vector<String>();
    
    courses.add("CS1020");
    courses.add(0, "CS1010");
    courses.add(1,"CS2010");
    
    System.out.println(courses);
    System.out.println("At index 0: " + courses.get(1));
    
    if (courses.contains("CS1020"))
      System.out.println("CS1020 is in vector");
    
    courses.remove("CS1020");
    for (String c: courses)
      System.out.println(c);
  }
}