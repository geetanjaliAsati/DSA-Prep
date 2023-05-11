//maximum product of k elements in the array

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static int maxp3(int[] nums) {
		   int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
        //   Arrays.sort(nums);
        // int n = nums.length;
        // return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }

  
  public static void main (String[] args)
    {
		Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt();
            int[] A = new int[n];
            for(int i=0;i<n;i++)
            {
                A[i] = sc.nextInt();
            }
	    	System.out.println(maxp3(A));
		
	}
}
/* 
public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    // if signs of the minimum and maximum number are the same, simply return this.
    // Assume no overflow problem will occur.
    if(nums[0]*nums[nums.length-1] >= 0) return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    int l = 0, r = nums.length-1;
    int product = 1;
    // k = 3 in this case. But it should be extended to any number.
    // if count is odd, we should take the rightmost number. Otherwise, we should take the maximum product by comparing
    // the product of two leftmost elements and that of two rightmost elements.
    int count = 3;
    while(count > 0) {
        if(count % 2 == 1) {
            product *= nums[r--];
        }
        else {
            if(nums[r]*nums[r-1] > nums[l]*nums[l+1])
                product *= nums[r--] * nums[r--];
            else
                product *= nums[l++] * nums[l++];
            count--;
        }
        count--;
    }
    return product;
}
*/