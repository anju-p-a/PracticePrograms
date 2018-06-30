package anjuPractice;
import java.util.Arrays;

public class stackUsingArrays{
	public static void main(String[] args){
		int[] array1 = new int[60];
		int[] Pointers = {-1,-1,-1};
		int count = 0;
		
		push(1,array1,Pointers,1);
		push(2,array1,Pointers,1);

		
		pop(array1,Pointers,1);
		pop(array1,Pointers,1);
		for(int i = 0; i< 60;i++){
			System.out.println(array1[i]);
		}
		System.out.println(Arrays.toString(Pointers));
		
		
		
	}
	
	public static void push(int element,int[] array1, int[] Pointers, int stackType){
		int boundary = (array1.length /3) *(stackType); 
		int index = Pointers[stackType-1];
		if(index < boundary){
			Pointers[stackType-1]++;
			array1[boundary - 20 + Pointers[stackType -1]] = element;
		}
	}
	
	
	public static int pop(int[] array1, int[] Pointers, int stackType){
		int boundary = (array1.length /3) *(stackType); 
		int a = 0;
		int index = Pointers[stackType-1];
		if(index >= boundary-(array1.length /3)){
			Pointers[stackType-1]--;
			a = array1[boundary - 20 + Pointers[stackType -1]];
			 array1[boundary - 20 + Pointers[stackType -1]] = 0;
		}
		return a;
	}
	
	public static int peek(int[] array1, int[] Pointers, int stackType,int position){
		int boundary = (array1.length /3) *(stackType); 
		int index = Pointers[stackType-1];
		if( position < Pointers[stackType-1] %20){
			return array1[boundary-20+position];
		}
		return 0;
			
	}
}
