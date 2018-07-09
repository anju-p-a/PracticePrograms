import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in); //Input format is two positive numbers seperated by space
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        sc.close();
        if(a > b){
           result = findGCD( a,  b);
        }else{
            result = findGCD( b,  a);

        }
        
        System.out.println(result);
    }
    
    public static int findGCD(int a,int b){
        
        int r = a%b;    
        if(r != 0){
           b = findGCD(b,r);  
        } 
            return b;
        
        
        
        
        
    }
    
    
}
