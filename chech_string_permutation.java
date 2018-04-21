package anjuPractice;
import java.util.Arrays;
import java.util.HashMap;
public class permutation {
	 public static void main(String []args){
		 String s1 = "zxcab";
	      String s2 = "zcxea";
	      
	      //methodUsingSort(s1,s2);
	     // methodUsingArrays(s1,s2);
	      methodUsingHashMap(s1,s2);
	       
	}
	 
	 public static void methodUsingHashMap(String s1,String s2){
		 
		 if(s1.length() != s2.length()){
	        	System.out.println("not a permutation");
	        	return;
	        }
		 HashMap<Character, Integer> myMap = new HashMap<Character,Integer>();
		 char t;
		 for(int i = 0; i < s1.length();i++){
			 t = s1.charAt(i);
			 if(myMap.containsKey(t)){
				 int temp = myMap.get(t);
				 temp++;
				 myMap.replace(t, temp);
			 }else{
				 myMap.put(t, 1);
			 }
		 }
		 
		 for(int i = 0; i < s1.length();i++){
			 t = s2.charAt(i);
			 if(myMap.containsKey(t)){
				 int temp = myMap.get(t);
				 if(temp-->0){
					 myMap.replace(t, temp);
				 }else {
					 System.out.println("not a permutation");
					 return;
				 }
			 
			 
		 }else{
			 System.out.println("not a  permutation,has additional character");
			 return;
		 }

		 
		 }
		 System.out.println("It is a permutation");
		 
		 
	 }
	 
	public static void methodUsingArrays(String s1,String s2){
		  if(s1.length() != s2.length()){
	        	System.out.println("not a permutation");
	        	return;
	        }
		int length = s1.length();
		int[] countArray = new int[256];
		for(int i = 0; i < length;i++){
			countArray[s1.charAt(i)]++;
				}
		
				for(int i = 0; i < length;i++){
					if(countArray[s2.charAt(i)]-- <=0){
						System.out.println("not a permutation");
						return;
					}
				}
				System.out.println("It is a permutation");
	
		}
		
		
		
	
	 
	 
	 public static void methodUsingSort(String s1,String s2){
		 
	        if(s1.length() != s2.length()){
	        	System.out.println("not a permutation");
	        	return;
	        }
	        char[] temp1 = s1.toCharArray();
	        char[] temp2 = s2.toCharArray();
	        Arrays.sort(temp1);
	        Arrays.sort(temp2);
	        for(int i = 0; i < temp1.length;i++){
	        	if(temp1[i] != temp2[i]){
	        		System.out.println("not a permutation");
	        		return;
	        	}
	        }
	  		
	        System.out.println("It is a permutation");
	     }
	 }

