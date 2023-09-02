class Solution {
    public int removeElement(int[] nums, int val) {
        // Ek variable 'k' ko 0 ke barabar initialize karo. Yeh naya length ko track karne ke liye hai.
        int k = 0;
        // 'nums' array ke elements par ek ek karke loop chalaao.
      for (int i = 0; i<nums.length; i++){
          //Check karo ki current element index 'i' par 'val' se alag hai.
          if(nums[i] != val){
               // Agar current element 'val' se alag hai, toh usse position 'k' par copy karo.
                // Isse 'val' ko array se nikal diya jaata hai.
              nums[k] = nums[i];
               // 'k' ki value ko badhao taaki agli non-'val' element ke liye tayyar ho jaaye.
              k++;
          }
      }
          // 'k' ab naye modified array ki length ko represent karta hai.
        return k;
    }
}
