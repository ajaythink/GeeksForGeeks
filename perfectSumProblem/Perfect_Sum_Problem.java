package perfectSumProblem;

import java.io.*;
import java.util.*;

class Perfect_Sum_Problem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.perfectSum(arr, n, sum));
        }
    }
}
// } Driver Code Ends

class Solution {

    public int perfectSum(int arr[], int n, int sum) {
        // Your code goes here
        int MOD = 1000000007;
        int[] arr1 = new int[sum + 1];
        Arrays.fill(arr1, 0);
        arr1[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                arr1[j] = arr1[j] + arr1[j - arr[i]];
                arr1[j] = arr1[j] % MOD;
            }
        }
        return arr1[sum];

    }
}