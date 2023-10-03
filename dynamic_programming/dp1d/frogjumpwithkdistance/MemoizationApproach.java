package dp1d.frogjumpwithkdistance;

import java.util.Arrays;

//Time Complexity : O(N*K)
//Space Complexity : O(N) recursion call stack space + O(N) for dp array
public class MemoizationApproach {

    //Function
    public static int minimizeCost(int n, int k, int []height){
        
        //creating dp array of size n because we've to store values from 0 to n-1  
        int dp[] = new int[n];
        
        //initialising dp array with value -1
        Arrays.fill(dp,-1); 
    
        //passing n-1 because we have converted the problem into zero based indexing
        return helper(n-1, k, dp, height);
    }

    //Helper Function
    public static int helper(int n, int k, int dp[], int []height){
        //base case: 
        if(n==0){
            return 0;
        }

        //if the problem is already calculated, return from dp array
        if(dp[n] != -1){
            return dp[n];
        }

        //to keep the track of minimum Cost
        int minCost = Integer.MAX_VALUE;
        //j means jumps
        for(int j=1; j<=k; j++){
            if(n-j >=0){    //valid jumps are only those when f(n) >=0 , where n = n-j, i.e f(n-j>=0) are valids. this condition ignores function calling for negative values of n
                //n-1... n-2... n-3...n-k jumps -> recursive call will be on f(n-j) stones where j ranges from 1 to k
                int currCost = helper(n-j, k, dp, height) + Math.abs(height[n] - height[n-j]);
                minCost = Math.min(minCost, currCost);
            }
        }
        //store and return the value of mincost
        return dp[n] = minCost;
    }
}
