public static int numIdenticalPairs(int[] guestList) {
    HashMap<Integer, Integer> hm = new HashMap<>();
     
     int ans = 0;
     
     for(int friend:guestList)
     {
         int friendCount = hm.getOrDefault(friend,0);
         ans+=friendCount;
         hm.put(friend,friendCount+1);
     }
     
     
     return ans;
 }

 //Brute force
 int count=0;
        for(int i=0; i<n; i++)
        {
         for(int j=i+1; j<n; j++)
         {
           if(arr[i]==arr[j])
           {
               count++;
           }
         }

         // Without hashmap 
         int cnt[] = new int[101], res = 0;
    for (var n: nums)
        ++cnt[n];
    for (int i = 0; i <= 100; ++i)
        res += cnt[i] * (cnt[i] - 1) / 2;
    return res; 

    //==================================
    //FACING THE SUN
    int count = 1;//first buildings will definitely see sunrise
	  int maxBuilding = arr[0];
    	for(int i =1; i < n; i++) {
    	    if(maxBuilding < arr[i]) {
    	        count++;
				maxBuilding = arr[i];
    	    }
    	}

        //================================================================
        //Count Number of Nice Subarrays
        // A continuous subarray is called nice if there are k odd numbers on it.
        