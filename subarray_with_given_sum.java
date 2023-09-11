import java.util.ArrayList;

public class subarray_with_given_sum {
    

class Solution
{
    static ArrayList<Integer>subarraySum(int[]arr,int n, int s)
    {
       int l=0;
       int r=0;
       ArrayList<Integer>ans=new ArrayList<>();// storing starting and ending integers
       if(s==0)// agar sum zero rahega toh nahi milega subArray
       {
           ans.add(-1);
           return ans;
       }
       
       boolean isFound=false; 
       int sum=arr[0];
       
       while(r<n)
       {
           if(sum==s)// 12==12 this statement execute
           {
               isFound=true;
               break;
           }
           else if(sum<s)// 0 index 1 < 12
           {
              r++;// maybe array chya Legth chya baher hou shakta 
              if(r<n) // to check length ji aahe na ti array chya baher nahi jaila pahije
              sum+=arr[r];// 0 + arr[0]=0+1=1
           }
           else
           { 
               sum-=arr[l]; // agar hamara condition greater than s then 13-1=12
               l++;// to forward l value
           }   
             
       }
       if(isFound)// agar hame mila hai subArray 
       {
           ans.add(l+1); 
           ans.add(r+1);
           return ans;
       }
       ans.add(-1);// if the above if(isFound) condition is false then return  -1 agar hame sabArray nahi milta hai toh -1 return kar denge yesa question mai bola hain
       return ans;
    }
}
}
