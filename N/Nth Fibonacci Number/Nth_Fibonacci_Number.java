//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        // code here
        // 0 1 1 2 3 5 8
        int x,y;
        x=y=1;
        int mod = (int)1e9+7;
        for(int i=3; i<=n; i++){
            x = (x+y) %mod;
        
            int temp = x;
            x=y;
            y=temp;
        }
        return y;
    }
}
