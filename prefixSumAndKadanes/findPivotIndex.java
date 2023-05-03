import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {
		
		int n = nums.length;
		
		int[] prefixLeft = new int[n];
		int[] prefixRight = new int[n];

		prefixLeft[0] = nums[0];
		prefixRight[n - 1] = nums[n - 1];
		
		for(int i = 1; i < n; i++) {
			prefixLeft[i] = prefixLeft[i - 1] + nums[i];
		}

		for(int i = n - 2; i >= 0; i--) {
			prefixRight[i] = prefixRight[i + 1] + nums[i];
		}

		for(int i = 0; i < n; i++) {
			if(prefixRight[i] == prefixLeft[i]) {
				return i;
			}
		}
		
		return -1;
  //          int total = 0, sum = 0;
  //       for (int num : nums) total += num;
  //       for (int i = 0; i < nums.length; ++i){
  //           if (sum * 2 == total - nums[i]) return i;
		// 	sum += nums[i];
			
		// }
  //       return -1;  
    }
}
/*
total= 28
sum=11

*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.pivotIndex(arr);
        System.out.println(result);
        sc.close();
    }
}