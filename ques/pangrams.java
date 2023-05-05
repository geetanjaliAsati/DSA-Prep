import java.util.*;
import java.io.*;
public class pangrams {
     public  static void isPangram(String s)
      {
           // TC=> O(N), length of the string, SC=> O(26), 26 letters of english
           boolean[] present = new boolean[26];
        int idx = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                idx = s.charAt(i) - 'a';
            }else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                idx = s.charAt(i) - 'A';
            }
            if(idx != -1){
                present[idx] = true;
            }
        }
        boolean absent = false;
        for(int i = 0; i < 26; i++){
            if(present[i] == false){
                absent = true;
            }
        }
        if(absent == false){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
    
    public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);
        
    }
}
/*
 
    
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
        int n = s.length();
        String ans = "pangram";
         for(int c = 0;c<26;c++){
             boolean flag =false;
             for(int i=0;i<n;i++){
                if(s.charAt(i) == ('a'+c) || s.charAt(i) == ('A'+c)){
                     flag=true;
                  // System.out.println("at i="+i+"at c="+c);
					System.out.println('a' + c);
                    break;
                }
             }
             if(flag==false){
                 ans = "not pangram";
                 break;
            }
         }
         System.out.println(ans);
 */