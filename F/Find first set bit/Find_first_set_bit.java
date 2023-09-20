//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        // if(n == 0) return 0;
        // int count = 0;
        // String binary = Integer.toBinaryString(n);
        // int len = binary.length();
        // for(int i=len-1; i>=0; i--){
        //     count++;
        //     if(binary.charAt(i) == '1'){
        //         return count;
        //     }
        // }
        // return 0;
        int count = 0;
        if(n == 0)return 0;
        
        while(n>0){
            count++;
            if((n&1) == 1){
                return count;
            }
            n>>=1;
        }
        return 0;
            
    }
}