import java.util.*;
import java.io.*;

public class TextBuddy {
  public static void main (String[] args){
    String filename = args[0]; 
    File file = new File(filename);
    Scanner sc = new Scanner(System.in);
    ArrayList<String> arr = new ArrayList<String>(); //Array of strings to be edited. The content will be reinserted into the file after amendment
    
    System.out.println("Welcome to TextBuddy. " + filename + " is ready for use");
    System.out.println("command: ");
    String cmd = sc.next(); // variable to take in the command 
    String input; // variable to take in the string to be added into the file
    String removed; // variable to save the string that is deleted so that it can be displayed after each delete command
    int num; // the number variable that comes after the delete command
    
    //main method to execute to take in the commands and carry out the respective methods
    while(!cmd.equals("exit")){
      if (cmd.equals("add")){
        input = sc.nextLine();
        input = input.trim(); // trims any leading and trailing spaces from the input taken in
        arr.add(input);
        add(arr, file);
        System.out.println("added to " + filename + ": \"" + input + "\""); 
      }
      
      else if(cmd.equals("display")){
        display(filename, file);
      }
      
      else if(cmd.equals("delete")){
        num = sc.nextInt();
        removed = delete(arr, num, file);
        System.out.println("deleted from " + filename + ": \"" + removed + "\"");
      }
      
      else if(cmd.equals("clear")){
        clear(arr, file);
        System.out.println("all content deleted from " + filename); 
      }
      
      System.out.println("command: ");
      cmd = sc.next();
    }
    
  }
  
  // This method adds in the text that the user wants to input into the file
  public static void add(ArrayList<String>arr, File file){
    try {
      FileWriter filewriter = new FileWriter(file.getAbsoluteFile());
      BufferedWriter bw = new BufferedWriter(filewriter);
      for(String e: arr){
        bw.write(e);
        bw.newLine();
      }
      bw.close();
    }
    
    catch (IOException e){
      e.printStackTrace();
    }
  }
  
  // This method displays everything that is in the file
  public static void display(String filename, File file){
    try {
      FileReader filereader = new FileReader(filename);
      BufferedReader br = new BufferedReader(filereader);
      String current;
      int counter = 1;
      
      while((current = br.readLine()) != null){
        System.out.println(counter + ". " + current);
        counter++;
      }
      
      //Displays empty is file is empty
      if(file.length()==0)
        System.out.println(filename + " is empty");
    }
    
    catch (IOException e){
      e.printStackTrace();
    }
  }
  
  //This method removes everything that is in the file
  public static void clear(ArrayList<String> arr, File file){
      arr.clear();  
      add(arr,file);
  }
  
  //This method removes the sentence that corresponds to the number that is inserted through parameters
  public static String delete(ArrayList<String>arr, int num, File file){
    //If number is invalid, no element is deleted
    if(arr.size()<num){
      return "Error: No such element";
    }
    
    else{
      String str = arr.get(num-1);
      arr.remove(num-1);
      add(arr, file);
      return str;
    }
  }
}
    
    
    
  