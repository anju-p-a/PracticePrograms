/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) { // making list of subsequences using two lists
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < T;i++){
		    String s = sc.nextLine();
		    ArrayList<String> myList = new ArrayList<String>();
		    
		    
		 
		    
		    getSubsequence(s,s.toUpperCase(),myList);
		    
		    System.out.println(myList.size());
		    Collections.sort(myList);
		    for(String a: myList){
		        System.out.print(a + " ");
		    }
		    System.out.println();
		    
		}
		
	}
	
	public static ArrayList<String> getSubsequence(String s,String other,ArrayList<String> myList){
	    if(s.length() == 1){
	        myList.add(Character.toString(other.charAt(0)));
	        myList.add(Character.toString(s.charAt(0)));
	        return myList;
	        
	    }
	    if(s.length()>1){
	    myList = getSubsequence(s.substring(0,s.length()-1),other.substring(0,other.length()-1),myList);
	    }
	    int a = myList.size();
	    for(int j = 0;j< a;j++){
	        myList.add(myList.get(j)+Character.toString(other.charAt(s.length()-1)));
	    }
	    myList.add(Character.toString(other.charAt(s.length()-1)));
	    
	    for(int j = 0;j< a;j++){
	        myList.add(myList.get(j)+Character.toString(s.charAt(s.length()-1)));
	    }
	    myList.add(Character.toString(s.charAt(s.length()-1)));
	   return myList;
	    
	}

	        
	            
	            
	           
	        
	        
	        
	    }
	    
	


