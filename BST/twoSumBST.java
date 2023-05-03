package BST;

import java.util.*;

  import java.util.*;

class Node {
    int val;
    Node left, right;
    public Node(int item){
        val = item;
        left = right = null;
    }
}

class BinarySearchTree
{
    Node constructBST(int[]arr,int start,int end,Node root)
    {
        if(start>end)return null;
        int mid=(start+end)/2;
        if(root==null)root=new Node(arr[mid]);
        root.left=constructBST(arr,start,mid-1, root.left);
        root.right=constructBST(arr,mid+1,end, root.right);
        return root;
    }
}

class BSTIterator {
    private Stack<Node> st = new Stack<>();
    private boolean reverse;
    BSTIterator(Node root, boolean reverse) {
        this.reverse = reverse;
        push(root);
    }
    int next() {
        Node top = st.pop();
        push(!reverse ? top.right : top.left);
        return top.val;
    }
    private void push(Node root) {
        while (root != null) {
            st.push(root);
            root = !reverse ? root.left : root.right;
        }
    }
}

class Solution{
    public static boolean checkTarget(Node root, int k){
        BSTIterator leftItr = new BSTIterator(root, false);
        BSTIterator rightItr = new BSTIterator(root, true);

        int left = leftItr.next(), right = rightItr.next();
        while (left < right) {
            if (left + right == k) return true;
            if (left + right < k)
                left = leftItr.next();
            else
                right = rightItr.next();
        }
        return false;
    }
}

public class twoSumBST {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); 
        }
        Node root=null;
        BinarySearchTree bst=new BinarySearchTree();
        root=bst.constructBST(arr,0,n-1,root);
        Solution A = new Solution();
        boolean ans = A.checkTarget(root,k);
        if(ans==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}