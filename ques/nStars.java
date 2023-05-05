import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
       for(int i = 0; i < n; i++) {
		   System.out.print("* ");//row
	   }
		System.out.println();
		for(int i = 0; i < n ; i++) {
			System.out.println("*");//col
		}
    }
}