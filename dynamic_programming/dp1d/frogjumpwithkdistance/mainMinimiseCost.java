package dp1d.frogjumpwithkdistance;

/* 
    Problem Link :- https://www.codingninjas.com/studio/problems/minimal-cost_8180930

    Problem Statement:-
        There is an array of heights corresponding to 'n' stones. You have to reach from stone 1 to stone ‘n’.
        From stone i, it is possible to reach stones i+1, i+2......i+k , and the cost incurred 
        will be |height[i] - height[j]|, where 'j' is the landing stone.
        Return the minimum possible total cost incurred in reaching the stone 'n'
*/

public class mainMinimiseCost {

    public static void main(String[] args) {
        
        //energy associated with jumps at each stone
        int height[] = {10,40,30,10};
        //possible k jumps (1 to k)
        int k = 2;
        //no of stones
        int n = height.length;

        //Approach - 1 Recursion 
        int RAns = RecursiveApproach.minimizeCost(n, k, height);
        System.out.println("Using Recursive Approach. Minimum Cost incurred to reach n(i.e "+ n +") stone by doing 1 to k(i.e "+ k +") jumps at each stone is : " + RAns + "\n");

        //Approach - 2 Memoization 
        int MAns = MemoizationApproach.minimizeCost(n, k, height);
        System.out.println("Using Memoization Approach. Minimum Cost incurred to reach n(i.e "+ n +") stone by doing 1 to k(i.e "+ k +") jumps at each stone is : " + MAns + "\n");


        // //Approach - 3 Tabulation
        // int TAns = TabulationApproach.frogJump(n,heights);
        // System.out.println("Using Tabulation Approach. Minimum Total Energy used by frog to reach n (" + n + "th) stair is: " + TAns + "\n");

        // //Approach - 4 Space Optimization
        // int SOAns = SpaceOptimizationApproach.frogJump(n, heights);
        // System.out.println("Using Space Optimization Approach. Minimum Total Energy used by frog to reach n (" + n + "th) stair is: " + SOAns + "\n");
    }
}
