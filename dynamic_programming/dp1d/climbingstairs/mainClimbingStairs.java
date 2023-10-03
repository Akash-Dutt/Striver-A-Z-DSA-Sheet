package dp1d.climbingstairs;

/* 
    Problem Link :- https://www.codingninjas.com/studio/problems/count-ways-to-reach-nth-stairs_798650
    
    Problem Statement:-
        You have been given a number of stairs. Initially, you are at the 0th stair, and you need to reach the Nth stair. 
        Each time you can either climb one step or two steps. You are supposed to return the number of distinct ways in 
        which you can climb from the 0th step to Nth step.
*/

public class mainClimbingStairs {
    public static void main(String[] args) {
        int n = 5;

        //Approach - 1 Recursion 
        int RAns = RecursiveApproach.countDistinctWayToClimbStair(n);
        System.out.println("Using Recursive Approach. No. of Distinct ways to reach n (" + n + "th) stair are: " + RAns + "\n");

        //Approach - 2 Memoization 
        int MAns = MemoizationApproach.countDistinctWayToClimbStair(n);
        System.out.println("Using Memoization Approach. No. of Distinct ways to reach n (" + n + "th) stair are: " + MAns + "\n");

        //Approach - 3 Tabulation
        int TAns = TabulationApproach.countDistinctWayToClimbStair(n);
        System.out.println("Using Tabulation Approach. No. of Distinct ways to reach n (" + n + "th) stair are: " + TAns + "\n");

        //Approach - 4 Space Optimization
        int SOAns = SpaceOptimizationApproach.countDistinctWayToClimbStair(n);
        System.out.println("Using Space Optimization Approach. No. of Distinct ways to reach n (" + n + "th) stair are: " + SOAns + "\n");

    }
}
