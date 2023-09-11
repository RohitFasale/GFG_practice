public class Kadanes_algorithm {
   

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        //  The constant Long.MIN_VALUE is the minimum value that a long variable can have. In other words, it is the smallest possible number that can be represented by a long variable. Its value is -9,223,372,036,854,775,808
        long maximum = Long.MIN_VALUE; 
        long sum =0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
            
            if(sum>maximum){
                maximum = sum;
            }
            if(sum<0){
                sum =0;
            }
        }
        return maximum;
        
    }
}   
}
