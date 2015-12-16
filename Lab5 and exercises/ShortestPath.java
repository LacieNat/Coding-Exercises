/*  
 * CS1020 (AY2012/3 Sem2)  
 * Lab #5 Ex1  
 * Author    : Fan Yuxin(Lacie) 
 * Matric no.: A0103494J 
 * Description of program: This program prints out the shortest path out of a maze
 *
 */
import java.util.*;
import java.awt.Point;

class ShortestPath {
 public static void main(String[] args) {
  int[][] maze;
  Point pt;
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
  Stack<Point> shortestPath = pathfinder(maze, 1, 0, N);

  System.out.println("The shortest path is " + shortestPath.size() + " steps:");

  while(!shortestPath.empty()){
    pt = shortestPath.pop();
    System.out.println("(" + pt.x + ", " + pt.y + ")"); 
  }
 }
 
 //Recursive function
 public static Stack<Point> pathfinder(int[][] maze, int r, int c, int N) {

  //Declare variables
  Stack<Point> shortestPath = new Stack<Point>();
  Stack<Point> temp = null;

  //Mark step as visited
  maze[r][c] = 1;

  // Case 1: Move UP
  if(r!=0 && maze[r-1][c]==0){
    temp = pathfinder(maze, r-1, c, N);
    if(shortestPath.empty() || temp.size()<shortestPath.size()){
      shortestPath = temp;
    }
  }

  // Case 2: Move RIGHT
  if(c!=(N-1) && maze[r][c+1]==0){
    temp = pathfinder(maze, r, c+1, N);
    if(shortestPath.empty() || temp.size()<shortestPath.size()){
      shortestPath = temp;
    }
  }

  // Case 3: Move DOWN
  if(r!=(N-1) && maze[r+1][c]==0){
    temp = pathfinder(maze, r+1, c, N);
    if(shortestPath.empty() || temp.size()<shortestPath.size()){
      shortestPath = temp;
    }
  }

  // Case 4: Move LEFT
  if(c!=0 && maze[r][c-1]==0){
    temp = pathfinder(maze, r, c-1, N);
    if(shortestPath.empty() || temp.size()<shortestPath.size()){
      shortestPath = temp;
    }
  }
  shortestPath.push(new Point(r,c));
  
  return shortestPath; 
 }
}
