package dp1d.climbingstairs;

import java.util.Arrays;

//Time Complexity : O(N)
//Space Complexity : O(N) recursion stack space + O(N) for using dp array
public class MemoizationApproach {

    //Approach using recursion
    public static int countDistinctWayToClimbStair(int n){
        //create dp array of n+1 size
        int dp[] = new int[n+1];

        //update every element of array with -1 using inbuilt function Arrays.fill
        Arrays.fill(dp, -1);

        //calling helper function
        return Helper(n, dp);
    }

    //Helper Function
    public static int Helper(int n, int dp[]){
        //base case
        /* 
           1. we are handling base case for n==1, because if we don't stop at n==1. after taking "two steps"
              it will call function with n = -1  which is not favorable for this problem.  
           2. we are handling base case for n==0, because at n==2. after taking "two steps"
              it will call function with n = 0 which is totally favorable becuase we will stop at this value
        */
        if(n==0 || n==1){
            return dp[n] = 1;
        }
        
        //if the problem is already calculated, return the answer 
        if(dp[n] != -1){
            return dp[n];
        }

        //taking one step
        int oneStep = Helper(n-1, dp);

        //taking two steps
        int twoSteps = Helper(n-2, dp);

        //storing distinct ways in dp array and returning 
        return dp[n] = oneStep + twoSteps;
    }
}
