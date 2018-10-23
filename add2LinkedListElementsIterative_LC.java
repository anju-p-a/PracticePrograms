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
        if(l1 == null || l2 == null){
            return null;
        }
        ListNode l3 = new ListNode((l1.val + l2.val )% 10); 
        ListNode l4 = l3;
        int a = 0; int b = 0;int carry = (l1.val+l2.val)/10 >=1 ? 1: 0;
        while(l1.next != null || l2.next != null){ //3 - 4 - 5  // 4-9 // 7 - 
            // 4 , 9 ,0 
            if(l1.next != null){
                a = l1.next.val;
                l1 = l1.next;
            }else{
                a = 0;
            }
            if(l2.next != null){
                b = l2.next.val;
                l2 = l2.next;
            }else{
                b = 0;
            }
            int c = (a + b + carry) % 10;
            if( (a + b + carry) /10 >=1 ){
                carry = 1;
            }else{
                carry = 0;
            }
            
                l3.next = new ListNode(c);
                l3=l3.next;
            
            
        }
        if(carry == 1){
            l3.next = new ListNode(carry);
        }
        return l4;
        
    }
}
