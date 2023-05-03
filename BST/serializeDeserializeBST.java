package BST;

import java.util.*;

public class serializeDeserializeBST {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Encodes a tree to a single string.
	//convert binary search tree into an array 
		public static String res = "";
    public static String serialize(TreeNode root) {
        //Write code here
		if(root == null ) {
			return res += -1 + " ";
		}
		res += root.val + " ";
		serialize(root.left);
		serialize(root.right);
		return res;
    }

    // Decodes your encoded data to tree.
	//convert array to the binary search tree and returns it
    public static TreeNode deserialize(String str) {
        //Write code here
		String[] strArr = str.split("\\s");
		int[] arr = new int[strArr.length];
		for(int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(strArr[i]);
		int[] idx = new int[1];
		TreeNode root = convertArrayIntoBST(arr, idx);
		return root;
    }

	public static TreeNode convertArrayIntoBST(int[] arr,int[] idx) {
		if(idx[0] > arr.length || arr[idx[0]] == -1) {
			idx[0]++;
			return null;
		}
		TreeNode node = new TreeNode(arr[idx[0]++]);
		node.left = convertArrayIntoBST(arr, idx);
		node.right = convertArrayIntoBST(arr, idx);
		return node;
	}
    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {//arr[anyValue] = -1 the node don't have child can be any left or right
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);
        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        String s = serialize(root);
        display(deserialize(s));
    }

    public static void main(String[] args) {
        solve();
    }
}