import java.util.*;
/*
First row last column ban ja rahi hai
second row second last column ban ja rahi hai
third row third last column ban ja rahi hai
fourth row fourth last column ban ja rahi hai and
so on...
*/
class Solution {
    public void MatRotateRecur(int[][] mat) {
        // Write your code here
		int n = mat.length;
		//Transpose the matrix
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}

		//reverse the row elements
		for(int i = 0; i < n; i++) {
			int li = 0;
			int ri = n - 1;
			while(li < ri) {
				int temp = mat[i][li];
				mat[i][li] = mat[i][ri];
				mat[i][ri] = temp;
				li++;
				ri--;
			}
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.MatRotateRecur(mat);

        for(int[] ar : mat) {
            for(int a : ar)
                System.out.print(a + " ");
            System.out.println();
        }
    }
}