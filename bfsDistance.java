import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the bfs function below.
    static int[] bfs(int n, int m, int[][] edges, int s) { // n is no of vertices, m is edges
        int[] array1 = new int[n-1]; // value to be returned
        int[] distance = new int[n+1];
        boolean[] hasVisited = new boolean[n+1]; // to check if node has been visited
        boolean[] doNotVisit = new boolean[n+1];
        Queue<Integer> bfsQ = new LinkedList<Integer>();
        bfsQ.add(s);
        hasVisited[s] = true;
        LinkedList<Integer>[] myList = new LinkedList[n+1]; // adjacency list graph creation
        
        for(int i = 1; i<= n; i++){
                myList[i] = new LinkedList<Integer>(); // creating the initial node for each vertes
        }
        for(int i = 0; i < m ; i ++){ // for each edge in edges
            
             myList[edges[i][0]].add (edges[i][1]);
             myList[edges[i][1]].add (edges[i][0]);
        
            
        }
    /*    for(int i = 1; i <=n;i++){ // START printing the graph in adjacency list manner
        Iterator<Integer> itr = myList[i].iterator();
            System.out.print(i + " ");
            while(itr.hasNext()){
                 System.out.print( itr.next()  + " ");
            }
            System.out.println(""); // END 
        }
      */  
      /*  for(int i=0; i <=n;i++){
            Iterator<Integer> itr1 = myList[i].iterator();
            
        }*/
        int index = 0;
        while(bfsQ.size() > 0){
            int i = bfsQ.peek(); 
             if(doNotVisit[i] == false){
                     Iterator<Integer> itr1 = myList[i].iterator(); // initialized the iterator
                     
                     while(itr1.hasNext()){  // while we have not reached all the connections of i
                      int temp = itr1.next(); // loop through
                
               // check if you want to scan its adjacent lists
                        if(hasVisited[temp] == false){
                             bfsQ.add(temp);
                             if(temp != s){
                                 distance[temp] = distance[i] + 6;// 6 is the length of the edge
                             }
                             hasVisited[temp] = true;
                        
                        }
                    
                
                }
                    bfsQ.remove();  
                         

                    
                    doNotVisit[i] = true;   
                        
              }
            
        }
        
        for(int i = 1; i < n+1;i++){
            if(i!= s){
                if(distance[i] == 0){
                    distance[i] = -1;
                } 
                    array1[index] = distance[i];
                    index++;
                
            }
        }    
        
        return array1;
    }
///////////////////////////////////////////////////////////////////////////////////////////
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] edges = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] edgesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int edgesItem = Integer.parseInt(edgesRowItems[j]);
                    edges[i][j] = edgesItem;
                }
            }

            int s = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = bfs(n, m, edges, s);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
