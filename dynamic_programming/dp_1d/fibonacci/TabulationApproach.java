package dp_1d.fibonacci;

//Time Complexity: O(n)  
//Space Complexity: O(n)
public class TabulationApproach {

    //Given Function to Complete
    public static int fibonacci(int n){
        //create dp arrya of size n+1
        int storage[] = new int[n+1];
        
        //initialise the base cases
        storage[0] = 0;
        storage[1] = 1;

        //run loop from 2 to n and calculate answer
        for(int i=2; i<=n; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }

        //our answer will be at last index of dp array so return 
        return storage[n];
    }
}
