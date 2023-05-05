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
 public static int fibonacci(int n){
    if(n<=1){
      return n;
    }
    return fibonacci(n-1)+fibonacci(n-2);
  }
  */