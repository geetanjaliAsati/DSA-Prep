package LinkedList;

/*if we have even no. of nodes, there would be two middle nodes then we have to delete the second node

If single node is given then return the head which containing the value -1
*/

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class Main{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            head = g.deleteMid(head);
            printList(head); 
            t--;
        }
		sc.close();
    } 
} 
   //I have written here different-2 approaches to solve the problem
class Solution{
    Node deleteMid(Node head){
		if (head == null || head.next == null) return null;
        Node slow = head, fast = head.next.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    Node deleteeMid(Node head){
		// Time: O(n), space: O(1), where n = # of the nodes.
		 if(head == null || head.next == null) return null;
        Node prev = null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
    Node deeleteMid(Node head){
        Node dummy = new Node(-1), prev = dummy, slow = head, fast = head;
       prev.next = head;
       while (fast != null && fast.next != null) {  
           prev = slow;
           slow = slow.next; 
           fast = fast.next.next;
       }
       prev.next = slow.next;
       return dummy.next; 
          // Node dummy = new Node(-1), slow = dummy, fast = dummy; 
    //    dummy.next = head;
    //    while (fast.next != null && fast.next.next != null) {  
    //        slow = slow.next; 
    //        fast = fast.next.next;
    //    }
    //    slow.next = slow.next.next;
    //    return dummy.next; 
   }
}