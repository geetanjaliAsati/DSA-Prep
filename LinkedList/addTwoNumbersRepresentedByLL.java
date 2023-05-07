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
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println("");
    }
    static Node addZeroes(Node head,int n){
        while(n-->0){
            Node t = new Node(0);
            t.next = head;
            head = t;
        }
        return head;
    }
    static int add(Node a,Node b){
        if(a==null&&b==null){
            return 0;
        }
        int carry = add(a.next,b.next);
        int sum = carry+a.val+b.val;
        a.val = sum%10;
        return sum/10;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt();
        Node a=null,b=null,curr=null;
        for(int i=0;i<n;i++){
            if(curr==null){
                curr = new Node(sc.nextInt());
                a = curr;
            }
            else{
                Node t = new Node(sc.nextInt());
                curr.next = t;
                curr = curr.next;
            }
        }
        curr=null;
        for(int i=0;i<m;i++){
            if(curr==null){
                curr = new Node(sc.nextInt());
                b = curr;
            }
            else{
                Node t = new Node(sc.nextInt());
                curr.next = t;
                curr = curr.next;
            }
        }
        int n1 = 0, n2=0;
        curr = a;
        while(curr!=null){
            n1++;
            curr = curr.next;
        }
        curr = b;
        while(curr!=null){
            n2++;
            curr = curr.next;
        }
        if(n1<=n2){
            a=addZeroes(a,n2-n1);
        }
        else{
            b=addZeroes(b,n1-n2);
        }
        // print(a);
        int res = add(a,b);
        if(res!=0){
            Node t = new Node(res);
            t.next = a;
            a = t;
        }
        print(a);
    }
}
// Time Complexity: O(M + N), where M and N are size of list 1 and list 2 respectively
// Auxiliary Space: O(1)