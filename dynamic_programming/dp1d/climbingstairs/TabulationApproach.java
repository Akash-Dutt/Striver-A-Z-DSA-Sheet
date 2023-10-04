package dp1d.climbingstairs;

//Time Complexity : O(N)
//Space Complexity : O(N) dp array space
public class TabulationApproach {

    //Given Function to Complete
    public static int countDistinctWayToClimbStair(int n){
        
        //creating dp array of size n+1
        int dp[] = new int[n+1];
        
        //initialising the base cases
        dp[0] = 1;
        dp[1] = 1;

        //running the loop from 2 to n calculating dp[i] while moving bottom to up
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        //our ans will be at last index of dp 
        return dp[n];
    }
}
