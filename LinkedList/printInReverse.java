import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
public class Main {
	
    public static void reverse(Node head){
    Node newHead = reverseListInt(head, null);
	Node temp = newHead;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	 static Node reverseListInt(Node head, Node newHead) {

        //Recursive approach TC=>O(N)| SC=>O(N), cost made by recursive calls
	    if (head == null)
	        return newHead;
	    Node next = head.next;
	    head.next = newHead;
	    return reverseListInt(next, head);
	}
   


 //    public static void reverse(Node head){
 //        // Iterative code, TC=>O(N), SC=>O(1)
	// 	 Node newHead = null;
 //    while (head != null) {
 //        Node next = head.next;
 //        head.next = newHead;
 //        newHead = head;
 //        head = next;
 //    }
	// // return newHead;
	// Node temp = newHead;
	// while(temp != null) {
	// 	System.out.print(temp.data + " ");
	// 	temp = temp.next;
	// }
 //    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        reverse(list.head);
        System.out.println("");
    }

    public ListNode reverseList(ListNode head) {
        //Recursive implementation without using the wrapper function
        if(head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}