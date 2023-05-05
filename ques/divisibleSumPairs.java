
import java.util.*;
import java.io.*;
/**
 Input

6 3          
1 3 2 6 1 2
Output

5
Input

4 5          
1 3 2 6 
Output

1
 */
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// length of given array
        int k = sc.nextInt();// divisor
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        int freq[] = new int[k];
        for (int i = 0; i < n; i++) {
            int rem = arr[i] % k;

            count += (freq[(k - rem) % k]);

            freq[rem]++;
            // System.out.println(freq[rem] + " ==>" + rem);
        }

        // System.out.println(count);
        // int count = 0;
        //N^2 Approach
        for(int i = 0;  i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if((arr[i] + arr[j] )% k == 0) {
                    count = count + 1;
                }
            }
        }
    }

}
/*
 // Java program to count pairs
// whose sum divisible by 'K'
import java.util.*;

class Count {
	public static int countKdivPairs(int A[], int n, int K)
	{
		// Create a frequency array to count
		// occurrences of all remainders when
		// divided by K
		int freq[] = new int[K];

		// Count occurrences of all remainders
		for (int i = 0; i < n; i++)
			++freq[A[i] % K];

		// If both pairs are divisible by 'K'
		int sum = freq[0] * (freq[0] - 1) / 2;

		// count for all i and (k-i)
		// freq pairs
		for (int i = 1; i <= K / 2 && i != (K - i); i++)
			sum += freq[i] * freq[K - i];
		// If K is even
		if (K % 2 == 0)
			sum += (freq[K / 2] * (freq[K / 2] - 1) / 2);
		return sum;
	}
	public static void main(String[] args)
	{
		int A[] = { 2, 2, 1, 7, 5, 3 };
		int n = 6;
		int K = 4;
		System.out.print(countKdivPairs(A, n, K));
	}
}

 */