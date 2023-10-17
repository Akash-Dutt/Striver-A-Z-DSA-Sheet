package dp_1d.fibonacci;

//Time Complexity :- O(2^n)
//Space Complexity :- O(N) recursion stack space
public class RecursiveApproach {
    
    //Given Function to Complete
    public static int fibonacci(int n){
        //base cases
        if(n == 0 || n == 1){   
            return n;
        }

        //nth fibo no. = (n-1) fibo no. + (n-2) fibo no.
        return fibonacci(n-1) + fibonacci(n-2);
    } 
}
