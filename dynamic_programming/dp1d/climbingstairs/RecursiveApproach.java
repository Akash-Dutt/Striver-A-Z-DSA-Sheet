package dp1d.climbingstairs;

//Time Complexity : O(2^n)
//Space Complexity : O(N) recursion stack space
public class RecursiveApproach {
    
    //Given Function to Complete
    public static int countDistinctWayToClimbStair(int n){
        //base case
        /* 
           1. we are handling base case for n==1, because if we don't stop at n==1. after taking "two steps"
              it will call function with n = -1  which is not favorable for this problem.  
           2. we are handling base case for n==0, because at n==2. after taking "two steps"
              it will call function with n = 0 which is totally favorable becuase we will stop at this value
        */
        if(n==0 || n==1){ 
            return 1;
        }

        //taking one jump
        int oneStep = countDistinctWayToClimbStair(n-1);
        //taking two jumps
        int twoSteps = countDistinctWayToClimbStair(n-2);

        //returning all distinct ways
        return oneStep + twoSteps;
    }
}
