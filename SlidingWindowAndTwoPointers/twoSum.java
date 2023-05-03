import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static int[] twoSum(int[] arr, int target) {
		int n = arr.length;
		// int[] ans = new int[2];
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(hm.containsKey(target - arr[i])) {
				// ans[1] = i + 1;
				// ans[0] = hm.get(target - arr[i]) + 1;
				// return ans;
				return new int[] { hm.get(target - arr[i]) + 1, i + 1};
			}
			hm.put(arr[i], i);
		}
		return null;
		// return new int[] {};
// 		int[] res = new int[2];
// 		for(int i = 0; i < n - 1; i++) {
// 			for(int j = i + 1; j < n; j++) {
// 				if(arr[i] + arr[j] == target) {
// 					res[0] = i + 1;
// 					res[1] = j + 1;
// 					return res;
// 				}
// 			}
// 		}
// return res;
		// int n = arr.length;
  //       int l = 0;
		// int r = n-1;
		// int[] ans = new int[2];
		// while(l<r){
		// 	int sum = arr[l] + arr[r];
		// 	if(sum == target){
		// 		//just to convert to one-indexed doing l+1 and r+1
		// 		ans[0] = l+1;
		// 		ans[1] = r+1;
		// 			return ans;
		// 	}else if(sum < target) l++;
		// 	else r--;
		// }
		// return ans; //dummy
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
    }
}


