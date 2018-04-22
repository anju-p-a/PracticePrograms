package anjuPractice;
public class stringCompression {
	 public static void main(String []args){
		 String s1 = "zxxab";
		 StringBuilder sb = new StringBuilder();
		 if(isNotCompressable(s1)){
			 System.out.println(s1+ " it was not compressable");
			 return;
		 }
		 
		 for(int i = 0;i<s1.length()-1;i++){	
			 if(s1.charAt(i) == s1.charAt(i+1)){			 
			 }else{
				 sb.append(s1.charAt(i));
			 }
		 }
		 
		 System.out.println(sb);
		
		
	     	       
	}
	 
	 public static boolean isNotCompressable(String s1){
		 int count = 0;
		 for (int i = 0; i < s1.length()-1;i++){
			 if(s1.charAt(i) != s1.charAt(i+1)){
				 count++;
			 }
						 
		 }
		 if(count+1 == s1.length()){
			 return true;
		 }else{
			 return false;
		 }

		 
	 }
	 
	 
	 }
