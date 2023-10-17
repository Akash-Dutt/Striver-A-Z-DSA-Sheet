package dp_1d.houserobbertwo;
import java.util.Arrays;

//Time Complexity :- O(N) + O(N)  
//SpaceComplexity :- O(N) dp array space + O(N) recursion call stack space + O(N-1) for array nums1 + O(N-1) for array nums2
public class MemoizationApproach {

  //Given Function to Complete
  public static long houseRobber(int valueInHouse[]){
    int n = valueInHouse.length;
    if(n==1) return valueInHouse[0];  //if array has only single element, that will be max loot got by theif, so return that value as answer
    int [] nums1 = new int[n-1];    //to store value from 1 to n
    int [] nums2 = new int[n-1];    //to store value from 0 to n-1
    for(int i=0;i<n;i++){   //traversing over valueInHouse array & storing values according to given 'if' conditions
      if(i!=0) nums1[i-1] = valueInHouse[i];
      if(i!=n-1) nums2[i] = valueInHouse[i];
    }

    //creating dp array (initialised with -1) to store calculated values
    long dp[] = new long [n];
    Arrays.fill(dp, -1);

    //calling helper for first array nums1 & storing ans
    long ansnums1 = helper(n-2, nums1, dp);

    //resetting dp array values to -1 (for reusability of dp array)
    Arrays.fill(dp, -1);  

    //calling helper for second array nums2 & storing ans
    long ansnums2 = helper(n-2, nums2, dp);

    //max of both answer will be our final answer so return max of both
    return Math.max(ansnums1,ansnums2);
  }

  //helper Function
  public static long helper(int index, int arr[], long dp[]){
        
    //base case 1 
    /* if you’re reaching index 0 that means you 
       have not picked index 1, if you have not 
       picked index 1, you can definitely pick index 0
       that’s why returning arr[index] 
    */
    if(index == 0){
        dp[index] = arr[index];
        return dp[index];    
    }
    
    //base case 2
    if(index < 0) return 0;

    //check is value is already calculated
    if(dp[index] != -1){
        return dp[index];
    }
    
    //case of picking
    long picking = arr[index] + helper(index-2, arr, dp);

    //case of not picking
    long notPicking = 0 + helper(index-1, arr, dp);

    //store the result in the dp array
    dp[index] =  Math.max(picking, notPicking);

    //return the stored result
    return dp[index];
  }
}
