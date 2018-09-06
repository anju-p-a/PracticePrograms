import java.util.*;

public class Main {
   public static void main(String[] args){
    
       System.out.println(findComplement(2));
   }

public static int findComplement(int num) {
        // 
        int shiftBY = 0;
        int temp;
        temp = ~num;
        temp = ~temp + 1; // finding the positive number of the compliment
        if(num != 1){
        shiftBY = (int)(Math.log(temp)/Math.log(2))+1; // finding the number of digits, of the compliment
        }else{
            shiftBY = 1;//if it is one only shift by one place
        }
        System.out.println(shiftBY);
         
      temp  = ~num & ~(-1<<(shiftBY));  //~(-1<<shiftBY) is the mask to eliminate the 1's after the negate
        //num = num + 1;
        return temp;    
    }
}
