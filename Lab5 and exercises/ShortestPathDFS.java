import java.util.*;
import java.awt.Point;

class ShortestPath1 {
 public static void main(String[] args) {
  int[][] maze;
  Scanner sc = new Scanner(System.in);
  
  //Take in inputs
  int N = sc.nextInt();
  maze = new int[N][N];

  for (int i = 0; i < N; i++) {
   for (int j = 0; j < N; j++) {
    maze[i][j] = sc.nextInt();
   }
  }

  // Starting location is at maze[1][0];
  Stack<Point> shortestPath = pathfinder(maze,N, 1, 0);

  System.out.println("The shortest path is " + shortestPath.size() + " steps:");

  // Print out the path
  Point p;
  while(!shortestPath.empty())
  {
   p = shortestPath.pop();
   System.out.println("(" + p.x + ", " + p.y + ")"); 
  }
 }
 
 public static boolean isValid(int N, int r, int c)
 {
  return r < N && r >= 0 && c < N && c >= 0;
 }
 //Recursive function
 public static Stack<Point> pathfinder(int[][] maze, int N, int r, int c) {
  
  //Declare variables
  Stack<Point> shortestPath = new Stack<Point>();
  Stack<Point> temp = null;
  maze[r][c] = 1;
  if(isValid(N, r-1, c) && maze[r-1][c] == 0)
  {
   temp = pathfinder(maze, N, r-1, c); 
   if(shortestPath.empty() || temp.size() < shortestPath.size())
   {
    shortestPath = temp;  
   }
  }

  if(isValid(N, r+1, c) && maze[r+1][c] == 0)
  {
   temp = pathfinder(maze, N, r+1, c); 
   if(shortestPath.empty() || temp.size() < shortestPath.size())
   {
    shortestPath = temp;  
   } 
  }

  if(isValid(N, r, c+1) && maze[r][c+1] == 0)
  {
   temp = pathfinder(maze, N, r, c+1); 
   if(shortestPath.empty() || temp.size() < shortestPath.size())
   {
    shortestPath = temp;  
   } 
   
  }
  if(isValid(N, r, c-1) && maze[r][c-1] == 0)
  {
   temp = pathfinder(maze, N, r, c-1); 
   if(shortestPath.empty() || temp.size() < shortestPath.size())
   {
    shortestPath = temp;  
   } 
  }
  shortestPath.push(new Point(r, c));
  return shortestPath; 
 }
}
