import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int[] rotatedArr = new int[n];
		for(int i = 0; i < n; i++) {
		    rotatedArr[(i + k) % n] = arr[i];
		   
		}
		for(int i = 0; i < n; i++) {
		    System.out.print(rotatedArr[i] + " ");
		}
	}
}