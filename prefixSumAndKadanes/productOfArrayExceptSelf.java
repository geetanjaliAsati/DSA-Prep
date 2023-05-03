import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	  public static void main(String[] args) throws Throwable {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int nums[]=new int[n];
	        for(int i = 0; i < n; i++)
	        {
	            nums[i] = sc.nextInt();
	        }
	        Solution obj = new Solution();
	        int ans[] = obj.ProductOfArrayExceptSelf(n,nums);
	        for(int i=0; i<n ; i++){
	            System.out.print(ans[i] + " ");
	        }
	    }
}
class Solution{
  public int[] ProductOfArrayExceptSelf(int n, int[] arr){
        //write code here
	  int[] res = new int[n];
	  int[] left = new int[n];
	  int[] right = new int[n];
		left[0] = arr[0];
	  right[n - 1] = arr[n - 1];
	  for(int i = 1; i < n; i++) {
		  left[i] = left[i - 1] * arr[i];
	  }
	  for(int j = n - 2; j >= 0; j--) {
		  right[j] = right[j + 1] * arr[j];
	  }
	  res[0] = right[1];
	  res[n - 1] = left[n - 2];
	  for(int i = 1; i < n - 1; i++) {
		  res[i] = left[i - 1] * right[i + 1];
	  }
	  return res;
	  // long[] ans = new long[n];
	  // Arrays.fill(ans, 1);
	  // for(int i = 0; i < n; i++) {
		 //  for(int j = 0; j < n; j++) {
			//   if( i != j) {
			// 	  ans[i] *= arr[j];
			//   }
		 //  }
	  // }
	  // return ans;
}
}