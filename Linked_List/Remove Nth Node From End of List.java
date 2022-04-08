*/
class Solution {
    public static int Count(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
            
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=Count(head);
        ListNode prev=null;
        ListNode curr=head;
        
        int k=count-n;
        if(head==null){
            return null;
        }
       if(count==n){
           head=head.next;
           return head;
       }
        while(k>1){
            k--;
            ListNode Next=curr.next;
            curr=Next;
            prev=curr;
        }
        curr.next=curr.next.next;
         return head;
      
    }
}