import java.util.ArrayList;

public class Find_duplicates_in_an_array {
  

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        int[] freq = new int[n];
        
        for (int i = 0; i < n; i++)
            freq[arr[i]]++;
            
        for (int i = 0; i < n; i++)
            if (freq[i] > 1)
                list.add(i);
                
        if (list.size() == 0)
        {
            list.add(-1);
            return list;
        }
        
        return list;
    }
}  
}
