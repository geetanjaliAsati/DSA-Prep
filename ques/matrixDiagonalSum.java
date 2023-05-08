public int diagonalSum(int[][] mat) {
        
    int n = mat.length;
    int primaryDiagonal = 0;
    int secondaryDiagonal = n - 1;
    
    int sum = 0;
    
    for(int[] num : mat) {
        if(primaryDiagonal == secondaryDiagonal) {
             sum += num[primaryDiagonal++];
            secondaryDiagonal--;
        }
        else {
            sum += num[primaryDiagonal++] + num[secondaryDiagonal--];           
        }
    }
    
    return sum;
}

public int diagonalSum(int[][] mat) {
    int res = 0;
    int n = mat.length;
    for (int i=0; i<n; i++) {
        res += mat[i][i]; // Primary diagonals are row = column! 
        res += mat[n-1-i][i]; // Secondary diagonals are row + column = n-1!
    }
    return n % 2 == 0 ? res : res - mat[n/2][n/2]; // if n is a odd number, that mean we have added the center element twice!
}