import java.util.*;
class Solution {
    public boolean RangeCheck(int[][] intervals, int a, int b) {
        boolean result = true;
        int size = intervals.length;
        int arr[] = new int[51];
        for (int i = 0; i < size; i++){
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++){
                arr[j]++;
            }
        }
        for (int i = a; i <= b; i++){
            if (arr[i] == 0) {
                return false;
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
	    Solution Obj = new Solution();
        if(Obj.RangeCheck(intervals, a, b))
            System.out.println("true");
        else
            System.out.println("false");
    }
}