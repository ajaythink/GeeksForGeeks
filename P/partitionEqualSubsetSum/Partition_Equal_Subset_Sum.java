
// package P.partitionEqualSubsetSum;
import java.util.*;

class Partition_Equal_Subset_Sum {
    static public void main(String... args) {
        int arr[] = { 1, 5, 11, 5 };
        int N = arr.length;
        Solution ob = new Solution();
        int x = ob.equalPartition(N, arr);
        if (x == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

class Solution {
    static int equalPartition(int N, int arr[]) {
        int total = Arrays.stream(arr).sum();
        Arrays.sort(arr);
        if ((total & 1) != 0) {
            return 0;
        }
        int halfSum = total / 2;
        boolean arr1[][] = new boolean[N][halfSum + 1];
        return subSetSumHelper(0, halfSum, arr, N, arr1);
    }

    static int subSetSumHelper(int i, int halfSum, int arr[], int N, boolean arr1[][]) {
        if (halfSum == 0) {
            return 1;
        }
        if (i >= N || halfSum < 0) {
            return 0;
        }
        // int pick = subSetSumHelper(i+1, halfSum - arr[i], arr, N, arr1 );
        // int notpick = subSetSumHelper(i+1, halfSum, arr, N, arr1 );
        if (subSetSumHelper(i + 1, halfSum - arr[i], arr, N, arr1) == 1
                || subSetSumHelper(i + 1, halfSum, arr, N, arr1) == 1) {
            return 1;
        }

        return 0;
    }
}