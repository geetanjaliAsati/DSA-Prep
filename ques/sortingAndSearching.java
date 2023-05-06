import java.util.Scanner;

class Solution {

    void bubbleSort(int[] arr, int n) {
        // tc: O(n^2), as we're traversing array two times
        // sc: O(1), as we're using constant space
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        /*
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < n - 1; j++) {
         * // Swap adjacent elements if they are in decreasing order
         * if (a[j] > a[j + 1]) {
         * swap(a[j], a[j + 1]);
         * }
         * }
         * }
         */
    }

    // ===========================================================
    public static int insertionSort(int[] a) {
        int n = a.length, ans = 0;
        for (int i = 1; i < n; i++) {
            int curr = a[i], j = i - 1;
            while (j >= 0 && a[j] > curr) {
                a[j + 1] = a[j];
                ans++;// how many shifs it is doing to sort the array
                j--;
            }
            a[j + 1] = curr;
        }
        return ans;
    }

}

    // +==========================================

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /*
     * The main function that implements QuickSort()
     * arr[] --> Array to be sorted,
     * low --> Starting index,0
     * high --> Ending index n-1
     */
    static void qSort(int arr[], int low, int high) {
        if (low < high) {
            /*
             * pi is partitioning index, arr[pi] is
             * now at right place
             */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            qSort(arr, low, pi - 1);
            qSort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        qSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
        }
        
    }

// MERGE SORT REMAINED
/*
 * 

 */

// FLOOR IN SORTED ARRAY
/*
 * // int max = -1;
 * // for(int i=0; i<n; i++){
 * // if(arr[i]<= x){
 * // max = i;
 * // }
 * // }
 * 
 * //your code here
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int x = sc.nextInt();
 * int[] arr = new int[n];
 * for(int i=0; i<n; i++)
 * {
 * arr[i] = sc.nextInt();
 * }
 * int low = 0, high = n-1, ans = -1;
 * while(low<=high)
 * {
 * int m = (low + high)/2;
 * if(arr[m] > x)
 * {
 * high = m-1;
 * }
 * else
 * {
 * ans = m;
 * low = m+1;
 * }
 * }
 * System.out.println(ans);
 */


 //=====================================
 //COUNT 1 IN SORTED BINARY ARRAY

 int n = sc.nextInt();
 int[] a = new int[n];
 for(int i=0; i<n; i++)
 {
     a[i] = sc.nextInt();
 }
 int low = 0, high = n-1, ans = -1;
 while(low <= high)
 {
     int m = (low+high)/2;
     if(a[m] == 0)
     {
         high = m-1;
     }
     else
     {
         ans = m;
         low = m+1;
     }
 }
 System.out.println(ans+1);


 //==============================
 //K-SUM

 int l = 0, r = (int)1e5+1; //100000+1
 while(r-l>1)//l+1<=r
 {
     int m = (l+r)/2;
     int s = 0;
     for(int i=0; i<n; i++)
     {
         s+=((a[i]+m-1)/m);
     }
     if(s<=k){
         r=m;
     }
     else
     {
         l=m;
     }
     
 }
 System.out.println(r);

 ///IMPORTANT Search in a Rotated Array
/*
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),target = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    int low = 0,high=n-1,ans=-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(a[mid]==target){
            ans=mid;break;
        }
        if(a[mid]>=a[low]){ //left part is sorted
            if(a[mid]>=target&&a[low]<=target){ //lies in left half
                high = mid-1;
            }
            else{   //does not lie in right half
                low = mid+1;
            }
        }
        else{   //right part is sorted
            if(a[mid]<=target&&a[high]>=target){ //lies in right half
                low = mid+1;
            }
            else{   // does not lie in right half
                high = mid-1;
            }
        }
    }
    System.out.println(ans);
}
}
*/

// MIN CUT TREE
int l=0, r=(int)1e5;
while(r-l>1)
{
    int m = (l+r)/2;
    int s = 0;
    for(int i=0; i<n; i++)
    {
        if(a[i] > m)//m to cut hai ishliye cut ki value minus karni 
          //padegi
        {
            s += a[i]-m;
        }
    }
        if(s <= k)  // m is good
        {
            r = m;
        }
        else 
        {
            l = m;  // m is bad
        }
        
        
        