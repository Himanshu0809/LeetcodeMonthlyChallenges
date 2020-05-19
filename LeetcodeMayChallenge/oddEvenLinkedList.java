package LeetcodeMayChallenge;

//import DataStructures.LinkedList.linkedList;

public class oddEvenLinkedList {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		linkedList list1 =new linkedList();
//		list1.addLast(1);
//		list1.addLast(2);
//		list1.addLast(3);
//		list1.addLast(4);
//		list1.addLast(5);
//
//		//function call statement 
//	}

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
//	class Solution {
//	    public ListNode oddEvenList(ListNode head) {
//	        if(head==null)
//	            return null;
//	        if(head.next==null||head.next.next==null){
//	            return head;
//	        }
//	        ListNode slow=head;
//	        ListNode fast=head.next;
//	        ListNode evenHead=fast;
//	        while(slow.next!=null&&fast.next!=null){
//	            slow.next=fast.next;
//	            slow=slow.next;
//	            fast.next=slow.next;
//	            fast=fast.next;
//	            
//	        }
//	        slow.next=evenHead;
//	        return head;
//	    }
//	}
}
