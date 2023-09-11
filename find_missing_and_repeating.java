public class find_missing_and_repeating {
   

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] res = new int[2];

        // First pass to find the duplicate
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                res[0] = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }

        // Second pass to find the missing element
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                res[1] = i + 1;
                break;
            }
        }

        return res;
    }
} 
}
