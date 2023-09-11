public class second_largest {
   

//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int max =Integer.MIN_VALUE;
        int sec_max =Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i] > max)
            {
                sec_max = max;
                max = arr[i];
               // sec_max = max;
            }
            else if(arr[i] > sec_max && arr[i] != max)
            {
                sec_max = arr[i];
            }
           
            
        }
         if (sec_max == Integer.MIN_VALUE)
            {
                return -1;
            }
        return sec_max;
    }
} 
}
