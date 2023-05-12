import java.util.*;
//LEETCODE PAR DEKHO ISHKE AUR SOLUTIONS
class Solution {
    public void allDuplicates(int n1, int[] nums) {
        // Write Your code here.
		// Arrays.sort(arr);
		// for(int i = 0; i < n - 1; i++) {
			
		// 		if(arr[i] == arr[i + 1]) {
		// 			System.out.print(arr[i] + " ");
		// 		}
			
		// }

		List<Integer> newList = new ArrayList<Integer>();     // creating a new List
    for(int i=0;i<nums.length;i++){  
       int index =Math.abs(nums[i]);             // Taking the absolute value to find index
       if(nums[index-1] >0){ 
                nums[index-1] = - nums[index-1];
        }else{
               // If it is not greater than 0 (i.e) negative then the number is a duplicate
                newList.add(Math.abs(nums[i])); 
        }
    }
    System.out.print(newList);

		// Approach 2 : O(N)
		// Map<Integer, Integer> map = new HashMap<>();
  //       for (int n : nums) {
  //           map.put(n, map.getOrDefault(n, 0) + 1);
		// 	// System.out.println(map + "after putting");
  //       }

  //       for (int n : nums) {
  //           if (map.get(n) == 1) {
  //               map.remove(n);
  //           }
  //       }
		// Set<Integer> setKeys = map.keySet();
  //       for(Integer key : setKeys){
  //           System.out.print( key + " ");
  //       }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.allDuplicates(n, arr);
        sc.close();
    }
}

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=  new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        int i = 0;
        int n = nums.length;
        while(i<n){ //traverse the array  till the end
            if(nums[i] == i+1){  // if number stays at it's supposed position, just continue
                i++;
                continue;
            }
            int num = nums[i];
            if(num == -1){ // if the duplicate number in that position is already found continue
                i++;
                continue;
            }
            if(nums[num-1] == num){ // if current  num is equals to the number at supposed position,
                res.add(num);       // then it is duplicate.
                nums[i] = -1;       // mark this position, in order to denote that duplicate has found
                i++;
                continue;
            }
            swap(nums, i, num-1);  // if current numbers supposed position is occupied by another number swap and consider that number
        }
        return res;
    }
    
    public void swap(int nums[], int i ,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}