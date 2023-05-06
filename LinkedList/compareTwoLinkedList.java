
import java.io.*;
import java.util.*;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        next = null;
    }
}

class LinkedList {
    Node head;

    void addingNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        LinkedList ll1 = new LinkedList(), ll2 = new LinkedList();
        for (int i = 0; i < m; i++) {
            ll1.addingNode(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            ll2.addingNode(sc.nextInt());
        }
        Node h1 = ll1.head, h2 = ll2.head;
        if (areIdenticalRecur(h1, h2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        // Iterative approach
        /*
         * TC is O(min(m, n)), minimum of the size of two linked list
         * SC=>O(1),
         */
        // while(h1 != null || h2 != null) {
        // if(h1 == null || h2 == null || h1.value != h2.value) {
        // System.out.println(0);
        // return;
        // }
        // h1 = h1.next;
        // h2 = h2.next;
        // }
        // System.out.println(1);
    }

    static boolean areIdenticalRecur(Node h1, Node h2) {
        /*
         * Recursive approach
         * Time Complexity: O(N). Here, N is the length of the smaller list among a and
         * b
         * Auxiliary Space: O(N). The extra space is used in the recursion call stack.
         */
        if (h1 == null && h2 == null) {
            return true;// both ll are empty lists
        }
        if (h1 != null && h2 != null) {
            return (h1.value == h2.value) && areIdenticalRecur(h1.next, h2.next);
        }
        return false;

    }
}