import java.util.*;

class Solution {
    public void pattern(int row_size) {
		// 2*N+1 lines
         for (int out = row_size; out >= -row_size; out--) {
            for (int in1 = 1; in1 <= Math.abs(out); in1++) {
                System.out.print(" ");
            }
            for (int in2 = row_size; in2 >= Math.abs(out); in2--)
                System.out.print("* ");
            System.out.println();
        }
    }
}

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.close();
        Solution solution = new Solution();
        solution.pattern(n);
    }
}