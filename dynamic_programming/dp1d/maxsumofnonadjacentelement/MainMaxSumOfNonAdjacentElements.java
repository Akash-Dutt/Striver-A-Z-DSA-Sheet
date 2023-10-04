package dp1d.maxsumofnonadjacentelement;

/*
    Problem Link :- https://www.codingninjas.com/studio/problems/maximum-sum-of-non-adjacent-elements_843261

    Problem Statement :- 
        You are given an array/list of ‘N’ integers. You are supposed to return the maximum sum of 
        the subsequence with the constraint that no two elements are adjacent in the given array/list.
*/


public class MainMaxSumOfNonAdjacentElements {
    
    public static void main(String[] args) {
        //input array testcase
        int arr[] = {2, 1, 4, 9}; 
        
        // Approach Using Recursion:   TC:O(2^N),  SC:O(N)(call stack space)   
        System.out.print("Using Recursion, MAximum Sum of non adjacent element in a Subsequence is : ");
        System.out.println(RecursiveApproach.MaxSumWithNoAdjacentElement(arr)); 
        
        // Approach Using Memoization:  TC:O(N),  SC:O(N)(dp array space) + O(N)(call stack space) 
        System.out.print("Using Memoization, Maximum Sum of non adjacent element in a Subsequence is : ");
        System.out.println(MemoizationApproach.MaxSumWithNoAdjacentElement(arr));
    
        //Appraoch using Tabulation:  TC:O(N),  SC:O(N)(dp array space)
        System.out.print("Using Tabulation, MAximum Sum of non adjacent element in a Subsequence is : ");
        System.out.println(TabulationApproach.MaxSumWithNoAdjacentElement(arr));

        //Approach using Space Optimization:  TC:O(N),  SC:O(1)
        System.out.print("Using Space Optimization, MAximum Sum of non adjacent element in a Subsequence is : ");
        System.out.println(SpaceOptimizationApproach.MaxSumWithNoAdjacentElement(arr));
    }
}
