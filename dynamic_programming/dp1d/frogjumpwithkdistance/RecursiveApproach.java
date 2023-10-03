package dp1d.frogjumpwithkdistance;

//Time Complexity : O(K^N)
//Space Complexity : O(N) recursion call stack space
public class RecursiveApproach {

    //Function
    public static int minimizeCost(int n, int k, int []height){
        //passing n-1 because we have converted the problem into zero based indexing
        return helper(n-1, k, height);
    }

    //Helper Function
    public static int helper(int n, int k, int []height){
        //base case: 
        if(n==0){
            return 0;
        }
        
        int minCost = Integer.MAX_VALUE;
        //j means jumps
        for(int j=1; j<=k; j++){
            if(n-j >=0){    //valid jumps are only those when f(n) >=0 , where n = n-j, i.e f(n-j>=0) are valids. this condition ignores function calling for negative values of n
                //n-1... n-2... n-3...n-k jumps -> recursive call will be on f(n-j) stones where j ranges from 1 to k
                int currCost = helper(n-j, k, height) + Math.abs(height[n] - height[n-j]);
                minCost = Math.min(minCost, currCost);
            }
        }
        return minCost;
    }
}
