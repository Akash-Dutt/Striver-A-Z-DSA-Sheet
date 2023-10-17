package dp_1d.climbingstairs;

//Time Complexity : O(N)
//Space Complexity : O(1) (we're using 3 variables i.e constant space)
public class SpaceOptimizationApproach {
    
    //Given Function to Complete
    public static int countDistinctWayToClimbStair(int n){
        
        // writing base cases in terms of variables
        int prev0 = 1;
        int prev1 = 1;

        //running loop from 2 to n and calculating current ans using "curr" variable
        for(int i=2; i<=n; i++){
            int curr = prev1 + prev0;
            //Updating values
            prev0 = prev1;
            prev1 = curr;
        }

        //out final ans will be in prev1 so returning it
        return prev1;
    }
}
