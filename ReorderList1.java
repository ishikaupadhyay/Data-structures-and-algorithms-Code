/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ///brute force :
        //transfer all into an ArrayList :
         
         if(head==null)return;

         ArrayList<ListNode> list=new ArrayList<>();

         ListNode curr=head;
         
         while(curr!=null){
            //adding into ArrayList from LL 
            list.add(curr);
            curr=curr.next;
         }


         //now main thing starts here :
         int i =0;
         int j=list.size()-1;

         while(i<j){
            list.get(i).next=list.get(j);
            i++;

            if(i==j)break ;

            list.get(j).next=list.get(i);
            j--;
         } 
         list.get(i).next=null;
    }
}
