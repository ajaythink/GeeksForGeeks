class Solution {
    public static int findMinOperation(int n, int[][] matrix) {
        // code here
        int sum = 0;
        int row = 0;
        int col = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sum+=matrix[i][j];
            }   
            int temp1 = 0;
            for(int j=0; j<n; j++){
                temp1 += matrix[i][j];
            }
            row = Math.max(row, temp1);
            
            int temp2 =0;
            for(int j=0; j<n; j++){
                temp2 += matrix[j][i];   
            }
            col = Math.max(col, temp2);
            
        }
 
        int maxi = Math.max(row, col);
        
        return maxi*n - sum;
    }
}
        
