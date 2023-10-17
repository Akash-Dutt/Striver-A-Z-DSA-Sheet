package dp_1d.houserobbertwo;

//Time Complexity :- O(N) + O(N)
//Space Complexity :- O(N-1) for array nums1 + O(N-1) for array nums2
public class SpaceOptimizationApproach {

  //Given Function to Complete
  public static long houseRobber(int valueInHouse[]){
    int n = valueInHouse.length;
    if(n==1) return valueInHouse[0];  //if array has only single element, that will be max loot got by theif, so return that value as answer
    int [] nums1 = new int[n-1];    //to store value from 1 to n
    int [] nums2 = new int[n-1];    //to store value from 0 to n-1
    for(int i=0;i<n;i++){   //traversing over
      if(i!=0) nums1[i-1] = valueInHouse[i];
      if(i!=n-1) nums2[i] = valueInHouse[i];
    }
    return Math.max(helper(nums1), helper(nums2));
  }

  //helper function
  public static long helper(int [] arr){
    int n = arr.length;
    int prev1 = arr[0];
    int prev2 = 0;
    for(int i=1;i<n;i++){
      int pick = arr[i]; if(i>1) pick += prev2;
      int nonPick = 0 + prev1;
      int currI = Math.max(pick, nonPick);
      prev2 = prev1;
      prev1 = currI;
    }
    return prev1;
  }
}
