public class MyClass {
    public static void main(String args[]) {
       String input = "Heloasdf";
       if(input.length() > 256 ){
        System.out.println("non Unique");
       return;
       }
       boolean [] arrayIndicator = new boolean[256]; // this is an array which will be set to true for  characters iterated through the string
       for(int i = 0;i<input.length();i++){
           int index = input.charAt(i);
            if(arrayIndicator[index]== false){  
                arrayIndicator[index] = true;
            }else {                                 // for a given character in the loop if the array indicator is already true , then the string is not unique
                System.out.println("Contains non unique characters");
                return;
                
            }
          
       }
        System.out.println("The given string is unique");
       
    }
}
