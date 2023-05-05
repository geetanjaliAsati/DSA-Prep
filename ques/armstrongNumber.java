// A number is called an Armstrong number if the sum of the digits raised to the power equal to the number of digits is equal to the number itself

import java.util.Scanner;

public class armstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalN = n;
        int reverseN = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            reverseN = (reverseN) + (lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }
        if(reverseN == originalN) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
