import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,q;
        n=sc.nextInt();
        q=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
        Solution obj=new Solution();
        System.out.println(obj.minSubarray(a,n,q));		    
    }
}

class Solution
{
      public int minSubarray(int[] A,int n, int p) {
      int res = n, need = 0, cur = 0;
      for (int a : A)
          need = (need + a) % p;
      Map<Integer, Integer> last = new HashMap<>();
      last.put(0, -1);
      for (int i = 0; i < n; ++i) {
          cur = (cur + A[i]) % p;
          last.put(cur, i);
          int want = (cur - need + p) % p;
          res = Math.min(res, i - last.getOrDefault(want, -n));
      }
      return res < n ? res : -1;
  }
}

