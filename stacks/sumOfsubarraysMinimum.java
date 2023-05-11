class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stp = new Stack<>();
        Stack<Integer> stn = new Stack<>();
        int al = arr.length;
        int []left = new int[al];
        int []right = new int[al];
		
		// find PLE
        for(int i=0;i<al;i++){    
            while(stp.size() >0 && arr[stp.peek()] > arr[i]){
                stp.pop();
            }
            left[i] = stp.isEmpty() ? i+1 : i - stp.peek();
            stp.push(i);
        }
		// find NLE
        for(int i=al-1;i>=0;i--){
            while(!stn.isEmpty() && arr[stn.peek()] >= arr[i]){
                stn.pop();
            }
            right[i] = stn.isEmpty() ? al - i : stn.peek() - i;
            stn.push(i);
        }
        // System.out.println("---");
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        long ans =0 , mod = 1000000007;
        for(int i=0;i<al;i++){
            ans = (ans + arr[i] * 1l * left[i] * right[i]) % mod;
        }
        return (int)ans;
    }
}