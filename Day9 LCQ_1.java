class Solution {
    public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer> nigga = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             nigga.put(nums[i],i);
//         }
//         for(int i=0; i<nums.length;i++){

//             int num = nums[i];
//             int rem = target - num;
//             if(nigga.containsKey(rem)){
//                 int index = nigga.get(rem);
//                 if(index==i)continue;
//                 return new int[]{i,index};
//             }

//         }
//         return new int[]{};
        int[] ans = new int[2];
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++)
                if(nums[i]+nums[j]==target){
                  ans[0]=i;
                        ans[1]=j;
                    return ans;

                }
        }
   return null;
        } 
}
