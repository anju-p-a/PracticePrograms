/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		 Scanner sc = new Scanner(System.in);
		 int T = sc.nextInt();
		for(int i = 0 ;i < T; i++){ 
    //T is the number of graphs , V is vertices , E is edges, after that the vertices of the edges are given on same line
		   
		    int V = sc.nextInt();
		    int E = sc.nextInt();
		    LinkedList<Integer>[ ] graphList = new LinkedList[V];
		    
		    for(int j = 0; j < V; j++){
		        if(graphList[j] == null){
		              graphList[j] = new LinkedList<Integer>();
		              graphList[j].add(j);
		         } 
		    }
		    for(int j = 0; j< E;j++){

		        
		        int s = sc.nextInt();
		        int  d = sc.nextInt();
		            
		        
		        graphList[s].add(d);
		        
		         graphList[d].add(s);
		        
		        
		    }
		    
		    
		    //printing nodes
		    for(int k = 0; k< V ; k++){
		        if(graphList[k] != null){
                    int tempSize = graphList[k].size();
                    int a = 0;
		        for(a = 0; a < tempSize-1;a++){

		            System.out.print(graphList[k].get(a) + "->" + " " );
		            
		        }
		        System.out.print(graphList[k].get(a));
		        System.out.println("");
		    }}
		    
		}}
	}
