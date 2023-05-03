import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int target = sc.nextInt();
    int[] numbers = new int[n];
    for(int i=0; i<n; i++){
      numbers[i] = sc.nextInt();
      }
    // for(int i=0; i<n; i++)
    //   {
    //     for(int j=i+1; j<n; j++)
    //       {
    //       if(arr[i]+arr[j] == t)
    //         System.out.println(i+" "+j);
            
    //         }
    //   }

	   int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i;
            result[0] = map.get(target - numbers[i]);
         break;
        }
        
        map.put(numbers[i], i);
        
   
  }
	  for(int i = 0; i < 2; i++) {
		  System.out.print(result[i] + " ");
	  }
  }
}
