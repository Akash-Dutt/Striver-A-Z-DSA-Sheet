package dp1d.houserobbertwo;

//Time Complexity :- O(2^N)*2  
//Space Complexity :- O(N) recursion call stack space + O(N-1) for array nums1 + O(N-1) for array nums2
public class RecursiveApproach {

    //Given Function to Complete
    public static long houseRobber(int valueInHouse[]){
      int n = valueInHouse.length;
      if(n==1) return valueInHouse[0];  //if array has only single element, that will be max loot got by theif, so return that value as answer
      int [] nums1 = new int[n-1];    //to store value from 1 to n of valueInHouse array
      int [] nums2 = new int[n-1];    //to store value from 0 to n-1 of valueInHouse array
      for(int i=0;i<n;i++){   //traversing over valueInHouse array & storing values according to given 'if' conditions
        if(i!=0) nums1[i-1] = valueInHouse[i];
        if(i!=n-1) nums2[i] = valueInHouse[i];
      }
      //calling helper function for both arrays nums1 & nums2, and taking max of both
		  return Math.max(helper(n-2,nums1), helper(n-2,nums2));
    }

    //helper function
    public static long helper(int index, int [] arr){
      
      //base case 1 
      /* if you’re reaching index 0 that means you 
          have not picked index 1, if you have not 
          picked index 1, you can definitely pick index 0
          that’s why returning arr[index] 
      */
      if(index==0) return arr[index];

      //base case 2
      if(index < 0) return 0;

      //case of picking
      long picking = arr[index] + helper(index-2, arr);

      //case of not picking
      long notPicking = 0 + helper(index-1, arr);

      //return max out of both cases
      return Math.max(picking, notPicking);
	}
}
