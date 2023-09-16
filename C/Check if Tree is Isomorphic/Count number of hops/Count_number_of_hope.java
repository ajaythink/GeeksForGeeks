//package C.Check if Tree is Isomorphic.Count number of hops;

import java.util.*;
import java.io.*;
import java.lang.*;

class Count_number_of_hope implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new Count_number_of_hope(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to count the number of ways in which frog can reach the top.
    static long countWays(int n) {
        // add your code here
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;

        long n1 = 1;
        long n2 = 2;
        long n3 = 4;
        long ans = 0;
        for (int i = 4; i <= n; i++) {
            ans = (n1 + n2 + n3) % 1000000007;
            n1 = n2;
            n2 = n3;
            n3 = ans;
        }
        return ans;
    }

}
