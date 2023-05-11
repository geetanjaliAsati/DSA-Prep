class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
     int m = A.length, n = B.length, dp[][] = new int[m + 1][n + 1];
     for (int i = 1; i <= m; ++i)
         for (int j = 1; j <= n; ++j)
             if (A[i - 1] == B[j - 1])
                 dp[i][j] = 1 + dp[i - 1][j - 1];
             else
                 dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
     return dp[m][n];
 }
}

/*
 Input: nums1 = [2,5,1,2,5], nums2 = [10,5,2,1,5,2]
Output: 3
 */