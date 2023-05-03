import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        int ans = Solution.bestTimeToBuyAndSell(n,a);
        System.out.println(ans);
    }
    
}
 
 
class Solution {
  static int bestTimeToBuyAndSell(int n, int[] prices) {
	   int min = prices[0];
	   int maxProfit = 0;
	  for(int i = 0; i < n; i++) {
		  int cost = prices[i] - min;
		  maxProfit = Math.max(maxProfit, cost);
		  min = Math.min(min, prices[i]);
	  }
	  return maxProfit;
  }
}