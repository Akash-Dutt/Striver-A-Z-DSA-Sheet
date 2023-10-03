package dp1d.frogjump;

import java.util.Arrays;

//Time Complexity : O(N)
//Space Complexity : O(N) recursion call stack space + O(N) for dp array
public class MemoizationApproach {
    //function frog jump
    public static int frogJump(int n, int heights[]) {

        //creating dp array of size n because we've to store values from 0 to n-1  
        int dp[] = new int[n];
        
        //initialising dp array with value -1
        Arrays.fill(dp,-1); 

        //changing the stairs from (1 to n) To (0 to n-1) // it won't affect the given question
        //using helper function to calculate minimum energy required to reach n-1 stair from 0th stair 
        return helper(n-1, dp, heights);
    }

    //helper
    public static int helper(int n, int dp[], int heights[]){

        //base case
        //standing at 0th stair. energy used will be 0
        if(n == 0){
            return 0;
        }

        //if the problem is already calculated, return from dp array
        if(dp[n] != -1){
            return dp[n];
        }

        //Taking one jump
        int oneJump = helper(n-1, dp, heights) + Math.abs(heights[n] - heights[n-1]);

        //Taking two jump
        int twoJumps = Integer.MAX_VALUE;   //intialising with Int Max because just in case n <= 1 it will have a maximum value so that it gets neglected at the return statement
        if(n>1) twoJumps = helper(n-2, dp, heights) + Math.abs(heights[n] - heights[n-2]);  //handling case, where value of 'n' could have gone negative

        // storing in dp array & returning Minimum Energy used by the frog to reach from 0th to (n-1)th stair or can say 1st to nth stair
        return dp[n] = Math.min(oneJump, twoJumps);
    }
}
