import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String s = "";
        Stack<String> st = new Stack<String>();
        for(int i=0;i<q;i++){
            int x = sc.nextInt();
            if(x==1){
                String inp = sc.next();
                st.push(s);
                s+=inp;
            }
            else if(x==2){
                int rem = sc.nextInt();
                st.push(s);
                s = s.substring(0,s.length()-rem);
            }
            else if(x==3){
                int k = sc.nextInt();
                System.out.println(s.charAt(k-1));
            }
            else{
                s = st.pop();
				System.out.println(s + "Hey");
            }
        }
    }
}