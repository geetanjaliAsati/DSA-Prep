import java.util.*;
import java.io.*;
//Number reads the same Forwards and Backwards
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(n);
        int reverseNum = 0;
        int originalNum = n;
        while(n > 0) {
            int lastDigit = n % 10;
            reverseNum = ( reverseNum * 10) + lastDigit;
           n = n / 10;
        }
        if(reverseNum == originalNum) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}

// / public class Main{
    //   static boolean check(String s){
    //     if(s.length()<=1){
    //         return true;
    //       }
    //     boolean flag = s.charAt(0)==s.charAt(s.length()-1);
    //     return flag && check(s.substring(1,s.length()-1));
    //   }
    //     public static void main(String args[]){
    //         Scanner sc = new Scanner(System.in);
    //         String s = sc.next();
    //       System.out.println(check(s));
    //     }
    // }

    // 
     //Write your code here and print the required output
     //Tc=> No. of digits, sc =>O(1)
    //  String s = String.valueOf(n);The integer value of "n" is converted to a string
    //  int l = 0, r = s.length() - 1;
    //  boolean ok = true;
    //  while(l < r){
    //      if(s.charAt(l) != s.charAt(r)){
    //          ok = false;
    //          break;
    //      }
    //      l++;
    //      r--;
    //  }
    //  if(ok == true){
    //      System.out.println("true");
    //  }else{
    //      System.out.println("false");
    //  }