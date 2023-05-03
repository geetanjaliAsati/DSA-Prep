import java.util.*;
/*
Given arr, k
every operation pick two numbers from array whose
sum equals k and remove them from the array
Return maximum no. of operations
*/
class Solution {
    public int maxOperations(int[] nums, int k) {
		  Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int res = k - nums[i];
            if(map.containsKey(res)){
                count++;
                if(map.get(res) == 1) map.remove(res);
                else map.put(res, map.get(res) - 1);
            }
            else{
				System.out.println(map + "Map at i" + i);
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
  //       //Write code here
		// Arrays.sort(nums);
		// //1 3 3 3 4
		// //0 1 2 3 4
		// int n = nums.length;
		// int i = 0;
		// int j = n - 1;
		// int oprCount = 0;
		// while(i < j) {//1 < 3
		// 	if(nums[i] + nums[j] == k) {//1 + 4 == 6
		// 		oprCount++;
		// 		i++;
		// 		j--;
		// 	}
		// 	else if(nums[i] + nums[j] < k) {
		// 		i++;
		// 	}
		// 	else {
		// 		j--;
		// 	}
		// }
		// return oprCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k;
        k = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.maxOperations(arr, k);
        System.out.println(result);
        sc.close();
    }
}