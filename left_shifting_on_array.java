import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format
1<d<=n
1<=a<=10^6
1<=n<+10^5
The first line contains two space-separated integers denoting the respective values of  (the number of integers) and  (the number of left rotations you must perform).
The second line contains  space-separated integers describing the respective elements of the array's initial state.
Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
**/
public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        //shifts till end of array from the index of number of iteration
        int first = 0;
        int start = 0;
        int temp = 0;
        for(int i = k;i<n;i++){
            temp = a[i];
            a[i] = a[start];
            a[start] = temp;
            if(start == first){
                first = i;
            }
            start+=1;
        }
  // System.out.println(start + " " + first);
       // re arranges the last elements after the shift
        if(start!=first){
            int stop = 0;
            for(int i=first;i<n;i++){
                stop = i-1;

                while(stop >= start){
                   // System.out.println(stop );
                    temp = a[stop+1];
                    a[stop+1] = a[stop];
                    a[stop] = temp;
                    stop-=1;
                }
                start= start+1;
            }
        }

        return a;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
