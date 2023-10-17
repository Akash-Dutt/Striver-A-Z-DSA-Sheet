package dp_1d.fibonacci;

import java.util.Arrays;

//Time Complexity :- O(N)
//Space Complexity :- O(N) for recursion call stack + O(N) for dp array
public class MemoizationApproach {

    //Given Function to Complete 
    public static int fibonacci(int n){
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }

    //helper function
    public static int helper(int n , int []dp){
        if(n == 0 || n == 1){
           return n;
        }

        //check if answer is already calculated
        if(dp[n] != -1){ 
            return dp[n];
        }

        //store ans and return
        return dp[n] = helper(n-1, dp) + helper(n-2, dp);
    }
}
