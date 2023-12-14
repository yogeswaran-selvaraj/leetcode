//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isPerfectNumber(long N) {
        // code here
        long sum = 0;
        for(long i = 1; i * i <= N; i++){
            if(N % i == 0){
                if(N / i == i){
                    if(N / i != N){
                         sum += i;
                    }
                }
                else{
                    sum += i;
                    if(N / i != N){
                        sum += (N / i);
                    }
                }
            }
        }
        
        return sum == N ? 1 : 0;
    }
};