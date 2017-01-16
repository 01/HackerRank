/**************DAY 24: More Linked Lists  *****************/
/*https://www.hackerrank.com/challenges/30-linked-list-deletion*/

    public static Node removeDuplicates(Node head) {
      Node ptr = head;
      Node tracker = null;
      if(ptr == null) return null;
      tracker = ptr;
      while(tracker!=null){
          if(tracker.data ==ptr.data){
              tracker=tracker.next;
          }
          else {
              ptr.next = tracker;
              ptr = ptr.next; 
          }
      }
        ptr.next=null;
        return head;

    }