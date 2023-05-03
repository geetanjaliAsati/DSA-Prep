import java.util.Scanner;

class Solution{
    static int findLengthOfSmallestSubarray(int[] nums, int s) {
        //Write your code here
		// BRUTE FORCE APPROACH O(n^2)
		// int n = arr.length;
		// int count = Integer.MAX_VALUE;
		// for(int i = 0; i < n; i++) {
		// 	int sum = 0;
		// 	for(int j = i; j < n; j++) {
		// 		sum += arr[j];
		// 		if(sum >= k) {
		// 			count = Math.min(count, j - i + 1);
		// 			break;//because all given elements is positive and 
		// if we get sum equal and greater to k so there is no point to add 
		// another element into the sum because we just need to find 
		// the find element who satisfies the condition
		// 		}
		// 	}
		// }
		// return count == Integer.MAX_VALUE ? 0 : count;


		  int sum = 0, from = 0, win = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                win = Math.min(win, i - from + 1);
                sum -= nums[from++];
            }
        }
        return (win == Integer.MAX_VALUE) ? 0 : win;
    }
}
public class Main{ 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
		int K = keyboard.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }
        keyboard.close();
        System.out.println(Solution.findLengthOfSmallestSubarray(a, K));
    }
}