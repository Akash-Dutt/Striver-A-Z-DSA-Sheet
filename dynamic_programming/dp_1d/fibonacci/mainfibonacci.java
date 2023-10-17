package dp_1d.fibonacci;

/*
    Problem Link :- https://www.codingninjas.com/studio/problems/nth-fibonacci-number_1115780

    Problem Statement:-
        You are given an integer ‘N’, your task is to find and return the N’th Fibonacci number.
*/

public class mainfibonacci {
    
    public static void main(String[] args) {
        //I have gave larger input so that you can see the time difference of execution of all the given approaches
        int nthTerm = 44;

        //fibonacci using Recursion
        System.out.println("fibonacci using Recursion : " + RecursiveApproach.fibonacci(nthTerm));

        //fibonacci using Memoization 
        System.out.println("fibonacci using Memoization :" + MemoizationApproach.fibonacci(nthTerm));
        
        //fibonacci using Tabulation
        System.out.println("fibonacci using Tabulation : " + TabulationApproach.fibonacci(nthTerm));     
        
        //fibonacci using Space Optimization
        System.out.println("fibonacci using Space Optimization : " + SpaceOptimizationApproach.fibonacci(nthTerm));
    }
}
