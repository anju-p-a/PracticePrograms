/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
    	Scanner sc = new Scanner(System.in);
    	int T = Integer.parseInt(sc.nextLine());
      
        
    
    	while(T-- >= 0){
    	      //System.out.println(T);
	        String s = sc.nextLine();
	       System.out.println(s);
	       
	         int l = s.length()-1;
	        
	       
	                
	                    //check for parent
	                    
	                    if(checkPalendrome(s)){
	                        
	                        System.out.println("PARENT");
	                        return;
	                    }
	                    
	                    int end ;
	                    //check for odd
	                    if(l%2 == 0){
	                        end = l-1;
	                    }else{
	                        end = l;
	                    }
	                    boolean odd = checkTwin(s,1,end);
	                    //check for even
	                     if(l%2 == 0){
	                        end = l;
	                    }else{
	                        end = l-1;
	                    }
	                    boolean even = checkTwin(s,0,end);
	                    //check for twin
	                    if(odd && even){
	                        System.out.println("TWIN");
	                        return;
	                    }
	                    if(odd){
	                         System.out.println("ODD");
	                        return;
	                    }
	                   if(even){
	                        System.out.println("EVEN");
	                        return;
	                   }
	                   System.out.println("ALIEN");
	                    
	                
	                
	           }
	}
	public static boolean checkTwin(String s, int start, int end){
	    while(start<end){
	        if(s.charAt(start) == s.charAt(end)){
	            start = start+2;
	            end = end-2;
	        }else{
	            return false;
	        }
	    }
	    return true;
	}
	public static boolean checkPalendrome(String s){
	    int l = s.length()-1;
	    int i = 0;
	    while(i < l){
	        if(s.charAt(i) == s.charAt(l)){
	            l--;
	            i++;
	        }else{
	            return false;
	        }
	    }
	    return true;
	}
}
