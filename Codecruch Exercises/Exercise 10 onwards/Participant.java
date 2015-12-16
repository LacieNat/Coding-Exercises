class Participant {
  
  //Attributes
  private String name;
  private int age;
  private String school;
  
  //Constructors
  public Participant(){
  
  }
  
  public Participant(String name, int age, String school){ 
    this.name = name;
    this.age = age;
    this.school = school;
  }
  
  //Accessors
  public String getName(){
    return name;
  }
  
  public int getAge(){
    return age;
  }
  
  public String getSchool(){
    return school;
  }
  
  //Mutators
  public void setName(String name){
    this.name = name;
  }
  
  public void setAge(int age){
    this.age = age;
  }
  
  public void setSchool(String school){
    return school;
  }
  
  //Methods
  public boolean validAge(int age){
    if(age<13 || age >30)
      return false;
    else 
      return true;
  }
  
  public boolean compareSchool(Participant p){
    return this.getSchool().equals(p.getSchool());
  }
  
  public void readParticipant(Scanner sc){
    this.getName() = sc.next();
    this.getAge() = sc.nextInt();
    this.getSchool() = sc.next();
  }
}

class Team {
  
  //Attributes
  private ArrayList<Participant> participants = new ArrayList<Participations>();
  private String teamName;
  private int noOfPtpts;
  private String gameType;
  
  //Constructors
  public Team(){
 
  }
  
  public Team(String teamName, int noOfPtpts, String gameType){
    this.teamName = teamName;
    this.noOfPtpts = noOfPtpts;
    this.gameType = gameType;
  }
  
  //Accessors
  public String getTeamName(){
    return teamName;
  }
  
  public int getNoOfPtpts(){
    return noOfPtpts;
  }
  
  public String gameType(){
    return gameType;
  }
  
  //Mutators
  public String setTeamName(String teamName){
    this.teamName = teamName;
  }
  
  public int setNoOfPtpts(int noOfPtpts){
    this.noOfPtpts = noOfPtpts;
  }
  
  public String setGameType(String gameType){
    this.gameType = gameType;
  }
  
  //Method
  public void addParticipant(Participant p){
    participants.add(p)
  }
  
}

class TestParticulars {
  public static void main(String[] args){
    
    ArrayList<Team> teams = new ArrayList<Team>();
    
    //Scanner
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter number of Teams: ");
    int noOfTeams = sc.nextInt();
    
    for(int i=0; i<noOfTeams; i++){
      Team newTeam = new Team();
      
      System.out.println("This is Team " + i);
      System.out.println("Enter Team Name: ");
      
      
      System.out.print("Enter name, age and school of participant " + i + ": ");
      Participant p = new Participant();
      p.readParticipant(sc);
      if(p.validAge(p.getAge()))
        
      
    
  
  
    
  
    