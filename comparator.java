import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int i = 7;i >=0;i --){
            myList.add(i);
        }
       Collections.sort(myList,new myComparator());
       System.out.println(myList.toString());
    }
}

class myComparator implements Comparator<Integer>{

    public int compare(Integer a,Integer b){ // should not be int a and int b
        return a-b;
    }
}
