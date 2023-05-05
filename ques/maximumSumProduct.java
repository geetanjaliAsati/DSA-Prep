import java.util.*;



class Solution {
    public static int maxProduct(int[] a, int[] b) {
        //Write your code here
        int n=a.length;
        
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + a[i] * b[i];
        }
        int answer = prefixSum[n];
        for (int center = 0; center < n; center++) {
            int currentProduct = a[center] * b[center];
            for (int left = center - 1, right = center + 1; left >= 0 && right < n; left--, right++) {
                currentProduct += a[left] * b[right];
                currentProduct += a[right] * b[left];
                answer = Math.max(answer, currentProduct + prefixSum[left] + (prefixSum[n] - prefixSum[right + 1]));
            }
            currentProduct = 0;
            for (int left = center, right = center + 1; left >= 0 && right < n; left--, right++) {
                currentProduct += a[left] * b[right];
                currentProduct += a[right] * b[left];
                answer = Math.max(answer, currentProduct + prefixSum[left] + (prefixSum[n] - prefixSum[right + 1]));
            }
        }

        return answer;
    }
    
}



class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int ans = Solution.maxProduct(a, b);
        System.out.println(ans);
    }
}
