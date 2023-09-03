class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;           // Initialize 'i' to 0
        int n = nums.length;  // Calculate the length of the array 'nums'
        
        for (int j = 0; j < n; j++) {  // Start a loop from j = 0 to j = (n-1)
            if (nums[j] != 0) {  // Check if the current element at 'j' is not zero
                // Swap non-zero element at index 'j' with element at index 'i'
                int temp = nums[i];
                //for me - ith ko temp dala jth ko ith m dala jth m temp dala kyunki temp m ab ith hai
                nums[i] = nums[j];
                nums[j] = temp;
                i++;  // Increment 'i' to keep track of non-zero elements
            }
        }
    }
}
