package dp_1d.frogjumpwithkdistance;

//Time Complexity : O(N*K)
//Space Complexity: O(N) because we're using dp array
public class TabulationApproach {
    
    //Given Function to Complete
    public static int minimizeCost(int n, int k, int []height){
        //create dp array of size n , so that elements can be store 0 to n-1
        int dp[] = new int [n]; 

        //initialise the base case
        dp[0] = 0;

        //run the loop for 1 to n-1 th stone
        for(int i=1; i<n; i++){
            //calculate mincost for each jump from (i)th to (i+1)th stone 
            int minCost = Integer.MAX_VALUE;
            //from each ith stone there are possible 1 to k jumps
            for(int j=1; j<=k; j++){
                if(i-j >=0){    //valid jumps are only those when f(n) >=0 , where n = n-j, i.e f(n-j>=0) are valids. this condition ignores function calling for negative values of n
                    //n-1... n-2... n-3...n-k jumps -> recursive call will be on f(n-j) stones where j ranges from 1 to k
                    int currCost = dp[i-j] + Math.abs(height[i] - height[i-j]);
                    minCost = Math.min(minCost, currCost);
                }
            }
            //store the mincost for each stone in dp array
            dp[i] = minCost;
        }
        //our answer will be at last index of dp, so return it
        return dp[n-1];
    }
}
