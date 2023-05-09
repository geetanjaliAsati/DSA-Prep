import java.util.*;
class Solution
{
       static int xorSubarrayXors(int arr[], int N) {
        //BRUTE FORCE IT WILL NOT WORK TIME LIMIT EXCEEDING ERROR
		   //we're initialising res 0 because 0 ^ a = a
		 //   int res = 0;
		 //   for(int i = 0; i < n; i++) {
			//    for(int j = i; j < n; j++) {
			// 		for(int k = i; k <= j; k++) {
			// 			res = res ^ arr[k];
			// 			System.out.println(res + "at index k = " + k);
			// 		}
			//    }
			//    System.out.println(res + "At index i = " + i);
		 //   }
			// return res;   

		    // ===================================OPTIMAL APPROACH
        int res = 0;
     
        // loop over all elements once
        for (int i = 0; i < N; i++)
        {
            // get the frequency of
            // current element
            int freq = (i + 1) * (N - i);
     
            // Uncomment below line to print
            // the frequency of arr[i]
             
            // if frequency is odd, then
            // include it in the result
            if (freq % 2 == 1)
                res = res ^ arr[i];
        }
     
        // return the result
        return res;
    }
}
public class Main {

    

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int ans = Solution.xorSubarrayXors(arr, n);
        System.out.print(ans);
        input.close();
    }
}

static int gameOfXor(int N , int[] A) {
    // code here
    if(N%2==0)
       return 0;
int ans=0;
for(int i=0;i<N;i=i+2){
   ans=ans^A[i];
}
return ans;
    //   int ans=0;

    // for(int i=0;i<N;i++){

    //     int a=i+1;

    //     int b=N-i;

        

    //     int freq=a*b;

    //     if((freq&1)==1) ans^=A[i];

    // }

    // return ans;
}