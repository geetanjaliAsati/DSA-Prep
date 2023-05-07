
import java.util.*;
import java.io.*;

class Node{
    int val;
    Node next;
    Node(){
        this.next=null;
    }
    Node(int x){
        this.val = x;
        this.next=null;
    }
}

public class Main {
    static Node reverse(Node head){
		//Recursive way to reverse the linked list
        // if(head==null||head.next==null){
        //     return head;
        // }
        // Node t = reverse(head.next);
        // Node curr = t;
        // while(curr.next!=null){
        //     curr = curr.next;
        // }
        // curr.next = head;
        // head.next=null;
        // return t;

		//Iterative way to reverse the linked list
		Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    static void print(Node head){
        if(head==null){
            System.out.println("");
            return;
        }
        System.out.print(head.val+" ");
        print(head.next);
    }
    static void addOne(Node head){
// 	Time Complexity: O(n), Here n is the number of nodes in the linked list.
// Auxiliary Space: O(1), As constant extra space is used.


        Node curr = head;
        int carry = 1;
        while(curr!=null&&carry>0){
            int sum = curr.val+carry;
            curr.val = sum%10;
            carry = sum/10;
            curr= curr.next;
        }
        if(carry>0){
            curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            Node t = new Node(1);
            curr.next = t;
        }    
    }
    static int add(Node head){
// 	Time Complexity: O(n), Here n is the number of nodes in the linked list.
// Auxiliary Space: O(n),The extra space is used in recursion call stack.
        if(head==null){
            return 1;
        }
        int carry = add(head.next);
        int sum = (carry+head.val);
        head.val = sum%10;
		System.out.println((sum / 10 )+ "Kya aa raha sum / 10  " + sum );
        return sum/10;
    }
    public static void main(String args[]) {
        Node head=null,curr=null;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            if(curr==null){
                head = new Node(s.charAt(i)-'0');
                curr = head;
            }
            else{
                Node temp = new Node(s.charAt(i)-'0');
                curr.next = temp;
                curr = curr.next;
            }
        }
        // print(head);
        head = reverse(head);
        addOne(head);
        head = reverse(head);
        print(head);
        // int carry = add(head);
        // if(carry>0){
        //     Node t = new Node(1);
        //     t.next = head;
        //     head = t;
        // }
        // print(head);
    }
}

