class Solution {
    public static int arrayOperations(int n, int[] arr) {
        // code here
    //   simply you have to count non-zero subArray

int count=0;
        int zero=0;
        int i=0;
        boolean flag=true;
       while(i<n){
           if(arr[i]!=0&& flag){
               count++;
               flag=false;
               
           }
           else if(arr[i]==0){
               zero++;
               flag=true;
           }
           
           i++;
       }
       if(zero==0)return -1;
       if(zero==n)return 0;
       return count;
    
    }
}
        