package dp1d.maxsumofnonadjacentelement;

//Time Complexity :- O(N)
//Space Complexity :- O(1)
public class SpaceOptimizationApproach {

    //Given Function to Complete
    public static int MaxSumWithNoAdjacentElement(int arr[]){
        
        //write base case with the help of variables
        int prev1 = arr[0]; //currently at 0th index
        int prev2 = 0;  //currently at negative index

        //run the loop from 1 to n
        for(int i=1; i<arr.length; i++){
            //perform both cases 
            int picked = arr[i]; if(i>1)picked+=prev2;
            int notPicked = 0 + prev1; 
            int curr = Math.max(picked, notPicked); //calculate ans for every ith index
            //update or swaps the values
            prev2 = prev1;
            prev1 = curr;
        } 
        //answer will be on prev1 variable
        return prev1;
    }
}
