import java.util.*;

class Solution {
    void computeLPSArray(String a, int M, int[]  lps) {
        int len = 0;
        int i;

        lps[0] = 0;
        i = 1;

        while (i < M) {
            if (a.charAt(i) == a.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
    public ArrayList<Integer> FindIndices(String a, String b) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int M = b.length();
        int N = a.length();
        int[] lps = new int[M + 1];

        int j  = 0;

        computeLPSArray(b, M, lps);
        int f = 0;
        int i = 0;
        while (i < N) {
            if (b.charAt(j) == a.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                f++;
                res.add (i - j + 1);
                j = lps[j - 1];
            }

            else if (i < N && b.charAt(j) != a.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        if (f == 0)
            res.add (-1);

        return res;
    }
}

public class Super {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
	    Solution Obj = new Solution();
        ArrayList<Integer> ans = Obj.FindIndices(a, b);
        for(int x : ans)
            System.out.print(x + " ");
    }
}

/*

import java.util.*;

class Solution {
    public ArrayList<Integer> FindIndices(String a, String b) {
        //Write your code here
		ArrayList<Integer> list = new ArrayList<>();
			int len1 = a.length();
			int len2 = b.length();
		// System.out.println(a.charAt(1) + "len 1");
		// System.out.println(len2 + " len 2");
		for(int i = 0; i < len1 - len2 + 1; i++) {
			boolean flag = true;
			int p = i;
			for(int j = 0; j < len2; j++) {
				if(a.charAt(p) != b.charAt(j)) {
					flag = false;
					break;
				}
				p++;
			}
			// System.out.println(p + "p kitni bar 3 huya");
			if(flag ) {
				list.add(i + 1);
			}
					
		}
		if(list.size() == 0) {
			list.add(-1);
		}
		return list;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
	    Solution Obj = new Solution();
        ArrayList<Integer> ans = Obj.FindIndices(a, b);
        for(int x : ans)
            System.out.print(x + " ");
    }
}

*/