class Solution {
    public int missingNumber(int[] nums) {
        int a= 0;
        int b = 0;
        int n = nums.length;
        for(int i =0 ; i<=n; i++){
            a = a^i;
        }
        for(int i=0; i<n; i++){
            b = b^nums[i];
        }
        return (a^b);
    }
}
// Aapke diye gaye code me XOR (exclusive OR) ka istemal ek missing number dhundhne ke liye kiya gaya hai.
//   Is code ko step-by-step samjhane ke liye ek example dekhte hain:

// Example:

// Suppose nums array me 0 se 3 tak ke numbers hain, lekin ek number missing hai. Yani:
// nums = [0, 1, 3]
// Ab, code ko dekhte hain:
// 1.a aur b dono ko initially 0 se initialize kiya jata hai.

// 2.n me nums array ki length store ki jati hai. Yani ki, n ka value 3 hoga is example me.

// 3.Pehla for loop chala jata hai, jisme 0 se lekar n tak ke numbers ke XOR (bitwise exclusive OR)
//   result ko a me store kiya jata hai. Is loop se a me missing number ke XOR result aa jata hai.
//   a = 0^1^2^3 = 0^1^2^3 = 0
  
//   Ab a me missing number ka result hai.

// 4.Dusra for loop chala jata hai, jisme nums array ke saare elements ke XOR result ko b me store kiya jata hai.
//   Is loop se b me array me present numbers ka XOR result aa jata hai.
//   b = 0^1^3 = 0^1^3 = 2
  
//   Ab b me present numbers ka result hai.

// 5.Ab a aur b ka XOR operation kiya jata hai. a me missing number ka result hai aur b me present numbers ka result hai.
//   Is XOR operation se missing number mil jata hai.
//   result = a^b = 0^2 = 2
//   Ab result me missing number 2 aa gaya hai.

// Is code ka output 2 hoga, kyun ki 2 hi missing number hai nums array me.
