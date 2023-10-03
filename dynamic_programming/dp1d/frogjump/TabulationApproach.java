package dp1d.frogjump;

//Time Complexity : O(N)
//Space Complexity : O(N) for dp array
public class TabulationApproach {
    //function frog jump
    public static int frogJump(int n, int heights[]) {
        //changing the stairs from (1 to n) To (0 to n-1) // it won't affect the given question
        
        //cretaing dp array of size n to store values from 0 to n-1
        int dp[] = new int[n];

        //using helper function to calculate answers in the bottom up manner
        return helper(n-1, dp, heights);
    }

    //helper function
    public static int helper(int n, int dp[], int heights[]){
        
        //initialising the base case
        dp[0] = 0;
        dp[1] = Math.abs(heights[1] - heights[0]);

        //running loop from 2 to n and calculating Minimum energy required to reach nth stair
        for(int i=2; i<=n; i++){
            int oneJump = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
            int twoJumps = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            dp[i] = Math.min(oneJump, twoJumps);
        }

        //our answer will be at the last index of dp array so returning it
        return dp[n];
    }
}
