// for(int power = 1; power <= p; power++){
// ans *= n;
// }
// int res = 1;
// while(p-- > 0) {
// res = res * n;
// }

/*
 * ======Alt Matrix Sum=======
 * int N = sc.nextInt();
 * int[][] mat = new int[N][N];
 * for(int i=0;i<N;i++){
 * for(int j=0;j<N;j++){
 * mat[i][j]= sc.nextInt();
 * }
 * }
 * long blacksum = 0;
 * long whitesum = 0;
 * for(int i=0;i<N;i++){
 * for(int j=0;j<N;j++){
 * if((i+j)%2==0){
 * blacksum= blacksum+mat[i][j];
 * }
 * else{
 * whitesum= whitesum+mat[i][j];
 * }
 * }
 * }
 */

// Boolean Matrix Problem
// public class Main{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int m = sc.nextInt(), n = sc.nextInt();
// int[][] mat = new int[m][n];
// for(int i=0;i<m;i++){
// for(int j=0;j<n;j++){
// mat[i][j] = sc.nextInt();
// }
// }
// for(int i=0;i<m;i++){
// for(int j=0;j<n;j++){
// if(mat[i][j]==1){
// for(int k=0;k<n;k++){
// mat[i][k]=1;
// }
// }
// }
// }
// for(int i=0;i<m;i++){
// for(int j=0;j<n;j++){
// System.out.print(mat[i][j]+" ");
// }
// System.out.println();
// }
// }
// }

// x-occurrence
// public static int Cells(int n, int x) {
// if (n <= 0 || x <= 0 || x > n * n)
// return 0;
// int i = 0, count = 0;
// while (++i * i < x)
// if (x % i == 0 && x <= n * i)
// count += 2;
// return i * i == x ? count + 1 : count;
// }
// Or
// for(int i =1; i<=n ; i++)
// {
// if(x%i == 0 && x / i <= n)
// ans ++;
// }

// ------
/**
 * 
 * //Sum of Array Except self
 * 
 * public static int[] SumArrayExpectSelf(int[] nums, int n) {
 * //Write code here
 * int[] res = new int[n];
 * int totalSum = 0;
 * for(int i = 0; i < n; i++) {
 * totalSum += nums[i];
 * }
 * for(int i = 0; i < n; i++) {
 * res[i] = totalSum - nums[i];
 * }
 * return res;
 * }
 * 
 * OR
 * 
 * for(int i=0; i<n; i++)
 * // {
 * // int sum=0;
 * // for(int j=0; j<n; j++)
 * // {
 * // if(i!=j)
 * // {
 * // sum+=a[j];
 * // }
 * // }
 * // ans[i]=sum;
 * // }
 */

/**
 * // Second Smallest Element
 * int f=10000001, s=10000001;
 * for(int i=0; i<n; i++)
 * {
 * if(a[i] < f)
 * {
 * s = f;
 * f = a[i];
 * }
 * else if(a[i] != f && a[i] < s)
 * {
 * s = a[i];
 * }
 * }
 * System.out.println(s);
 */

/**
 * 
 * //A pangram is a string that contains every letter of the alphabet
 * 
 * 
 * import java.util.*;
 * import java.io.*;
 * 
 * public class Main {
 * public static void main(String args[]) {
 * 
 * 
 * Scanner sc = new Scanner(System.in);
 * String s = sc.nextLine();
 * int n = s.length();
 * String ans = "pangram";
 * for(int c = 0;c<26;c++){
 * boolean flag =false;
 * for(int i=0;i<n;i++){
 * if(s.charAt(i) == ('a'+c) || s.charAt(i) == ('A'+c)){
 * flag=true;
 * // System.out.println("at i="+i+"at c="+c);
 * System.out.println('a' + c);
 * break;
 * }
 * }
 * if(flag==false){
 * ans = "not pangram";
 * break;
 * }
 * }
 * System.out.println(ans);
 * }
 * }
 * 
 */

/*
 * 
 * public static int fibonacci(int n){
 * if(n<=1){
 * return n;
 * }
 * return fibonacci(n-1)+fibonacci(n-2);
 * }
 */

