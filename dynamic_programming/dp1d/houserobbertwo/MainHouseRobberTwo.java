package dp1d.houserobbertwo;

/* 
    Problem Link:- https://www.codingninjas.com/studio/problems/house-robber_839733

    Problem Statement :- 
        Mr. X is a professional robber planning to rob houses along a street. Each house has a certain amount of money hidden. 
        All houses along this street are arranged in a circle. That means the first house is the neighbor of the last one. 
        Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two 
        adjacent houses were broken into on the same night.
        You are given an array/list of non-negative integers 'ARR' representing the amount of money of each house. 
        Your task is to return the maximum amount of money Mr. X can rob tonight without alerting the police.
*/


public class MainHouseRobberTwo {

    public static void main(String[] args) {
        
        //money available in each houses
        int valueInHouse[] = {1,5,1,2,6};

        //Approach - 1 Recursion 
        long RAns = RecursiveApproach.houseRobber(valueInHouse);
        System.out.println("Using Recursive Approach. Mr.X can rob Maxmimum amount without alerting the police is : " + RAns + "\n");

        //Approach - 2 Memoization 
        long MAns = MemoizationApproach.houseRobber(valueInHouse);
        System.out.println("Using Memoization Approach. Mr.X can rob Maxmimum amount without alerting the police is : " + MAns + "\n");

        //Approach - 3 Tabulation
        long TAns = TabulationApproach.houseRobber(valueInHouse);
        System.out.println("Using Tabulation Approach. Mr.X can rob Maxmimum amount without alerting the police is : " + TAns + "\n");

        //Approach - 4 Space Optimization
        long SOAns = SpaceOptimizationApproach.houseRobber(valueInHouse);
        System.out.println("Using Space Optimization Approach. Mr.X can rob Maxmimum amount without alerting the police is : " + SOAns + "\n");
    }
}