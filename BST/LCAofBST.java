package BST;

import java.util.*;
//Least common ancestor of P and Q
class Node {
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree
{
    Node constructBST(int[]arr,int start,int end,Node root)
    {
        if(start>end)
            return null;
        int mid=(start+end)/2;

        if(root==null)
            root=new Node(arr[mid]);

        root.left=constructBST(arr,start,mid-1, root.left);
        root.right=constructBST(arr,mid+1,end, root.right);

        return root;
    }
}

public class LCAofBST {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt(); 
        }

        Arrays.sort(arr);
        Node root=null;
        BinarySearchTree bst=new BinarySearchTree();
        root=bst.constructBST(arr,0,n-1,root);
            
        Solution Accio = new Solution();
        Node ans=Accio.LCA(root,p,q);
        System.out.println(ans.data);
        sc.close();
        
    }
}

class Solution
{
	/*
 TC=> O(H), height of binary search tree
 SC=>O(H),height of binary search tree
 */
    Node LCA(Node root, int n1, int n2)
    {
		if(root == null || n1 == 0 || n2 == 0) {
			return null;
		}
		if(root.data > n1 && root.data > n2) {
			return LCA(root.left, n1, n2);
		}
		if(root.data < n1 && root.data < n2) {
			return LCA(root.right, n1, n2);
		}
		return root;
    }
}



