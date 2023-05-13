import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
		int nod = 0;
		int temp = n;
		while(temp > 0) {
			temp = temp / 10;
			nod++;
		}
		k = k % nod;
		if(k < 0) {
			k = k + nod;
		}
		int divi = 1;
		int mult = 1;
		for(int i = 1; i <= nod; i++) {
			if(i <= k) {
				divi = divi * 10;
			}
			else {
				mult = mult * 10;
			}
		}
		int quo = n / divi;
		int rem = n % divi;

		int rot = rem * mult + quo;
		System.out.println(rot);
        sc.close();
		
    }
}