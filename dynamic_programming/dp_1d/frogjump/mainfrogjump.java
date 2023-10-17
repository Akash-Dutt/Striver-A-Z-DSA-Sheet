package dp_1d.frogjump;

/* 
    Problem Link :- https://www.codingninjas.com/studio/problems/frog-jump_3621012

    Problem Statement:-
        There is a frog on the '1st' step of an 'N' stairs long staircase. The frog wants to reach the 'Nth' stair. 
        'HEIGHT[i]' is the height of the '(i+1)th' stair. If Frog jumps from 'ith' to 'jth' stair, the energy lost in the jump is given by 
        absolute value of ( HEIGHT[i-1] - HEIGHT[j-1] ). If the Frog is on 'ith' staircase, he can jump either to '(i+1)th' stair or 
        to '(i+2)th' stair. Your task is to find the minimum total energy used by the frog to reach from '1st' stair to 'Nth' stair.
*/

public class mainfrogjump {

    public static void main(String[] args) {
        
        //energy associated with jumps at each step
        int heights[] = {10,20,30,10};
        //no. of stairs
        int n = heights.length;

        //Approach - 1 Recursion 
        int RAns = RecursiveApproach.frogJump(n, heights);
        System.out.println("Using Recursive Approach. Minimum Total Energy used by frog to reach n (" + n + "th) stair is: " + RAns + "\n");

        //Approach - 2 Memoization 
        int MAns = MemoizationApproach.frogJump(n, heights);
        System.out.println("Using Memoization Approach. Minimum Total Energy used by frog to reach n (" + n + "th) stair is: " + MAns + "\n");

        //Approach - 3 Tabulation
        int TAns = TabulationApproach.frogJump(n,heights);
        System.out.println("Using Tabulation Approach. Minimum Total Energy used by frog to reach n (" + n + "th) stair is: " + TAns + "\n");

        //Approach - 4 Space Optimization
        int SOAns = SpaceOptimizationApproach.frogJump(n, heights);
        System.out.println("Using Space Optimization Approach. Minimum Total Energy used by frog to reach n (" + n + "th) stair is: " + SOAns + "\n");
    }
}
