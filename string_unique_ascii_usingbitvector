public class MyClass {
    public static void main(String args[]) {
        String input = "abcdefghijklamnopqrstuvwxyzA";
        //setter1 and setter 2 for lower case and uppper case letters
        int val1=0,val2=0,setter1=0,setter2 = 0;
        for(int i = 0; i < input.length();i++){ // iterate till end of string
            int val = input.charAt(i); // to check if it is a upper or lower case
           
           //if lower case
            if(val >= 97){ 
                val1 = input.charAt(i)-'a';//values are obtained from 0
            
            if((setter1 & (1 << val1)) > 0){ // if the bit is already set, it means it is a repetition
              System.out.println("not unique");
              return;
                
        }
        setter1 |= (1<< val1);  //bit setting is done here,every time
        }
        //if upper case
            if(val <97){
                val2 = input.charAt(i)-'A';
                System.out.println(val2);
            
         if((setter2 & (1 << val2)) > 0){ // if the bit is already set, it means it is a repetition
              System.out.println("not unique");
              return;
                
        }
        
        setter2 |= (1<< val2);// bit setting is done here,every time 
        
            }   
     
    }
    System.out.println("unique");
}
}
