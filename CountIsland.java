import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int[][] array1 = {{0,0,0,0,0,0 },
                          {0,1,0,1,1,1 },
                          {1,0,1,0,1,0},
                          {0,1,1,0,0,0},
                          {0,0,0,0,0,0}};
        // Your code here!
        System.out.println(numberofIslands(array1));
        
    }
    
    public static int numberofIslands(int[][] array1){
        int count = 0;
        for(int row=0;row < array1.length;row++){
            for(int col = 0; col < array1[row].length;col++){
                if(array1[row][col] == 1){
                    checkNeightbours(row,col,array1);
                    count++;
                }    
            }
        }
        return count;
        
    }
    
    public static void checkNeightbours(int row,int col,int[][] array1){
        if(row >=0 && row < array1.length )
            {
                if(col >=0 && col < array1[row].length){
        if(array1[row][col] == 0){
            return;
        }else{
           array1[row][col] = 0; 
        
        checkNeightbours(row+1,col,array1);
        checkNeightbours(row-1,col,array1);
         checkNeightbours(row,col-1,array1);
       
        checkNeightbours(row,col+1,array1);
       
        }}  }
    }
}
