import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        Solution ob =new Solution();
        long ans = ob.maxSubarraySum(a,n);
        System.out.println(ans);
    }
}

class Solution {
	public long maxSubarraySum(int[] arr, int n) {
		long curSum = arr[0];
		long maxSum = arr[0];
		for(int i = 1; i < n; i++) {
			if(curSum < 0) {
				curSum = 0;
			}
			curSum += arr[i];
			maxSum = Math.max(curSum, maxSum);
		}
		return maxSum;
	}
}
// class Solution{
//     public long maxSubarraySum(int arr[],int n){
//         //Write code here
// 		long maxSum = Integer.MIN_VALUE;
//         long currTrain = Integer.MIN_VALUE;

//         for(int i = 0;i<arr.length;i++){
//             long ifIStartNewTrain = arr[i];
//             long ifISitWithCurrTrain = currTrain + arr[i];
// 			System.out.println(ifISitWithCurrTrain + "Hiif i sit with curr train");
//             currTrain = Math.max(ifIStartNewTrain, ifISitWithCurrTrain);
//             maxSum = Math.max(maxSum, currTrain);
//         }
//         return maxSum;
//     }
// }