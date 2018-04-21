public class MyClass {
    public static void main(String args[]) {
        String s1 = "abccd";
        String s2 = "dccba";
        int length = s1.length()-1;
        if(s1.length() != s2.length()){
            System.out.println("The strings are not a palindrome");
        }
        for(int i = 0;i< s2.length();i++){
            if(i<length){
                if(s1.charAt(i) != s2.charAt(length--)){
                    System.out.println("The strings are not a palindrome");
                    return;
                }
            }
            
        }
        System.out.println(" a palindrome");
        

    }
}
