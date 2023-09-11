import java.util.Arrays;

public class find_triplets_with_zero {
   

/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        
        // This code Need More Time Complexity O(n3)
       
       /* 
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        return true;
                    }
                }
            }
        }
       return false;   */
       
        
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    return true;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
            
        }
        return false;
    }
    
} 
}
