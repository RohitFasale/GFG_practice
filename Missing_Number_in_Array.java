

// User function Template for Java

// N=5
// A[]={1,2,3,5}
// Output:4

class Solution {
    int missingNumber(int arr[], int n) {
        // Your Code Here
        
        int total;// store sum of n number in total 
        total=(n+1)*(n)/2; // calculate the sum using the form
        
        // subtracting each number in the array from the total
        for(int i=0;i<n-1;i++)
        {
            total=total-arr[i];
        }
        
        return total;// returning the missing numbers
    }
}