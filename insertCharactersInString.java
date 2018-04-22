package anjuPractice;
import java.util.Arrays;
import java.util.HashMap;
public class insertCharactersInString {
	 public static void main(String []args){
		 String s1 = "zx ca  b ";
		 char[] temp = new char[20];//sufficient enough to include the old string
		 for(int i = 0 ; i< s1.length();i++){
			 temp[i] = s1.charAt(i);
		 }
		 insertSpace(s1);
		 insertPatternInSpacesOfArray(temp,s1.length());
	     	       
	}
	 
	 public static void insertPatternInSpacesOfArray(char[] myString,int length){ 
		 int count = 0;
		 for(int i=0;i<length;i++){
			 if(myString[i] == ' '){
				 count++;
			 }
		 }
		 //find the new length after adding the characters
		 int newlength = count*2+ length-1;
		 for(int i = length-1;i >=0;i--){ // insert the characters backwards
			 if(myString[i] == ' '){
				 myString[newlength--] = '0';
				 myString[newlength--] = '2';
				 myString[newlength--] = '%';
				 			 
			 }else{
				 myString[newlength--] = myString[i];
			 }
		 }
		 System.out.println(Arrays.toString(myString));
		 
	 }

	 public static void insertSpace(String s1){ //copying from string to array with the spaces 
		 int count = 0;
		 for(int i=0;i<s1.length();i++){
			 if(s1.charAt(i) == ' '){
				 count++;
			 }
		 }
		 
		 int newLength = count*20 + s1.length() - count+1;
		// System.out.println(newLength);
		 char[] temp = new char[newLength];
		 int index = 0;
		 count = 0;
		 for(int i=0;i<s1.length() && index < newLength-1;i++){
			 if(s1.charAt(i) == ' '){
				 while(count < 20 && index < newLength-1 ){
					 temp[index] = ' ';
					 index++;
					 count++;
				 }
				 count = 0;
			 }else{
				 temp[index] = s1.charAt(i);
				 index++;
			 }
			 
		 }
		 s1 = new String(temp);
		 System.out.println(s1);
	      
	 }
	 }
