package easy;
/**
 * 206. Reverse Linked List
 * Reverse a singly linked list.
 */

// Definition for singly-linked list.
public class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}


class Solution {
  //使用recursive解
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null)
      return head;
    ListNode node = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return node;
  }
  
  //使用iterative解
  //TDOO:有更精簡的寫法 while(head.next!=null)
  public ListNode reverseList2(ListNode head) {
    ListNode temp = null;
    ListNode pre = null;
    while( head!=null ) {
      temp = head;
      head = head.next;
      temp.next = pre;
      pre = temp;
    }
    return temp;
    
  }
}
