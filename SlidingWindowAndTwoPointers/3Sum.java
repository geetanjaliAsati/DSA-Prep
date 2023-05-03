import java.io.*;
import java.util.*;



class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(nums);
        //Sort all lists inside the list first
        for (int i = 0; i < result.size(); i++) {
			
            Collections.sort(result.get(i));
        }
        //Sort the list
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
				
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i) < l2.get(i)) {
						System.out.println(l1.get(i));
						return -1;
					}
                    else if (l1.get(i) > l2.get(i)){ 
													// System.out.println(l1.get(i));
													// System.out.println(l2.get(i));
						return 1;
												   }
                }
                return 0;
            }
        });
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		 Arrays.sort(nums); //sorting array so that we can use two pointers approch to get target sum;
List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 &&nums[i]!=nums[i-1]))
           { int target = -nums[i];
            int k=nums.length-1;
            int j=i+1;
            while(j<k){
                if(nums[j]+nums[k]==target){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1]) j++;
                     while(j<k && nums[k]==nums[k-1]) k--;
                    // System.out.println("how is is going to next iteration" + j);
					j++;
					k--;
                }
                else if(nums[j]+nums[k]>target){
					// System.out.println(j + "j kya");
                    k--;
                }else{
                    j++;
                }


            }}
        }
        return result;
        
		// for(int i = 0; i < n - 2; i++) {
		// 	for(int j = i + 1; j < n - 1; j++) {
		// 		for(int k = j + 1; k < n; k++) {
		// 			if(nums[i] + nums[j] + nums[k] == 0){
		// 				List<Integer> list = new ArrayList<>();
		// 				list.add(nums[i]);
		// 				list.add(nums[j]);
		// 				list.add(nums[k]);
		// 				if(!resList.contains(list)) {
		// 					resList.add(list);
		// 				}
		// 			}
		// 		}
		// 	}
		// }
		// return resList;
    }
}