/*
 * //Recursive Digit Sum
 * public class Main {
 * public static void main(String args[]) {
 * //your code here
 * Scanner ob=new Scanner(System.in);
 * String n=ob.next();
 * int k=ob.nextInt();
 * long sum=0;
 * for(int i=0;i<n.length();i++)
 * {
 * sum+=Character.getNumericValue(n.charAt(i));
 * }
 * long a=sum*k;
 * System.out.println(a + "a kya hai");
 * System.out.println(superdigit(a));
 * }
 * public static long superdigit(long n)
 * {
 * System.out.println(n + "What is n");
 * if(n<10)
 * return n;
 * 
 * long y=(n%10)+superdigit(n/10);
 * return superdigit(y);
 * }
 * 
 * }
 * 
 * //===================
 *  static long superDigit(long n){
    if(n<10){
      return n;
    }
    return superDigit(sumOfDigit(n));
  }
  static long sumOfDigit(long n){
    if(n<10){
      return n;
    }
    return (n%10)+sumOfDigit(n/10);
  }

  =======================
  Time Complexity

O(|no of digits in n|*k)

Space Complexity

O(log(|no. of digits|))
     public static String superDigitHelper(String n)
    {        
        if(n.length() == 1){
            return n;
        }
        long sum = 0;
        for(int i = 0; i < n.length(); i++){
            sum += n.charAt(i) - '0';
        }
        n = Long.toString(sum);
        return superDigitHelper(n);
    }

    public static String superDigit(String str, int k)
    {        
       String n = new String("");
        for(int i = 0; i < k; i++){
            n += str;
        }
        return superDigitHelper(n);
    }


    =================FIND GCD
    public static int gcd(int a, int b)
    {
       
        if(a == 0)
        {
            return b;
        }
        return gcd(b% a, a);
    //    int r = a%b;
    //   if(r == 0)
    //     {
    //         return b;
    //     }
    //     return gcd(b, r);

     }

     ///Sum of way to form natural number
     public class Main{
  
static int f(int n, int k){
        if(n==0){
          return 1;
        }
    

      if(n<0 || n<k){
        return 0;
      }
    return f(n,k+1)+f(n-k,k+1);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(f(n,1));
  }
}
 */

 /*
  *
  //X-ISH WORD DETECTOR 
 public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String xstr = sc.next();
        int freq[] = new int[26];
		Arrays.fill(freq, 0);
		for(int i = 0; i < word.length(); i++) {
			freq[word.charAt(i) - 'a']++;
		}
		boolean flag = true;
		for(int i = 0; i < xstr.length(); i++) {
			if(freq[xstr.charAt(i) - 'a'] == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	
//========================
Scanner input = new Scanner(System.in); 
String s = input.next(); 
String t = input.next();
 int f[] = new int[26]; 
 for(int i =0; i < t.length(); i++)
  f[t.charAt(i) - 'a']++; 
  for(int j = 0; j < s.length(); j++)
  {
     if(f[s.charAt(j) - 'a'] >= 1)
     { f[s.charAt(j) - 'a']--; } }
      for(int i = 0; i < 26; i++){
         if(f[i] > 0){ 
          System.out.println("false");
           return;
           } 
          }
           System.out.println("true");
  */
//================================================================
  /* 
  
  
  //Minimizing Steps to Reduce an Integer equal to 1
  public static int count_minimum_operations(int n)
{
     if (n == 2)
    {
        return 1;
    }
    else if (n == 1)
    {
        return 0;
    }
    if (n % 3 == 0)
    {
        return 1 + count_minimum_operations(n / 3);
    }
    else if (n % 3 == 1)
    {
        return 1 + count_minimum_operations(n - 1);
    }
    else
    {
        return 1 + count_minimum_operations(n + 1);
    }
}

//OR
static int minSteps(int n) {
        if (n == 1) {
            return 0;
        }
        int minus = 1 + minSteps(n - 1);
        int divideBy3 = Integer.MAX_VALUE;
        if (n % 3 == 0) {
            divideBy3 = 1 + minSteps(n / 3);
        }
        int devideBy2 = Integer.MAX_VALUE;
        if (n % 2 == 0) {
            devideBy2 = 1 + minSteps(n / 2);
        }
        return Math.min(Math.min(minus, divideBy3), devideBy2);
    }
*/