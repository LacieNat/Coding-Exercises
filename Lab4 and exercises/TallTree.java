import java.util.*;

class TallTree {
 public static void main(String argv[]) {
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();  int K;
    
  ArrayList<Integer> treeHeight = new ArrayList<Integer>();
  ArrayList<Integer> output = new ArrayList<Integer>();
  
  for(int i=0; i<N; i++){
    K = sc.nextInt();
    treeHeight.clear();
    for(int j=0; j<K; j++){
      treeHeight.add(sc.nextInt());
    }
    output.add(getMaxSubsequence(treeHeight, 0));
  }
               
   for(int element: output)
     System.out.println(element);
  }
 //get max size of an increasing subsequence, starting from startIndex
 public static int getMaxSubsequence(ArrayList<Integer> list, int startIndex) {
   int min = list.get(startIndex);
   int count = 0;
   int maxCount;
   if(startIndex == list.size()-1)
     return 1;
   else{
     for(int i=startIndex; i<list.size()-1; i++){
       if(list.get(i+1)>min){
         count++;
         min = list.get(i+1);
       }
     }
     int compare2 = getMaxSubsequence(list, startIndex+1);
     maxCount = count>compare2?count:compare2;
  return maxCount;
 }
}
}
