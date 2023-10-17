package dp_1d.frogjump;

//Time Complexity : O(N)
//Space Complexity : O(1)
public class SpaceOptimizationApproach {

    //Given Function to Complete
    public static int frogJump(int n, int heights[]) {
        //changing the stairs from (1 to n) To (0 to n-1) // it won't affect the given question
        //using helper function to calculate answers using space optimization
        return helper(n-1, heights);
    }

    //helper function
    public static int helper(int n, int heights[]){
        
        // writing base cases in terms of variables
        int prev0 = 0;
        int prev1 = Math.abs(heights[1] - heights[0]);

        //running loop from 2 to n and calculating Minimum energy required to reach nth stair
        int curr = 0;
        for(int i=2; i<=n; i++){
            int oneJump = prev1 + Math.abs(heights[i] - heights[i-1]);
            int twoJumps = prev0 + Math.abs(heights[i] - heights[i-2]);
            curr = Math.min(oneJump, twoJumps);
            //updating variables
            prev0 = prev1;
            prev1 = curr;
        }

        //our answer will be at prev1 so returning it
        return prev1;
    }
}
