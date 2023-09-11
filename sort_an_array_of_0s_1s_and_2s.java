public class sort_an_array_of_0s_1s_and_2s {
    //User function template for Java

class Solution
{
    public static void sort012(int arr[], int n)
    {
        int low = 0;     // Pointer to the beginning of the array
        int high = n - 1; // Pointer to the end of the array
        int mid = 0;     // Pointer to the current element being processed
        
        while (mid <= high)
        {
            // If the current element is 0, swap it with the element at 'low' and move 'low' and 'mid' pointers forward.
            if (arr[mid] == 0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            // If the current element is 1, just move the 'mid' pointer forward.
            else if (arr[mid] == 1)
            {
                mid++;
            }
            // If the current element is 2, swap it with the element at 'high' and move 'high' pointer backward.
            else if (arr[mid] == 2)
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
}
