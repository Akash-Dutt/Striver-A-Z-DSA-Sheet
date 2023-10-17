package dp_1d.maxsumofnonadjacentelement;

//Time Complexity :- O(2^N)  
//Space Complexity :- O(N) recursion call stack space 
public class RecursiveApproach {

    //Given Function to Complete
    public static int MaxSumWithNoAdjacentElement(int arr[]){

        //last index
        int index = arr.length-1;  

        //calling helper function
        return helper(index, arr);
    }

    //helper function      
    public static int helper(int index, int arr[]){
        
        //base case 1 
        /* if you’re reaching index 0 that means you 
           have not picked index 1, if you have not 
           picked index 1, you can definitely pick index 0
           that’s why returning arr[index] 
        */
        if(index == 0) return arr[index]; 
        
        //base case 2
        if(index < 0) return 0;
        
        //case of picking
        int picking = arr[index] + helper(index-2, arr);

        //case of not picking
        int notPicking = 0 + helper(index-1, arr);

        //return max out of both cases
        return Math.max(picking, notPicking);
    }
}