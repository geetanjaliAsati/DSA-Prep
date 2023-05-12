import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int cnt = 0, min = 10000000;
        for (int i = n - 1; i >= 0; i--) {
            if (min < a[i])
                cnt++;
            else
                min = a[i];
        }
        System.out.println(cnt);
    }

    // ===============QUESTION CHANGE PI============
    public static String changePi(String str) {
        // base condition

        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i')
            return "3.14" + changePi(str.substring(2));

        return str.charAt(0) + changePi(str.substring(1));
    }

    // =========SQUARE ROOT OF A NUMBER =================================
    public static void sqrt(int A) {
        // your code here
        if (A == 0) {
            System.out.println(0);
            return;
        }

        long lo = 1;
        long hi = (long) A;

        long pSqrt = 0;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            if (mid * mid == (long) A) {
                System.out.println(mid);
                return;
            } else if (mid * mid > (long) A) {
                hi = mid - 1;
            } else {
                pSqrt = mid;
                lo = mid + 1;
            }
        }

        System.out.println(pSqrt);
        return;
    }

    static int floorSqrt(int x) {
        // Base cases
        if (x == 0 || x == 1)
            return x;

        // Starting from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
}
