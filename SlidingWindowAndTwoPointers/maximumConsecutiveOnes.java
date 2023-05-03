import java.io.*;
import java.util.*;

class Solution{
     public static int maxConsecutiveOnes(int[] nums, int n) {
		  int start = 0;
        int max = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 1) {
                max = Math.max(max, end-start+1);
            } else {
                start = end+1;
            }
        }
        return max;
		 // int count = 0;
		 // int totalCount = 0;
		 // for(int i = 0; i < n; i++) {
			// if(arr[i] == 1) {//
			// 	count++;//1
			// }
			// else {
			// 	count = 0;
			// }
			// 	totalCount = Math.max(totalCount, count);
		 // }
		 
		 // return totalCount > 0 ? totalCount : n;
	 }
        // Your code here
}

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.maxConsecutiveOnes(arr, n));
    }
}
