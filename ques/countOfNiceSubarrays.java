class Main{



public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  
  int n = sc.nextInt();
  int m= sc.nextInt();
    int a[] = new int[n];
  for(int i=0; i<n; i++){
    a[i]=sc.nextInt();
  }
    System.out.println(countSubarrays(a, n, m));
}



static int countSubarrays(int a[], int n, int m)
{

    int count = 0;

    // traverse for all possible
    // subarrays
    for (int i = 0; i < n; i++) 
    {
        int odd = 0;
        for (int j = i; j < n; j++) 
        {
            if (a[j] % 2 != 0)
                odd++;

            // if count of odd numbers
            // in subarray is m
            if (odd== m)
                count++;
          if(odd>m)
            break;
        }
    }

    return count;
}
}