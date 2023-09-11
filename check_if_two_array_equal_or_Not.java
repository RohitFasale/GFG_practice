import java.util.Arrays;

public class check_if_two_array_equal_or_Not {
    

//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0,j=0;i<N;i++,j++){
            if(A[i] != B[j]){
                return false;
            }
        }
        return true;
    }
}
}
