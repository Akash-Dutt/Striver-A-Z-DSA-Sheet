package dp1d.fibonacci;

//Time Complexity :- O(N)
//Space Complexity : O(1)
public class SpaceOptimizationApproach {
        
    //Given Function to Complete
    public static int fibonacci(int n){
        //base cases
        int prev0 = 0;  //0th element
        int prev1 = 1;  //1st element

        for(int i=2; i<=n; i++){
            // ith element = (i-1)th + (i-2)th element
            int curr = prev1 + prev0;
            prev0 = prev1;
            prev1 = curr;
        }

        //our answer will be in prev1 
        return prev1;
    } 
}
