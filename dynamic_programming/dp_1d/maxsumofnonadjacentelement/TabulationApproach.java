package dp_1d.maxsumofnonadjacentelement;

//Time Complexity :- O(N)   
//Space Complexity :- O(N) because we're using dp array space
public class TabulationApproach {

    //Given Function to Complete
    public static int MaxSumWithNoAdjacentElement(int arr[]){
        
        //create an array of length n
        int dp[] = new int[arr.length];
        
        //initialise the basecase
        dp[0] = arr[0];

        //run for loop from 1 to n and calculate answer in bottom up manner
        for(int i=1; i<dp.length; i++){
            int picked = arr[i]; if(i>1)picked+=dp[i-2];
            int notPicked = 0 + dp[i-1];
            dp[i] = Math.max(picked, notPicked);    //store the answer at ith index of dp
        }

        //final answer would be at last index of the dp array, so return it
        return dp[dp.length-1];
    }
}
