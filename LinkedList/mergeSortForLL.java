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
    static Node[] split(Node head){
        Node slow = head,fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node t = slow.next;
        slow.next = null;
        Node[] res = {head,t};
        return res;
    }
    static Node merge(Node a,Node b){
        Node i = a, j = b,head = null,curr=null;
        while(i!=null&&j!=null){
            if(i.val<=j.val){
                if(head==null){
                    head = i;
                    curr = i;
                }
                else{
                    curr.next = i;
                    curr = curr.next;
                }
                i = i.next;
            }
            else{
                if(head==null){
                    head = j;
                    curr = j;
                }
                else{
                    curr.next = j;
                    curr = curr.next;
                }
                j = j.next;
            }
        }
        while(i!=null){
            if(head==null){
                    head = i;
                    curr = i;
                }
                else{
                    curr.next = i;
                    curr = curr.next;
                }
                i = i.next;
        }
        while(j!=null){
            if(head==null){
                    head = j;
                    curr = j;
                }
                else{
                    curr.next = j;
                    curr = curr.next;
                }
                j = j.next;
        }
        curr.next = null;
        return head;

    }
    static Node mergeSort(Node head){
        if(head==null||head.next==null){
            return head;
        }

        //Divide the LL into two halves, one's head is i and other's is j
        Node[] res = split(head);
        Node i = res[0],j=res[1];
        
        //Sort the two smaller LLs separately
        i = mergeSort(i);
        j = mergeSort(j);

        //Merge the sorted smaller LLs into one LL, with head as head
        head = merge(i,j);

        //return head of the sorted LL
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
            }
            else{
                Node t = new Node(sc.nextInt());
                curr.next = t;
                curr = curr.next;
            }
        }
        head = mergeSort(head);
        print(head);
    }
}