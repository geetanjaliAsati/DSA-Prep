import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i=0;i < n;i++) {
          arr[i] = sc.nextInt();
      }

      System.out.println(makeUnique(arr,n));
      
  }
    static int makeUnique (int[] arr,int n) {
        //TC=>O(N), SC=>O(N)
        int max = arr[0];
        for (int i = 0;i < n;i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        
        int[] temp = new int[max];

        for (int i = 0;i < n;i++) {
            temp[arr[i]-1]++;
        }
        int temp_max = temp[0];
        for (int i = 0; i < max;i++) {
            if (temp_max < temp[i]) {
                temp_max = temp[i];
            }
        }
        return n-temp_max;
    }

}
/**
 * 
 static int makeUnique (int[] arr,int n) {
     //Write your code here
		int[] freq = new int[101];
		int freqOfMxEle = 0;
		for(int i = 0; i < n; i++) {
			freq[arr[i]]++;
			if(freqOfMxEle < freq[arr[i]]) {
				freqOfMxEle = freq[arr[i]];
			}
		}
		return n - freqOfMxEle;
    }
 */