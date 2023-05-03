
import java.io.*;
import java.util.*;

class Solution {
// 	// Time Complexity: O(n^2) since we are traversing each window to 
// 	//remove all repetitions.
// // Auxiliary Space: O(1)
// //     public static int longestUniqueSubsttr(String str)
// //     {
// //        int n = str.length();
     
// //     // Result
// //     int res = 0;
     
// //     for(int i = 0; i < n; i++)
// //     {
         
// //         
// //         boolean[] visited = new boolean[256];
         
// //         for(int j = i; j < n; j++)
// //         {
             
// //             // If current character is visited
// //             // Break the loop
// //             if (visited[str.charAt(j)] == true)
// //                 break;
 
// //             // Else update the result if
// //             // this window is larger, and mark
// //             // current character as visited.
// //             else
// //             {
// //                 res = Math.max(res, j - i + 1);
// //                 visited[str.charAt(j)] = true;
// //             }
// //         }
 
// //         // Remove the first character of previous
// //         // window
// //         visited[str.charAt(i)] = false;
// //     }
// //     return res;
// // }
    public static int longestUniqueSubsttr(String S)
    {
		      HashMap<Character,Integer> map=new HashMap<>();

        int n=S.length();

        int j=0;

        int ans=0;

        for(int i=0;i<n;i++)

        {

            char ch=S.charAt(i);

            if(map.containsKey(ch))

            {

              j=Math.max(j,map.get(ch)+1);

            }

            ans=Math.max(ans,i-j+1);

            map.put(ch,i);

        }

        return ans;
}
    
}

public class Main {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution obj = new Solution();
        int len = obj.longestUniqueSubsttr(str);
        System.out.println(len);
    }
}

