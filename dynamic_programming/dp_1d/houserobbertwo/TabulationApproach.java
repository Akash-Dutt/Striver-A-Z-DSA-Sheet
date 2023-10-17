package dp_1d.houserobbertwo;

//Time Complexity :- O(N) + O(N)  
//Space Complexity :- O(N) because we're using dp array space + O(N-1) for array nums1 + O(N-1) for array nums2
public class TabulationApproach {

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
    //calling helper function for both arrays nums1 & nums2, and taking max of both
    return Math.max(helper(nums1), helper(nums2));
  }

  //helper Function
  public static int helper(int arr[]){

    //create an array of length n
    int dp[] = new int[arr.length];
    
    //initialise the basecase
    dp[0] = arr[0];

    //run for loop from 1 to n and calculate answer in bottom up manner
    for(int i=1; i<dp.length; i++){
        int picked = arr[i]; if(i>1)picked+=dp[i-2];
        int notPicked = 0 + dp[i-1];
        dp[i] = Math.max(picked, notPicked);    //store the answer at ith index of dp
    }

    //final answer would be at last index of the dp array, so return it
    return dp[dp.length-1];
  }
}
