import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }
        int x = input.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.countElements(arr1, arr2, m, n, x));
    }
}

class Solution {
	public int countElements(int arr1[],
         int arr2[], int m, int n, int x)
    {
        int count = 0;
        int l = 0, r = n - 1;
         
        while (l < m && r >= 0)
        {
            
            if ((arr1[l] + arr2[r]) == x)
            {
                l++; r--;
                count++;        
            }
             
            else if ((arr1[l] + arr2[r]) < x)
                l++;
                 
         
            else
                r--;
        }
       
        return count;
    }
}
	// public boolean findPair(int[] brr,int n, int tar) {
	// 	int lo = 0;
	// 	int hi = n - 1;
	// 	while(lo <= hi){
	// 		int mid = (lo + hi) / 2;
	// 		if(brr[mid] == tar) {
	// 			return true;
	// 		}
	// 		else if(brr[mid] < tar) {
	// 			lo = mid + 1;
	// 		}
	// 		else {
	// 			hi = mid - 1;
	// 		}
	// 	}
	// 	return false;
	// }
  //   public int countElements(int[] arr1, int[] arr2, int m, int n, int x) {
		// int count = 0;
//TC: mlogn, where m is the length of arr1 and n is the length of arr2
		// for(int i = 0; i < m; i++) {
		// 	int tar = x - arr1[i];
		// 	if(findPair(arr2, n, tar)) {
		// 		count++;
		// 	}
		// }
		
		// int count = 0;
		// for(int i = 0; i < m; i++) {//0<4
			  
		// 	  for(int j = 0; j < n; j++) {//0<4
				  
		// 			if(arr1[i] + arr2[j] == x) {//
		// 				count++;
		// 			}
		// 	  }
		//   }
	// 	return count;
	// }
// }