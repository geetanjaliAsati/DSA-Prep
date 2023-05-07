
import java.util.*;
import java.io.*;
class Node{
    int val;
    Node next;
    Node(){
        this.next=null;
    }
    Node(int x){
        this .val =x;
        this.next=null;
    }
}
public class Main {
    static void print(Node head){
        Node i = head;
        do{
            System.out.print(i.val+" ");
            i = i.next;
        }while(i!=head);
        System.out.println("");
    }
    static Node addToEnd(Node head,int x){
        Node i = head,j = null;
        do{
            j = i;
            i = i.next;
        }while(i!=head);
        Node t = new Node(x);
        j.next = t;
        t.next = head;
        return head;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null, curr = null;
        for(int i=0;i<n;i++){
            if(curr==null){
                curr = new Node(sc.nextInt());
                head = curr;
                curr.next = head;
            }
            else{
                Node t = new Node(sc.nextInt());
                curr.next = t;
                curr = curr.next;
                curr.next=head;
            }
        }

        int x = sc.nextInt();
        head = addToEnd(head,x);
        print(head);
    }
}