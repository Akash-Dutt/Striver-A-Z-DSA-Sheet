package dp_1d.frogjump;

//Time Complexity : O(2^N)
//Space Complexity : O(N) recursion call stack space
public class RecursiveApproach {

    //Given Function to Complete
    public static int frogJump(int n, int heights[]) {
        //changing the stairs from (1 to n) To (0 to n-1) // it won't affect the given question
        return helper(n-1, heights);
    }

    //helper function
    public static int helper(int n, int heights[]){

        //base case
        //standing at 0th stair. energy used will be 0
        if(n == 0){
            return 0;
        }

        //Taking one jump
        int oneJump = helper(n-1, heights) + Math.abs(heights[n] - heights[n-1]);

        //Taking two jump
        int twoJumps = Integer.MAX_VALUE;   //intialising with Int Max because just in case n <= 1 it will have a maximum value so that it gets neglected at the return statement
        if(n>1) twoJumps = helper(n-2, heights) + Math.abs(heights[n] - heights[n-2]);  //handling case, where value of 'n' could have gone negative

        //returning Minimum Energy used by the frog to reach from 0th to (n-1)th stair or can say 1st to nth stair
        return Math.min(oneJump, twoJumps);
    }
}
