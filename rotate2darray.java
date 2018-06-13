package anjuPractice;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArray{ // rotates array by one position
	    public static void main(String args[ ]){
	    	
	    	//System.out.println("Enter the size of an array");
	    	/**Scanner sc = new Scanner(System.in);
	    	int size = sc.nextInt();
	    	int[][] cubeArray = new int[size][size];
	    	for(int i = 0 ; i<size;i++){
	    		System.out.println("Enter a row");
	    		for(int j = 0; j <size;j++){
	    			cubeArray[i][j] = sc.nextInt();
	    		}	    		
	    	}**/
	    	int size = 5           ;
	    	int[][] cubeArray = new int[size][size];
	    	int t = 0;
	    	for(int i = 0 ; i< size;i++){ // initialising the array
	    		
	    		for(int j = 0; j < size;j++){
	    			cubeArray[i][j] = t++;
	    		}
	    	}
	    	System.out.println(Arrays.deepToString(cubeArray));
	   
	    	int i = 0,j=0;
	    	int layer = (size/2)+(size%2); // go through each layer
	    	int iteration = 0;
	    	while(iteration< layer){
	    		int temp = cubeArray[i][j];
		    	// shift up
		    	while(i+1 <size) { cubeArray[i][j] = cubeArray[i+1][j];i++;}
		    	//shift left
		    	while(j+1 < size){ cubeArray[i][j] = cubeArray[i][j+1];j++;}
		    	//shift down
		    	while(i > iteration){cubeArray[i][j] = cubeArray[i-1][j];i--;}
		    	//shift right
		    	while(j-1> iteration){ cubeArray[i][j] = cubeArray[i][j-1];j--;}
		    	cubeArray[i][j] = temp;
		    	iteration++;
		    	i = iteration;
		    	j = iteration;
		    	size = size-1;
	    	}
	    	
	    	System.out.println(Arrays.deepToString(cubeArray));
	    	
	    }
}
	   

