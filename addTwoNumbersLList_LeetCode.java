/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if( l1 == null && l2 == null){
            return null;
        }
        if(l1 != null){
           l1 =  reversedList(l1);}
        if(l2 != null){
          l2 = reversedList(l2);
        }
            //variables  used
            int a = 0; int b = 0;int sum = 0; int carry = 0;
            ListNode finalList = null;
            ListNode previous = finalList;
            //WHILE BEGINS
            while(l1 != null || l2 != null){
            //take l1 value
                if(l1 != null){
                    a = l1.val;
                    l1 = l1.next;
                    
                }else{
                    a = 0;
                }
                //take l2 value
                if(l2 != null){
                     b = l2.val;
                    l2 = l2.next;
                }else{
                    b = 0;
                    
                }
                //find sum,carry and send it to the new List
                sum = a + b + carry;
                if(sum/10 >= 1){
                    carry = 1;
                }else{
                    carry = 0;
                }
                sum = sum%10;
                
                // create new listnode with sum
                ListNode res = new ListNode(sum);
                if(finalList == null){
                    finalList = res;
                    previous = finalList;
                }else{
                    previous.next = res;
                    previous = previous.next;
                }
                
            } ///WHILE ENDS
        
         //there is a carry at the end
         if(carry == 1) { previous.next = new ListNode(carry); }
            
        
        return reversedList(finalList);
        
    }
  
    public ListNode reversedList(ListNode currNode ){ //3 - 4 - 5
        if(currNode.next == null){
            //System.out.println("currNode"+ currNode.val);
            return currNode;
        }else{
            ListNode nextNode = currNode.next;
            currNode .next = null;
            ListNode last =  reversedList(nextNode); 
            
                nextNode.next = currNode; 
            
           
            return last;
        }
        
        // Step1:  curr = 3 , next = 4 ; 
        // step2 : curr = 4  , next = 5;
        // step 3: curr = 5 , next = null; 
        // last = 5 ; 
        
      
        
    }
}
