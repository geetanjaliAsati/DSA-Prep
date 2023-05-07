
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
    static void print(Node head){
        if(head==null){
            System.out.println("");
            return;
        }
        System.out.print(head.val+" ");
        print(head.next);
    }
    static Node swapkth(Node head,int k){
      /*  Node i = head,j = head, beg = null, end = null;
        while(k-- >1){
            i = i.next;
        }
        beg = i;
        while(i.next!=null){
            i = i.next;
            j = j.next;
        }
        end = j;
        int t = beg.val;
        beg.val = end.val;
        end.val = t;
        return head;
		*/

		 Node temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        int[] arr = new int[size];
        int j = 0;
        while(temp != null) {
            arr[j++] = temp.val;
            temp = temp.next;
        }
        
        int ptr1 = 0;
        int ptr2 = size - 1;
        for(int i = 0; i < k - 1; i++) {
            ptr1++;
            ptr2--;
        }
        
        int tempv = arr[ptr1];
        arr[ptr1] = arr[ptr2];
        arr[ptr2] = tempv;
        
        Node head1 = null, cur = null;
        for(int i = 0; i < size; i++) {
            if(cur == null) {
                Node t = new Node(arr[i]);
                head1 = t;
                cur = t;
            }
            else {
                Node t = new Node(arr[i]);
                cur.next = t;
                cur = cur.next;
            }
        }
        return head1;
    }
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        Node head = null, curr = null;
        for(int i=0;i<n;i++){
            if(curr==null){
                curr = new Node(sc.nextInt());
                head = curr;
            }
            else{
                Node t = new Node(sc.nextInt());
                curr.next = t;
                curr = curr.next;
            }
        }
        swapkth(head,k);
        print(head);

    }
}
