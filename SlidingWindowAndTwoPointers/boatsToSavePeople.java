import java.io.*;
import java.util.*;

class Solution
{
      public static int numRescueBoats(int[] people, int limit) {
		  int n = people.length;
		 Arrays.sort(people);
		  int i = 0;
		  int j = n - 1;
		  int ans = 0;
		  while( i <= j ) {
			  ans++;//allocating boat to single or for two people
			  if(people[i] + people[j] <= limit) {
				  i++;
			  }
			  j--;//if we won't go inside the if condition that 
			  //means we will allocating the boat to the single people
		  }
		  return ans;

      }
}
public class Main {
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println(Solution.numRescueBoats(nums, k));
	}

}
