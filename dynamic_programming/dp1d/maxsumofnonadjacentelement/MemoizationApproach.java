package dp1d.maxsumofnonadjacentelement;

//Time Complexity :- O(N)   
//SpaceComplexity :- O(N) dp array space + O(N) recursion call stack space
public class MemoizationApproach {

    //Function
    public static int MaxSumWithNoAdjacentElement(int arr[]){
        
        //create dp array of size n+1
        int dp[] = new int[arr.length+1];

        //initialise all indexes with -1
        for(int i=0; i<dp.length; i++) dp[i] = -1;

        //calling helper function
        return helper(arr.length-1, arr, dp);
    }

    //helper Function
    public static int helper(int index, int arr[], int dp[]){
        
        //base case 1 
        /* if you’re reaching index 0 that means you 
           have not picked index 1, if you have not 
           picked index 1, you can definitely pick index 0
           that’s why returning arr[index] 
        */
        if(index == 0){
            dp[index] = arr[index];
            return dp[index];    
        }
        
        //base case 2
        if(index < 0) return 0;

        //check is value is already calculated
        if(dp[index] != -1){
            return dp[index];
        }
        
        //case of picking
        int picking = arr[index] + helper(index-2, arr, dp);

        //case of not picking
        int notPicking = 0 + helper(index-1, arr, dp);

        //store the result in the dp array
        dp[index] =  Math.max(picking, notPicking);
 
        //return the stored result
        return dp[index];
    }
}
